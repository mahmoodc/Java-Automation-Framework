package Utils;

import Pages.DeskTopPages.DeskTop.HomePage.HomePageDeskTopImpl;
import Pages.Interfaces.IHomePage;
import Pages.Mobile.HomePage.MobileDeskTopImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.testng.annotations.Parameters;

public class GoogleGuice extends AbstractModule {

    private static  String screenType;


    public void TestScreen(String screen)
    {
        screenType = screen;
    }



    //screenType.equals("Desktop")
    //UIConfigurationSettings.Mode().equals("Desktop")
    //@Parameters({"screen"})
    @Override
    protected void configure() {
/*        if (screen.equals("Desktop")) {
            bind(IHomePage.class).to(HomePageDeskTopImpl.class).in(Singleton.class);
        }
        else if (screen.equals("Mobile")){
            bind(IHomePage.class).to(MobileDeskTopImpl.class).in(Singleton.class);
        }*/
        if (screenType.equals("Desktop")) {
            bind(IHomePage.class).to(HomePageDeskTopImpl.class).in(Singleton.class);
        } else {
            bind(IHomePage.class).to(MobileDeskTopImpl.class).in(Singleton.class);
        }

    }
}
