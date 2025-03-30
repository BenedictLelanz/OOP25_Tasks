package main.documentation.tasks.myWebsite;

import main.documentation.tasks.server.Element;
import main.documentation.tasks.server.Path;

@Path(path = "/main/bestHome")
public class BestHome {

    @Element
    public String content() {
        return "This is the best home";
    }
    
}
