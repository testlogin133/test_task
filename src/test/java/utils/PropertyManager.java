package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyManager {

    static FileInputStream stream;
    public static Properties config = new Properties();

    public static void readFromProperty() {
        try {
            stream = new FileInputStream("src/test/resources/config.properties");
            config.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
