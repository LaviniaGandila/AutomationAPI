package propertiesUtility;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesUtility {

    private Properties properties;

    public PropertiesUtility(String filename) {
        loadFile(filename);
    }

    @SneakyThrows(Exception.class)
    private void loadFile (String fileName){
        properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/"+fileName+".properties");
        properties.load(fileInputStream);
    }

    public HashMap<String, String> getAllData (){
        HashMap<String, String> testData = new HashMap<>();
        for (String key: properties.stringPropertyNames()){
            testData.put(key, properties.getProperty(key));
        }
        return testData;
    }
}