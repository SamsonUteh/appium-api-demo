import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public AndroidDriver driver;

    public void configureAppium() throws MalformedURLException {
//        create capabliities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel");
        options.setApp(System.getProperty("user.dir")+"src/main/java/resources/ApiDemos.apk");


//        create object for Android/iOS driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.quit();

    }
}
