package com.example.dmuitestnewproject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.*;
import utils.Generator;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class LoginPageTest {

    LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void setUp() {

        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");

    }

    @AfterEach
    public void tearDown(){

        closeWebDriver();

    }

    @Test
    public void checkLoginForm(){

        open("https://business.gett.com/auth");

        loginPage.isElementVisible(loginPage.loginForm);

    }

    @Test
    public void loginNextButtonIsInactive(){

        open("https://business.gett.com/auth");

        loginPage.isElementDisabled(loginPage.loginNextButton);

    }

    @Test
    public void checkTheAvailabilityOfEmailLoginField(){

        open("https://business.gett.com/auth");

        loginPage.isElementEditable(loginPage.emailLoginField);

    }

    @Test
    public void checkTheLoginNextButtonActivation(){

        open("https://business.gett.com/auth");

        loginPage.setString(loginPage.emailLoginField, Generator.getRandomEmail(8));

        loginPage.isElementVisible(loginPage.loginNextButton);
        loginPage.isElementClickable(loginPage.loginNextButton);

    }

    @Test
    public void emailLoginFieldValidationCheckWithInvalidEmail(){

        open("https://business.gett.com/auth");

        loginPage.setString(loginPage.emailLoginField, Generator.getRandomMixedString(10));
        loginPage.click(loginPage.loginNextButton);

        loginPage.isElementDisabled(loginPage.loginNextButton);
        loginPage.isElementVisible(loginPage.emailValidationError);

    }

    @Test
    public void deactivationOfEmailValidationErrorAfterEnteringValidEmail(){

        open("https://business.gett.com/auth");

        loginPage.setString(loginPage.emailLoginField, Generator.getRandomMixedString(10));
        loginPage.click(loginPage.loginNextButton);

        loginPage.isElementDisabled(loginPage.loginNextButton);
        loginPage.isElementVisible(loginPage.emailValidationError);

        loginPage.setString(loginPage.emailLoginField, Generator.getRandomEmail(10));

        loginPage.isElementVisible(loginPage.loginNextButton);
        loginPage.isElementClickable(loginPage.loginNextButton);
        loginPage.isElementHidden(loginPage.emailValidationError);

    }

    @Test
    public void checkLoadingTheForgotPasswordPage(){

        open("https://business.gett.com/auth");

        loginPage.isElementClickable(loginPage.forgotPasswordLink);

        loginPage.click(loginPage.forgotPasswordLink);

        loginPage.isElementVisible(loginPage.forgotPasswordForm);

    }

    @Test
    public void forgotPasswordButtonIsInactive(){

        open("https://business.gett.com/auth/forgot");

        loginPage.isElementDisabled(loginPage.forgotPasswordBtn);

    }
}