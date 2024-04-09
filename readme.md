# Testing of [Gett.com](https://business.gett.com/)

---

| № | Check Name                                                       | Status |
|---|------------------------------------------------------------------|--------|
| 1 | Check login form                                                 | Pass   |
| 2 | Login next button is inactive                                    | Pass   |
| 3 | Check the availability of email login field                      | Pass   |
| 4 | Check the login next button activation                           | Pass   |
| 5 | Email login field validation check with invalid email            | Pass   |
| 6 | Deactivation of email validation error after entering validEmail | Pass   |
| 7 | Check loading the forgot password page                           | Pass   |
| 8 | Forgot password button is inactive                               | Pass   |

---

### Used elements list

| №  | Element Name                | XPath                                     |
|----|-----------------------------|-------------------------------------------|
| 1  | Login form                  | //*[@data-component="LogInForm"]          |
| 2  | Email login field           | //*[@data-name="emailLoginForm"]          |
| 3  | Login next button           | //*[@data-name="loginNextButton"]         |
| 4  | Email validation error      | //*[@data-name="emailValidationError"]    |
| 5  | Password login field        | //*[@data-name="passwordLoginForm"]       |
| 6  | Sign-in button              | //*[@data-name="loginButton"]             |
| 7  | Password input icon         | //*[@data-name="passwordInputIcon"]       |
| 8  | Password validation error   | //*[@data-name="passwordValidationError"] |
| 9  | Authorization error message | //*[@data-name="errorMessage"]            |
| 10 | Forgot password link        | //*[@data-name="forgotPasswordLink"]      |
| 11 | Forgot password form        | //*[@data-component="ForgotPassword"]     |
| 12 | Email field                 | //*[@data-name="emailForgotPassword"]     |
| 13 | Email validation error      | //*[@data-name="emailValidationError"]    |
| 14 | Forgot password button      | //*[@data-name="forgotPasswordBtn"]       |