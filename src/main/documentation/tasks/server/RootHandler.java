package main.documentation.tasks.server;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URI;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import main.documentation.tasks.myWebsite.PageList;

class RootHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        URI requestURI = exchange.getRequestURI();
        Server.getInstance().setCurrentQuery(requestURI.getQuery());
        String response = handle(requestURI.getPath());
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private String handle(String path) {
        for (Class<?> c : PageList.PAGES) {
            if (c.isAnnotationPresent(Path.class)) {
                Path pathAnnotation = c.getAnnotation(Path.class);
                if (pathAnnotation.path().equals(path)) {
                    return buildPage(c);
                }
            }
        }
        return "No definition found for " + path;
    }

    private String buildPage(Class<?> clazz) {
        StringBuilder result = new StringBuilder();
        try {
            Object page = clazz.getConstructor().newInstance();
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Element.class)) {
                    Element element = method.getAnnotation(Element.class);
                    Object content = method.invoke(page);
                    result.append(recursivePageBuild(element, content));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.append(e.getMessage());
        }
        return result.toString();
    }

    private String recursivePageBuild(Element element, Object content) {
        String result = String.format(
            "<div class='element' %s style='padding: 1rem; margin: 1rem; border: 1px solid white;"+
                                        "border-radius: 0.5rem; box-shadow: 0 0 5px 5px white;"+
                                        "justify-content: center; align-items: center;"+
                                        "width: %spx; height: %spx; background: %s; color: %s;"+
                                        "display: flex; flex-direction: %s;'>%s</div>",
            (element.click().equals("") ? "" : "onclick=\"location.href='"+element.click()+"'\""),
            element.width(), element.height(), element.backgroundColor(), element.textColor(), 
            element.alignment().name().toLowerCase(),
            (content instanceof String ? content.toString() : buildPage(content.getClass()))
        );
        return result;
    }

}
