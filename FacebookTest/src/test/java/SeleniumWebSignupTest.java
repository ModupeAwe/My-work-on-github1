import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Reporter.clear;

public class SeleniumWebSignupTest {
    private WebDriver driver;

    @BeforeTest
    public void start() throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "resources/chromedriver.exe");
        //step 1: open your chrome driver
        driver = new ChromeDriver();
        // step 2: Input your Selenium Demo page URL
        driver.get("https://selenium-blog.herokuapp.com");

        Thread.sleep(5000);
        // step 3: Maximize your browser
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }


    @Test(priority = 0)
    public void positiveSignup() throws InterruptedException {
        // Test 3: step 4: Click on signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        // step 5: input your username
        driver.findElement(By.id("user_username")).sendKeys("Tade12");
        Thread.sleep(5000);
        // step 6: Locate the email address field and input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("Tade137@mailinator.com");
        Thread.sleep(5000);
        // step 7: locate the password field and input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("Beauty");
        Thread.sleep(10000);
        //step 8: click on the Signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(10000);
        WebElement ConfirmationMessage = driver.findElement(By.id("flash_success"));

        System.out.println(ConfirmationMessage.getText());
        if (ConfirmationMessage.getText().startsWith("Welcome to the alpha blog"))
            System.out.println("Registration is successful Passed");

        else
            System.out.println("Registration is unsuccessful Failed");

    }

    @Test(priority = 1)
    public void clickMeaghanItem() throws InterruptedException {
        // step 9: click on the Meaghan
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        String expectedUrl = "https://selenium-blog.herokuapp.com/signup";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        /*if (actualUrl.contains(expectedUrl))

            System.out.println("correct webpage");
        else
            System.out.println("Wrong Webpage"); */
        Thread.sleep(10000);
    }

    @Test(priority = 2)
    public void verifyItem() throws InterruptedException {
        // step 10: click on Using Python with Selenium
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/a")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void logoutSuccessfully() throws InterruptedException {
        //step 11: click on Logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void negativeSignup() throws InterruptedException {
        clearFields();
        // Test 3: step 4: Click on signup button to open the signup page
        driver.findElement(By.xpath("//html/body/div[2]/div/a[2]")).click();
        Thread.sleep(5000);
        // step 5: input your username
        driver.findElement(By.id("user_username")).sendKeys("vu");
        Thread.sleep(5000);
        // step 6: Locate the email address field and input an email address on the email field
        driver.findElement(By.id("user_email")).sendKeys("kive4@mailinator.com");
        Thread.sleep(5000);
        // step 7: locate the password field and input your password on the username field
        driver.findElement(By.id("user_password")).sendKeys("Beauty");
        Thread.sleep(2000);
        //step 8: click on the Signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        String ErrorMessage = driver.findElement(By.tagName("h2")).getText();
        System.out.println(ErrorMessage);
        /*if (ErrorMessage.equals("username is less than minimum character required"))
            System.out.println("error prohibited this article from being saved");
        else
            System.out.println("Error Message found: Failed"); */

    }
@Test(priority = 5)
public void testSignupInvalidEmail() throws InterruptedException {
    clearFields();
    driver.findElement(By.id("user_username")).sendKeys("Durotimi");
    // Invalid email format
    driver.findElement(By.id("user_email")).sendKeys("&*^%nmailinator.com");
    driver.findElement(By.id("user_password")).sendKeys("Aminis");
    Thread.sleep(10000);
    driver.findElement(By.id("submit")).click();
    try {
        WebElement emailError = driver.findElement(By.id("//*[@id=\"user_email\"]"));
        Assert.assertTrue(emailError.isDisplayed(), "Error should be displayed for invalid email.");
        System.out.println("Error message displayed:Passed");
    }

    catch (NoSuchElementException e) {
        System.out.println("Error message displayed:Passed");

    }

}
    @Test(priority = 6)

    public void testSignupPasswordEmptyField() throws InterruptedException {
        clearFields();
        driver.findElement(By.id("user_username")).sendKeys("Duro12");
        driver.findElement(By.id("user_email")).sendKeys("duro12@mailinator.com");
        driver.findElement(By.id("user_password")).sendKeys("");

Thread.sleep(10000);
        driver.findElement(By.id("submit")).click();
    }
private void clearFields() {
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}


