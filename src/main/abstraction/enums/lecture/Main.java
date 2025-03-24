package main.abstraction.enums.lecture;

public class Main {



    public static void main(String[] args) {
        
        E e = E.E5;

        E.valueOf("E1")

        switch (e) {
            case E1: 
                System.out.println("e is e1");
            case E2: 
                System.out.println("Enum e is e2");
                break;
            case E3:

            default:
                System.out.println("wird ausgeführt, wenn keina  nderer case zutraf");
            
        }

        String a = "str";
        switch (a) {
            case "str":
                
                break;
        
            default:
                break;
        }

    }
    
}

enum E {
    E1, E2, E3, E4;
}
