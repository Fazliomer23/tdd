package playground;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
     @Test
     public void FacebookTest(){
          WebDriver webDriver = new ChromeDriver();
          webDriver.get("https://facebook.com");
          webDriver.manage().window().maximize();
          String title = webDriver.getTitle();
          System.out.println(title);
          webDriver.quit();

     }

}
