package Utils;

import Pages.DeskTopPages.DeskTop.HomePage.HomePageDeskTopImpl;
import Pages.Interfaces.IHomePage;
import Pages.Mobile.HomePage.MobileDeskTopImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class GoogleGuice extends AbstractModule {
    @Override
    protected void configure() {
        if (UIConfigurationSettings.Mode().equals("Desktop")) {
            bind(IHomePage.class).to(HomePageDeskTopImpl.class).in(Singleton.class);
        } else {
            bind(IHomePage.class).to(MobileDeskTopImpl.class).in(Singleton.class);
        }
    }
}
