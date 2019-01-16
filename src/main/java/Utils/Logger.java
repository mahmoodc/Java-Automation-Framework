package Utils;

import org.apache.log4j.LogManager;

public class Logger {

    //The configuration of log4j is in resources\log4j.xml
    //Get the classname of the current executing method
    private static org.apache.log4j.Logger _logger =  LogManager.getLogger(Thread.currentThread()
            .getStackTrace()[2].getClassName());

    public static org.apache.log4j.Logger log()
    {
        return _logger;
    }
}
