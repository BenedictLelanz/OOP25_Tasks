package main.documentation.tasks.myWebsite;

import main.documentation.tasks.server.Element;

public class InnerPage {

    @Element(width=100, height=100, backgroundColor = "yellow")
    public Object e1() {
        return "Element 1";
    }

    @Element(width=100, height=100, backgroundColor = "yellow")
    public Object e2() {
        return "Element 2";
    }

}
