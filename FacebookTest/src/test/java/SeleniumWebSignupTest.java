import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebSignupTest {
    private WebDriver driver;
    public void start() throws InterruptedException {
        System.setProperty("web driver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(10000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        driver.findElement(By.id("user_username")).sendKeys("dupsy");
        driver.findElement(By.id("user_email")).sendKeys("dupsylen@mailinator.com");
        driver.findElement(By.id("user_password")).sendKeys("Dudu_1");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        driver.quit();
        









    }

}
