import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.*;

public class BaseSetUp {

    public AndroidDriver driver;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
//        create capabliities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel");
        options.setApp(System.getProperty("user.dir")+"/src/main/java/resources/ApiDemos.apk");
        options.setAvd("Pixel");
        options.setCapability("appium:settings[ignoreUnimportantViews]", true);
//        options.setAppWaitActivity("io.appium.android.apis/io.appium.android.apis.ApiDemos");


//        create object for Android/iOS driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // For explicit wait but it's better to use server side wait

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void sample(){
        System.out.println("Samson");
    }
}
