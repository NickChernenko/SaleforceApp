package properties_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


    public static String appConfigReader(String key) throws IOException {

        File f = new File("src/application_properties/app_config.properties");
        Properties properties;
        FileReader fr = new FileReader(f);
        properties = new Properties();
        properties.load(fr);

        return properties.get(key).toString();
    }

}
