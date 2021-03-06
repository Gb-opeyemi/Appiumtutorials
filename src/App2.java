import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class App2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability("appPackage", "net.one97.paytm");
		cap.setCapability("appActivity", "net.one97.paytm.AJRJarvisSplash");
		
		AndroidDriver driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap );

	}

}
