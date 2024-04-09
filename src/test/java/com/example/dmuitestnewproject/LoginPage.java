package com.example.dmuitestnewproject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://business.gett.com/auth
public class LoginPage {
    public SelenideElement loginForm = $x("//*[@data-component=\"LogInForm\"]");
    public SelenideElement emailLoginField = $x("//*[@data-name=\"emailLoginForm\"]");
    public SelenideElement loginNextButton = $x("//*[@data-name=\"loginNextButton\"]");
    public SelenideElement emailValidationError = $x("//*[@data-name=\"emailValidationError\"]");
    public SelenideElement passwordLoginField = $x("//*[@data-name=\"passwordLoginForm\"]");
    public SelenideElement passwordInputIcon = $x("//*[@data-name=\"passwordInputIcon\"]");
    public SelenideElement passwordValidationError = $x("//*[@data-name=\"passwordValidationError\"]");
    public SelenideElement signInButton = $x("//*[@data-name=\"loginButton\"]");
    public SelenideElement authorizationErrorMessage = $x("//*[@data-name=\"errorMessage\"]");
    public SelenideElement forgotPasswordLink = $x("//*[@data-name=\"forgotPasswordLink\"]");
    public SelenideElement forgotPasswordForm = $x("//*[@data-component=\"ForgotPassword\"]");
    public SelenideElement forgotPasswordBtn = $x("//*[@data-name=\"forgotPasswordBtn\"] ");

    public void isElementVisible(SelenideElement element){

        element.shouldBe(Condition.visible);

    }

    public void isElementHidden(SelenideElement element){

        element.shouldBe(Condition.hidden);

    }

    public void isElementDisabled(SelenideElement element){

        element.shouldBe(Condition.disabled);

    }

    public void isElementClickable(SelenideElement element){

        element.shouldBe(Condition.clickable);

    }

    public void isElementEditable(SelenideElement element){

        element.shouldBe(Condition.editable);

    }

    public void click(SelenideElement element){

        element.click();

    }

    public void setString(SelenideElement element, String str){

        element.setValue(str);

    }
}
