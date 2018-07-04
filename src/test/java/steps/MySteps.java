package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.MailPage;

import static com.codeborne.selenide.Selenide.*;

public class MySteps {

    LoginPage loginPage = page(LoginPage.class);
    MailPage mailPage = page(MailPage.class);

    @Given("^an open a main page$")
    public void anOpenAMainPage() {
        open(loginPage.url);
    }

    @And("^logged with login: \"([^\"]*)\" and pass: \"([^\"]*)\"$")
    public void loggedWithLoginAndPass(String login, String pass)  {
        loginPage.login(login, pass);
    }

    @When("^entered \"([^\"]*)\" in search field$")
    public void enteredInSearchField(String text) {
        mailPage.search(text);
    }

    @And("^an open inbox page$")
    public void anOpenInboxPage() {
        open(mailPage.url);
    }

    @And("^opened the found message$")
    public void openedTheFoundMessage() {
        mailPage.openTheMessage();
    }

    @Then("^subject of the message should be: \"([^\"]*)\"$")
    public void subjectOfTheMessageShouldBe(String subject) {
        mailPage.assertSubject(subject);
    }

    @Then("^sender of the message should be: \"([^\"]*)\"$")
    public void senderOfTheMessageShouldBe(String sender) {
        mailPage.assertSender(sender);
    }

    @Then("^content of the message should be: \"([^\"]*)\"$")
    public void contentOfTheMessageShouldBe(String content) {
        mailPage.assertContent(content);
    }
}
