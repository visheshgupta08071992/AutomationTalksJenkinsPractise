import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass1 {

    public static WebDriver driver;

//    @BeforeMethod
//    public void beforeMethod(){
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
//        driver=new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MICROSECONDS);
//        driver.manage().window().maximize();
//    }
    @Test
    public void test1(){
//driver.navigate().to("www.AutomationTalks.com");
        System.out.println("Title of Test1 is" );

    }
    @Test
    public void test2(){
//        System.out.println("Title of Test2 is" + driver.getTitle());
    }
    @Test
    public void test3(){
     //   driver.navigate().to("www.AutomationTalks.com");
        System.out.println("Title of Test3 is" );
    }
    @Test
    public void test4(){
     //   driver.navigate().to("www.AutomationTalks.com");
        System.out.println("Title of Test4 is");
    }

//    @AfterMethod
//    public void afterMethod(){
//        driver.quit();
//    }
}
