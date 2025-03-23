package main.abstraction.enums.tasks;

public interface DataAssignment {

    /**
     * 
     * @return the id of data receiving object
     */
    String getID();

    /**
     * Assigns the provided data to the receiving object.
     * @param key
     * @param value
     */
    void assign(String key, String value);
    
}
