package main.documentation.tasks.myWebsite;

import main.documentation.tasks.server.Element;
import main.documentation.tasks.server.Enums.Alignment;
import main.documentation.tasks.server.Path;

@Path(path = "/main")
public class Home {

    @Element(width=100, height=100, backgroundColor = "red", click="main/bestHome")
    public String main() {
        return "Click here to get to my subsite BestHome";
    }

    @Element(alignment = Alignment.ROW, backgroundColor = "blue")
    public Object split() {
        return new InnerPage();
    }

}