/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.loginIT.driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author nikita
 */
public class registrationIT {

    static WebDriver driver;

    @BeforeAll
    public static void setupClass() {
       WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();;

        driver.get("http://localhost:8080/gameServer/registration.jsp");
    }

    @Test
    public void uname() {
        System.out.println("Enter uname");
        WebElement unameField = driver.findElement(By.xpath("//input[@id='uname']"));
        if (unameField == null) {
            fail();
        }
        unameField.sendKeys("Cat666");

    }

    @Test
    public void tagTitle() {
        System.out.println("Title");
        WebElement title = driver.findElement(By.tagName("h1"));
        if (title == null) {
            fail();
        }
    }

    @AfterAll
    public static void exit() {
        driver.quit();
    }

}
