package main.abstraction.enums.tasks;

import java.util.HashMap;
import java.util.Map;

public enum StudiengangImpl implements Studiengang, DataAssignment {

    IIb(25,30), IIm(9,15), IWb(12,20), AIb(18,25), DSb(15,20);

    Map<String, String> data = new HashMap<>();

    int studierende;
    int studienplaetze;

    StudiengangImpl(int studierende, int studienplaetze) {
        this.studierende = studierende;
        this.studienplaetze = studienplaetze;
    }

    @Override
    public String getBezeichner() {
        return name();
    }

    @Override
    public int getStudienplaetzte() {
        return this.studienplaetze;
    }

    @Override
    public int getStudierende() {
        return this.studierende;
    }

    @Override
    public String getID() {
        return name();
    }

    @Override
    public void assign(String key, String value) {
        this.data.put(key, value);
    }

    @Override
    public String toString() {
        return "Studiengang[" + name() + ", studienplätze: " + getStudienplaetzte() +
            ", studierende: " + getStudierende() + ", props: " + this.data + "]";
    }
    
}
