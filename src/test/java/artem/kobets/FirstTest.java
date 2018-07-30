package artem.kobets;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/projects/automation/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://accounts.google.com/SignUp?hl=ru");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("Active Window URL is : " + driver.getCurrentUrl());
    }

    @Test
    public void accCreation() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Test user");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Test user");

        int randomNum = ThreadLocalRandom.current().nextInt(5000, 9001);

        System.out.println(randomNum);

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("testfortest7801"/* + Integer.toString(randomNum)*/);

        WebElement passwd = driver.findElement(By.name("Passwd"));
        passwd.sendKeys("gfhjkm7801"/* + Integer.toString(randomNum)*/);

        WebElement confPasswd = driver.findElement(By.name("ConfirmPasswd"));
        confPasswd.sendKeys("gfhjkm7801"/* + Integer.toString(randomNum)*/);

        WebElement nextBtn = driver.findElement(By.id("accountDetailsNext"));
        nextBtn.click();

        WebElement phoneNum = driver.findElement(By.id("phoneNumberId"));
        phoneNum.sendKeys("953076754");

        WebElement nextPhnBtn = driver.findElement(By.id("gradsIdvPhoneNext"));
        nextPhnBtn.click();

        WebElement phnCode = driver.findElement(By.id("code"));
        nextPhnBtn.sendKeys("");//ручной ввод

        WebElement nextPhnBtn = driver.findElement(By.id("gradsIdvVerifyNext"));
        nextPhnBtn.click();


    }

//    @AfterClass
//    public static void tearDown() {
//        WebElement menuUser = driver.findElement(By.cssSelector(".login-button__menu-icon"));
//        menuUser.click();
//        WebElement logoutButton = driver.findElement(By.id("login__logout"));
//        logoutButton.click();
//        driver.quit();
//    }
}

