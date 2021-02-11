import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;



public class gestures extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		TouchAction t = new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		
		 //driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		 driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

		 WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		 t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		 System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").isDisplayed());

	}

}
