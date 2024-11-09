import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebSignupTest {
    private WebDriver driver;
    public void start() throws InterruptedException {
        System.setProperty("web driver.chrome.driver","resources/chromedriver.exe");
        //step 1: open your chrome driver
        driver = new ChromeDriver();
        // step 2: Input your Selenium Demo page URL
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(10000);
        // step 3: Maximize your browser
        driver.manage().window().maximize();
        // step 4: Click on signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        // step 5: input your username
        driver.findElement(By.id("user_username")).sendKeys("dupsy");
        // step 6: Locate the email address field and input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("dupsylen@mailinator.com");
        // step 7: locate the password field and input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("Dudu_1");
        //step 8: click on the Signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        // step 9: click on the user(Meaghan)
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        // step 10: click on Using Python with Selenium
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/a")).click();
        //step 11: click on Logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        driver.quit();











    }

}
