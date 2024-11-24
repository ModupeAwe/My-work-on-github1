import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Add Delivery Address: /html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button

//click on Add Address: /html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/div[1]/div/a
 //       fill form/save changes:   /html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[8]/div[1]/button
//Pick address button:             /html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/div[2]/div/form/button

//Use this address: /html/body/div[1]/div/section/div[2]/section/section/aside/div[3]/div/div/div/a


       import java.sql.Driver;
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
        Thread.sleep(5000);
        //Maximize the browser
        driver.manage().window().maximize();

    }


@Test(priority = 0)
public void testValidLogin() throws InterruptedException {

        // Locate and click on the Login button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
Thread.sleep(5000);
        // Enter valid credentials
    //Enter Email address
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("");
    Thread.sleep(1000);
    //Enter password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("");
    Thread.sleep(1000);
        // Click the login button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
        //Assert successful login by checking the presence of a dashboard element
       WebElement accountLink = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[1]/div/div/div[4]/div/a/span"));
       Assert.assertTrue(accountLink.isDisplayed(), "Login was  successful.");
    //print Login successful
       System.out.println("Account created successfully");
    Thread.sleep(10000);
}

    @Test(priority = 1)
    public void clickComputerAccessories() throws InterruptedException {
        // click on the Computer and Accessories Button
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[2]/div/a[2]")).click();
        //Thread.sleep(5000);
        String expectedUrl = "https://www.konga.com/category/computers-accessories-5227";
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Thread.sleep(5000);

    }
    @Test(priority = 2)
    public void clickLaptopSubcategory() throws InterruptedException {
        Thread.sleep(5000);
        //  click on Laptop Subcategory
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/label/span")).click();
        //Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void clickAppleMacBooks() throws InterruptedException {

        //  click on Apple MacBook
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/ul/li[1]/a/label/span")).click();
       // Thread.sleep(5000);
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

        Thread.sleep(5000);
        WebElement cartItem = driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[2]")); //and contains(text(), 'MacBook')]"));
        Assert.assertTrue(cartItem.isDisplayed(), "The MacBook was  added to the cart.");
       System.out.println("cartItem added successfully");
        Thread.sleep(5000);

    }

    @Test(priority=5)
    public void clickContinueCart() throws InterruptedException {
        //click My cart
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[1]")).click();
        Thread.sleep(5000);
        //click continue to check out
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/div/div[2]/div[4]/div/div[6]/div/a")).click();
        Thread.sleep(5000);
    }
        @Test(priority=6)
        public void addDeliveryAddress() throws InterruptedException {
            Thread.sleep(5000);
            //click Add Delivery Address
          driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
          Thread.sleep(5000);
          //click  on Add Address:
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/div[1]/div/a ")).click();
            Thread.sleep(5000);
           // fill form/save changes:
            // Enter firstname
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[1]/div[1]/input")).sendKeys("Modupe");
            Thread.sleep(1000);
            // Enter lastname
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[1]/div[2]/input")).sendKeys("Awe");
            Thread.sleep(1000);
            // Enter phoneNumber
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[2]/input")).sendKeys("08060991472");
            Thread.sleep(1000);
            // Enter Street Address
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[3]/input")).sendKeys("Lagos Nigeria");
            Thread.sleep(1000);
            // Enter city
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[5]/input")).sendKeys("Ikorodu");
            Thread.sleep(1000);
            // Enter state
            Select stateDropDown= new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[6]/div/div/select")));
            stateDropDown.selectByVisibleText("Lagos");

            Thread.sleep(1000);
            // enter local government
            Select lgaDropDown= new Select(driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[7]/div/div/select")));
            lgaDropDown.selectByVisibleText("Ikorodu");
            Thread.sleep(1000);
            // end fill form/ click save changes
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/form/div[8]/div[1]/button")).click();
            Thread.sleep(5000);
            //Pick address button:
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[2]/div/div/div[2]/div/form/button")).click();
            Thread.sleep(5000);
            //click use this address
            driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
            Thread.sleep(10000);
        }
            @Test(priority=7)
                    public void clickContinueWithPayment() throws InterruptedException {
                Thread.sleep(2000);
                // click the radio button pay now
                driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
                Thread.sleep(5000);
                //click on continue to payment
                driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
                Thread.sleep(60000);

            }
@Test(priority=8)
    public void selectCardMethod () throws InterruptedException {
        //select a card payment method
    Thread.sleep(5000);

        // change from default to iframe
        WebElement payMethod = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame("kpg-frame-component");
        Thread.sleep(5000);
        //select card payment method                                                                          ///html/body/section/section/section/div[2]/div[3]/div[1]/div[2]/div/div[3]/button
        WebElement cardPayment = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div[1]/div[2]/div/div[3]/button"));
        cardPayment.click();
        System.out.println("select card method");
    Thread.sleep(5000);

    }
     @Test (priority = 9)
    public void inputCardDetails () throws InterruptedException {
         Thread.sleep(5000);
        //input  card details
        //input card number in its field
        WebElement cardNumberElement = driver.findElement(By.id("card-number"));
         cardNumberElement.sendKeys("1234567810000");
        Thread.sleep(1000);
        //input date in its field

        WebElement datedigit = driver.findElement(By.id("expiry"));
        datedigit.sendKeys("11/24");
        Thread.sleep(1000);
        //10c input CVV in its field
        WebElement cvvdigit = driver.findElement(By.id("cvv"));
        cvvdigit.sendKeys("233");
        Thread.sleep(1000);
        //System.out.println("input card details");
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div/form[1]/div[2]/div[2]/button")).click();
         Thread.sleep(5000);
         WebElement cardErrorElement=  driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div/form[1]/div[2]/div[1]/div[1]/div[2]/label"));
         String cardError=cardErrorElement.getText();
         System.out.println("Card Error Message="+cardError);
         //
         driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
         Thread.sleep(10000);
    }
/*
    @Test(priority=9)
    public void enterCardDetails() throws InterruptedException {
// Select card payment method
  //driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div/div/div[2]/div/div[2]/button/div/span[2]]")).click();
   //Thread.sleep(20000);
   //Enter invalid credentials
        //input card number
        WebElement cardNumberField = driver.findElement(By.id("card-number"));
                         cardNumberField.sendKeys("1234567810000");
                         Thread.sleep(5000);
                         //Input CVV in its field
                         WebElement cvvField = driver.findElement(By.id("cvv"));
                         cvvField.sendKeys("233");
                         Thread.sleep(5000);
                         //Input date in the field
                         WebElement dateExpiryField = driver.findElement(By.id("expiry"));
                         dateExpiryField.sendKeys("11/24");
                         Thread.sleep(5000);
                         // click pay Now
                        // driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div/form[1]/div[2]/div[2]/button")).click();
                        // Thread.sleep(10000);
                         //Print the error message
                         WebElement cardField = driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[3]/div/form[1]/div[2]/div[1]/div[1]/div[2]/input"));
                         Assert.assertTrue(cardField.isDisplayed(), "Invalid Card Number");
                         System.out.println("Invalid Card Number");
                         //System.out.println("Error Message: " + errorMessage.getText());
                         Thread.sleep(5000);
                         //CLOSE THE IFRAME =
                         driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();

    }
*/
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}


    /*@Test(priority = 6)
    public void logoutSuccessfully() throws InterruptedException {
        // click on My Account Logout
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/div[4]/div/a/span")).click();
        Thread.sleep(5000);
        // click on logout
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/div[4]/div/ul/li[7]/a")).click();
        Thread.sleep(5000); */









 //CARD = /html/body/section/section/section/div[2]/div[3]/div[1]/div[2]/div/div[3]/button/div/span[2]
//INVALID CARD NUMBER = /html/body/section/section/section/div[2]/div[3]/div/form[1]/div[2]/div[1]/div[1]/div[2]/input
//invalid card: id = card-number_unhappy
// path: /html/body/section/section/section/div[2]/div[3]/div/form[1]/div[2]/div[1]/div[1]/div[2]/label
// CLOSE THE IFRAME = /html/body/section/section/section/div[2]/div[1]/aside

//CARD NUMBER = 1234 2345 6000 6
// Print out error message invalid card number
// pay Now: id "validateCardForm"