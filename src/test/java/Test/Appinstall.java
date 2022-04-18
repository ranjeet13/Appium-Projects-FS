package Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Appinstall 
{
	MobileDriver<MobileElement> dr;
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		
		    DesiredCapabilities cap = new DesiredCapabilities();
			
		    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 7");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
			cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			
	        cap.setCapability(MobileCapabilityType.APP, "/home/ranjeet/Downloads/app-prod_vezaone-release-1.apk");
	        
	       URL url = new URL ("http://127.0.0.1:4723/wd/hub");
	       cap.setCapability("autoGrantPermissions", "true");
	       AndroidDriver<MobileElement> dr=new AndroidDriver<MobileElement> (url,cap);
	  
	   		
	
	   	    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   	    
	        dr.findElement(By.id("com.veza.pos:id/btn_skip")).click();
	   		
	      
	     	 
	   		
	   		dr.findElement(MobileBy.id("com.veza.pos:id/autoCompleteTvUserName")).sendKeys("demo@futurescapetech.com");
	   		dr.findElement(MobileBy.id("com.veza.pos:id/loginBtn")).click();
	   		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		dr.findElement(MobileBy.id("com.veza.pos:id/passwordEdtTxt")).sendKeys("demo@SAPH");
	   		dr.findElement(MobileBy.id("com.veza.pos:id/loginBtn")).click();
	   		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		dr.findElement(By.id("com.veza.pos:id/btn_next")).click();
	   	
	   		
	   		dr.findElement(MobileBy.className("android.widget.ImageButton")).click();
	   		
	   	   AndroidElement list = (AndroidElement) dr.findElement(By.id("com.veza.pos:id/design_menu_item_text"));
	   	   
	    	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	
	    
	    	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	
	    	try
	    	{
	    		
	    		dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.veza.pos:id/design_navigation_view\")).scrollForward()"));
	    		
	    	}
	    	catch(Exception exception)
	       	{
	    		  System.out.println("Error :- " +exception);	    		
	        }
	    	
 	            dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	
	    	    dr.findElement(By.xpath("//android.widget.CheckedTextView[@text='Settings']")).click();
	    	  
	    	  
	    	    try
		    	{
		    		
		    		dr.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\")).scrollForward()"));
		    		
		    	}
		    	catch(Exception exception)
		       	{
		    		  System.out.println("Error :- " +exception);	    		
		        }
              
	   		    dr.findElement(MobileBy.id("com.veza.pos:id/xRLAppSetting")).click();
	  	     
	   		    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		  
	   		    dr.findElement(MobileBy.id("com.veza.pos:id/xRLChangePOSMode")).click();
	   		    
	   		    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		    
	   		    dr.findElement(MobileBy.id("com.veza.pos:id/xRBSuperPOS")).click();
	   		    
	   		    dr.findElement(MobileBy.id("com.veza.pos:id/menu_save")).click();
	   		    
	   		    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   		    
	   		    dr.findElement(MobileBy.id("com.veza.pos:id/xTvProductName")).click();

	   		    dr.findElement(MobileBy.id("android:id/button1")).click();
	   		    
	   		    dr.findElement(MobileBy.id("com.veza.pos:id/xTvProductName")).click();
	   		 
	   		    dr.findElement(By.xpath("//android.widget.TextView[@text='LIPTON YELLOW LABEL TEA 200G']")).click();
	   		    
	   		    
	   		    
	   		    dr.findElement(By.xpath("//android.widget.TextView[@text='CASH']")).click();
	   		    
	   		    //Code changes ss
	   		    
		}

   	    
}
