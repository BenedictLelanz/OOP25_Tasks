package main.preliminaryExam.animalSim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class MapConverter<S, T> {

    void saveMap(Map<S, T> map, String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (Entry<S, T> entry : map.entrySet()) {
                String result = entry.getKey() + ":" + entry.getValue() + "\n";
                bw.write(result, 0, result.length());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Map<S, T> readMap(String fileName, Function<String, S> keyParser, Function<String, T> valueParser) {
        Map<S, T> result = new HashMap<>();
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String readLine;
            while ((readLine = bf.readLine()) != null) {
                String[] args = readLine.split(":");
                S key = keyParser.apply(args[0]);
                T value = valueParser.apply(args[1]);
                result.put(key, value);
            }
            bf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
