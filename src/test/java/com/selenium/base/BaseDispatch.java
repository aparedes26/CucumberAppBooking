package test.java.com.selenium.base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeTest;

public class BaseDispatch {

public static AppiumDriver<MobileElement> driverAppium;
	

    @BeforeTest
	public void startAppium(AppiumDriver<MobileElement> driverAppium) throws MalformedURLException, InterruptedException {
			
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "R28M50CL9WB");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "10.0.0");
	cap.setCapability("appPackage", "com.booking");
	cap.setCapability("appActivity", ".startup.HomeActivity t1863");
	BaseDispatch.driverAppium = new AppiumDriver<MobileElement>(cap);
	//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);  
	BaseDispatch.driverAppium.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	
	}
		

}
