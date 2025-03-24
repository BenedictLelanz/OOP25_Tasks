package main.abstraction.inheritance.lecture;

public class DifferenceInterfaceInheritance {

    public static void main(String[] args) {
        // p !ist ein! PhysicalDevice
        MobilePhone p = new MobilePhone();
        // p !kann! Fotos machen, Anrufe tätigen...
        // Unterschied in Beziehungen

        // Ein und das selbe Objekt in zwei verschiedenen Ausprägungen -> das geht mit Vererbung nicht
        makeVideo(p);
        callPhoneNumber(p, "110");

        // Vererbung: "ist ein"
        p.getTemperatur(); // Alle phyischen Geräte haben eine aktuelle Temperatur...

    }
    
    /**
     * Dynamisch. Ich kann hier alle möglichen Objekte hineinstecken, die "Camera können"
     * @param camera
     */
    static void makeVideo(Camera camera) {
        for (int i = 0; i < 1000; i++)
            camera.takePhoto();
    }
    /**
     * Ebenso dynamisch, das Objekt muss "Telephon können".
     * @param t
     * @param n
     */
    static void callPhoneNumber(Telephon t, String n) {
        t.callPerson(n);
    }

}

interface Camera {
    void takePhoto();
}

interface Telephon {
    void callPerson(String phoneNumber);
}

class MobilePhone extends PhysicalDevice implements Camera, Telephon {

    @Override
    public void callPerson(String phoneNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callPerson'");
    }

    @Override
    public void takePhoto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takePhoto'");
    }
    
}

class PhysicalDevice {
    int getTemperatur() {
        return (int) (Math.random() * 100);
    }
}