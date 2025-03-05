package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends tests.BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("test@kennect.io", "Qwerty@1234");
        sleep(3000);
        Assert.assertTrue(driver.getCurrentUrl().contains("home"));
    }

    @Test
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage();
        loginPage.login("invalid@kennect.io", "wrongPassword");
        sleep(2000);
        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Invalid credentials"), "Expected error message not found!");
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
