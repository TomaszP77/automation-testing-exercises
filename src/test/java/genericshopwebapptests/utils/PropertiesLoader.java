package genericshopwebapptests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    public static String loadProperty(String propertyName) throws IOException {
        InputStream input = new FileInputStream("src/test/resources/user.properties");
        Properties properties = new Properties();
        properties.load(input);
        return properties.getProperty(propertyName);
    }
}
