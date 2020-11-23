package controller;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author nikita
 */
public class loginIT {

    static WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//WebDriverManager.firefoxdriver().setup();
//WebDriverManager.operadriver().setup();
//WebDriverManager.phantomjs().setup();
//WebDriverManager.edgedriver().setup();
//WebDriverManager.iedriver().setup();
        driver.get("http://localhost:8080/gameServer/");
    }

    @Test
    public void testSimple() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.

        // And now use this to visit NetBeans
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.netbeans.org");
        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {

            public Boolean apply(WebDriver d) {
                return d.getTitle().contains("Login");

            }

        });

        //Close the browser
    }

    @Test
    public void inputUserName() {
        System.out.println("Enter username");
        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys("Admin");
    }

    @Test
    public void inputPasswd() {
        System.out.println("Enter password");
        WebElement passwdField = driver.findElement(By.id("password"));
        if (passwdField == null) {
            fail();
        }
        passwdField.sendKeys("12345");
    }
@Test
    public void linkRegistration() {
        System.out.println("Click registration ");
        WebElement linkReg = driver.findElement(By.linkText("Registration"));
        linkReg.click();
    }
//    @Test
//    public void particalLinkRegistration() {
//        System.out.println("Click registration ");
//        WebElement linkReg = driver.findElement(By.partialLinkText("Regis"));
//        linkReg.click();
//    }

    @AfterAll
    public static void exit() {
        driver.quit();
    }
}
