package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UIConfigurationSettings {
   /* private static String GetConnectionString(String key)
    {
        try
        {
            return ConfigurationManager.ConnectionStrings[key].ConnectionString;
        }
        catch (NullReferenceException)
        {
            throw new KeyNotFoundException($"Connection string: {key} is not found in App.config");
        }
    }*/

    private static String GetValue(String key) {
        FileInputStream inputStream = null;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\aonwuyal\\Documents\\Java Framework\\src\\main\\resources\\UIConfigurationSettings.properties"));
            return properties.getProperty(key);
        } catch (IOException error) {
            return ("Key " + key + " is not found in Properties file" + error);
            //throw error;
            //("Key " + key + " is not found in Properties file");
        }
    }


    public static String HomepageURL() {
        return GetValue("HomePageUrl");
    }

    public static String Browser() {
        return GetValue("Browser");
    }

    public static String Mode() {
        return GetValue("Mode");
    }
}