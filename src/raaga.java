import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class raaga extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.Button[@text='LATER']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='or Skip to Raaga']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();
		
		
		Point point = driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();

		TouchAction t = new TouchAction(driver);
		WebElement toggle = driver.findElementsById("com.raaga.android:id/toggle_notifyrecommend").get(0);
		t.tap(tapOptions().withElement(element(toggle))).perform();
		
		//t.tap(point.x+20, point.y+30).perform();
		//WebElement toggle = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		//t.tap(tapOptions().withElement(element(expandList))).perform();
		
		
		
		


		
	}

}
