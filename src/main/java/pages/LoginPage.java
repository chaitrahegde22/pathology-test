package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By emailField = By.xpath("//input[@type='email']");
    By passwordField = By.xpath("//input[@type='password']");
    By loginButton = By.xpath("//button[@type='submit']/span[text()='Login']");
    By errorMessage = By.cssSelector(".error-message"); // Change if error shows differently

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get("https://gor-pathology.web.app/");
        sleep(2000);
    }

    public void login(String email, String password) {
        sleep(1000);
        driver.findElement(emailField).sendKeys(email);
        sleep(500);
        driver.findElement(passwordField).sendKeys(password);
        sleep(500);
        driver.findElement(loginButton).click();
        sleep(2000);
    }

    public String getErrorMessage() {
        sleep(1000);
        return driver.findElement(errorMessage).getText();
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
