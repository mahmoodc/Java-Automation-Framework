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
    /*public static string LookersUrl => GetValue("lookersUrl");
    public static string TaggartsUrl => GetValue("taggartsUrl");
    public static string UseDirectIrelandUrl => GetValue("useDirectIrelandUrl");
    public static string GoogleMapsUrl => GetValue("googleMapsUrl");
    public static string ManheimLiveChatUrl => GetValue("manheimLiveChatUrl");
    public static string NVMPUrl => GetValue("nvmpUrl");
    public static string SitecoreUrl => GetValue("sitecoreUrl");
    public static string PrivacyNoticeUrl => GetValue("privacyNoticeUrl");
    public static string TermsAndConditionsUrl => GetValue("termsAndConditionsUrl");
    public static string AboutUsUrl => GetValue("aboutUsUrl");
    public static string CareersUrl => GetValue("careersUrl");
    public static string CorporateProfileUrl => GetValue("corporateProfileUrl");
    public static string ModernSlaveryStatementUrl => GetValue("modernSlaveryStatementUrl");
    public static string CookiePolicyUrl => GetValue("cookiePolicyUrl");
    public static string CallChargesUrl => GetValue("callChargesUrl");
        #endregion

        #region Browser Settings
    public static string Environment => GetValue("environment");
    public static string Driver => GetValue("driver");
    public static string Mode => GetValue("mode");
        #endregion

        #region TestRail settings
    public static string TestRailRunCreation => GetValue("testRailRunCreation");
    public static string TestRailUrl => GetValue("testRailUrl");
    public static string TestRailUser => GetValue("testRailUser");
    public static string TestRailPassword => GetValue("testRailPassword");
    public static string TestRailMilestoneName => GetValue("testRailMilestoneName");
    public static string TestRailRunDescription => GetValue("testRailRunDescription");
        #endregion

        #region Social Media URLs
    public static string FacebookUrl => GetValue("facebookUrl");
    public static string FacebookLookersUrl => GetValue("facebookLookersUrl");
    public static string TwitterLookersUrl => GetValue("twitterLookersUrl");
    public static string YouTubeLookersUrl => GetValue("youTubeLookersUrl");
    public static string InstagramLookersUrl => GetValue("instagramLookersUrl");
    public static string GmailUrl => GetValue("gmailUrl");
        #endregion*/

}