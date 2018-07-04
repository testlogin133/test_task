package pages;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public String url = "https://passport.yandex.ru";
    private String cssLogin = "[name='login']";
    private String cssPassword = "[name='passwd']";
    private String cssSubmitLogin = ".passport-Button-Text";

    public void login(String login, String password){
        $(cssLogin).setValue(login);
        $(cssPassword).setValue(password);
        $(cssSubmitLogin).click();
    }
}
