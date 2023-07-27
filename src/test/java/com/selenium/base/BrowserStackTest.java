package test.java.com.selenium.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserStackTest {
	
public static AppiumDriver<MobileElement> driverAppium;
	

@BeforeTest
	public void startAppium() throws MalformedURLException, InterruptedException {
			
		
	DesiredCapabilities cap = new DesiredCapabilities();
	
	
	//cap.setCapability("server", "hub-cloud.browserstack.com");
	cap.setCapability("username", "aristidesparedes_PGc4li");
	cap.setCapability("access_key", "RnuEp8DjjgAs48vmo2vs");
	cap.setCapability("app", "bs://12ebea1f7d9aa37f1036117fabd99ee967ed7a5e");
	cap.setCapability("device", "Samsung Galaxy S10e");
	cap.setCapability("os_version", "9.0");
	cap.setCapability("build", "browserstack-build-1");
	cap.setCapability("name", "first_test");
	cap.setCapability("project", "First TestNg Android Project");
	cap.setCapability("browserstack.debug", "true");
	cap.setCapability("platformName", "Android");
	
	cap.setCapability("appPackage", "com.geosort.dispatch"); 
	cap.setCapability("appActivity", ".MainActivity");  
	driverAppium= new AppiumDriver<MobileElement>(cap);
	//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"),cap);  
	//driverAppium.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); */
	
	}
		

}
