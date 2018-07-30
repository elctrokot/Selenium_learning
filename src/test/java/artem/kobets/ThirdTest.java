//package artem.kobets;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class ThirdTest {
//    public class FirstTest {
//        private static void setup() {
//            System.setProperty("webdriver.chrome.driver", "D:/projects/automation/chromedriver/chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.navigate().to("https://accounts.google.com/");
//            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//            System.out.println("Active Window URL is : " + driver.getCurrentUrl());
//
//            WebElement firstName = driver.findElement(By.id("identifierId"));
//            firstName.sendKeys("testfortest460");
//
//            WebElement lastName = driver.findElement(By.id("identifierNext"));
//            lastName.click();
//
//            WebElement userName = driver.findElement(By.name("password"));
//            userName.sendKeys("Gfhjkmqw12");
//
//            WebElement passwd = driver.findElement(By.id("passwordNext"));
//            passwd.click();
////
////        WebElement confPasswd = driver.findElement(By.name("ConfirmPasswd"));
////        confPasswd.sendKeys("Sergey");
////
////        WebElement nextBtn = driver.findElement(By.id("accountDetailsNext"));
////        nextBtn.click();
//
//
//        }
//    }
//}
