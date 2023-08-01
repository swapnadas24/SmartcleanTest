package com.matrixkiosk.tab.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.matrixkiosk.tab.util.TestUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Testbase {

   public static AndroidDriver<AndroidElement> driver;
   public static Properties props;
   static DesiredCapabilities caps;

    public void initialization() throws InterruptedException, IOException{
        
        // Load the properties File
        props = new Properties();
        FileInputStream objfile = 
        new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/matrixkiosk/tab/config/config.properties");
        props.load(objfile);

        caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "20080411");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.app.matrix_tablet_app");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.app.matrix_tablet_app.MainActivity");
        
       

        // Enter numbers and letters from keyboard
        caps.setCapability("unicodeKeyboard", "true");
        caps.setCapability("resetKeyboard", "true");  

        // lunch app
        driver = new AndroidDriver<AndroidElement>(new URL(props.getProperty("url")), caps);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMLICIT_WAIT, TimeUnit.SECONDS);

    }
        

}





