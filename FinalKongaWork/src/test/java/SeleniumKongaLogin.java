import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumKongaLogin {
    //import the selenium webDriver
    private WebDriver driver;
    @BeforeTest
    public void setup() throws InterruptedException {
        System.setProperty("web driver.chrome.driver", "resources/chromedriver.exe");
        //open Chrome browser
        Thread.sleep(5000);
        driver = new ChromeDriver();
        //input Konga Url page
        driver.get("https://www.konga.com");
        // To wait for page to load
        Thread.sleep(10000);
        //Maximize the browser
        driver.manage().window().maximize();

    }


@Test(priority = 0)
public void testValidLogin() throws InterruptedException {

        // Locate and click on the Login button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
Thread.sleep(5000);
        // Enter valid credentials
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("dupsleen@gmail.com");
    Thread.sleep(5000);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Flourish_1");
    Thread.sleep(5000);
        // Click the login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(10000);
        //Assert successful login by checking the presence of a dashboard element
       WebElement accountLink = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[1]/div/div/div[4]/div/a/span"));
       Assert.assertTrue(accountLink.isDisplayed(), "Login was  successful.");
    System.out.println("Account created successfully");
}

    @Test(priority = 1)
    public void clickComputerAccessories() throws InterruptedException {
        // click on the Computer and Accessories Button
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[2]/div/a[2]")).click();
        Thread.sleep(5000);

        String expectedUrl = "https://www.konga.com/category/computers-accessories-5227";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Thread.sleep(10000);
    }
    @Test(priority = 2)
    public void clickLaptopSubcategory() throws InterruptedException {
        //  click on Laptop Subcategory
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/label/span")).click();
        Thread.sleep(10000);
    }

    @Test(priority = 3)
    public void clickAppleMacBooks() throws InterruptedException {
        //  click on Apple MacBook
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/ul/li[1]/a/label/span")).click();
    }
    @Test(priority = 4)
            public void clickMacProduct() throws InterruptedException {
    // Click on a MacBook product
    Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/section/section/section/ul/li[1]/article/div[2]/a/h3")).click();
        // Add the product to the cart
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/div[4]/div[3]/div[1]/div[1]/div/div[2]/div[2]/form/div[5]/div[1]/button")).click();

   // Verify the product is added to the cart
        Thread.sleep(5000);
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[2]"));

        /*WebElement cartIcon = driver.findElement(By.id("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[2]"));
        cartIcon.click(); */

        Thread.sleep(5000);
        WebElement cartItem = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[2]")); //and contains(text(), 'MacBook')]"));
        Assert.assertTrue(cartItem.isDisplayed(), "The MacBook was  added to the cart.");
       System.out.println("cartItem added successfully");
        /* WebElement accountLink = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[1]/div/div/div[4]/div/a/span"));
        Assert.assertTrue(accountLink.isDisplayed(), "Login was  successful.");
        System.out.println("Account created successfully"); */
    }



    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}







