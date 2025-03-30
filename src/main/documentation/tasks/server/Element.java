package main.documentation.tasks.server;

import java.lang.annotation.*;

import main.documentation.tasks.server.Enums.Alignment;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Element {
    String click() default "";
    int width() default -1;
    int height() default -1;
    String backgroundColor() default "white";
    String textColor() default "black";
    Alignment alignment() default Alignment.COLUMN;
}
