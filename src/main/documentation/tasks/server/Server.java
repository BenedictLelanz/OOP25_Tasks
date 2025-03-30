package main.documentation.tasks.server;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {

    private static Server server;

    public static void main(String[] args) throws IOException {
        server = new Server();
    }

    public static Server getInstance() {
        return server;
    }

    private Server() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new RootHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server läuft auf Port 8080...");
    }

    private String query;

    void setCurrentQuery(String query) {
        this.query = query;
    }

    String getCurrentQuery() {
        return this.query;
    }
    
}