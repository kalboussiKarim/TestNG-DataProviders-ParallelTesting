import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParamTest {

    WebDriver driver;

    @BeforeClass
    void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    void testLogo(){
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(status);
    }

    @Test(priority = 2)
    void testTitle(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @Test(priority = 3)
    void testURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
