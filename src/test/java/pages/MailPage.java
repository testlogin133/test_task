package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MailPage {

    public String url = "https://mail.yandex.ru";
    private String cssSearchField = "[type='text']";
    private String cssFirstMessage = ".mail-MessageSnippet-Wrapper";
    private String cssSubject = ".mail-Message-Toolbar-Subject";
    private String cssSender = ".ns-view-message-head-sender-name";
    private String cssContent = ".mail-Message-Body-Content";

    public void search(String search_text) {
        $(cssSearchField).setValue(search_text).pressEnter();
        $(cssFirstMessage).shouldHave(Condition.text(search_text));
    }

    public void openTheMessage() {
        $(cssFirstMessage).click();
    }

    public void assertSubject(String text) {
        Assert.assertEquals("...wrong subject!", text, $(cssSubject).text());
    }

    public void assertSender(String text)  {
        Assert.assertEquals("...wrong sender!", text, $(cssSender).text());
    }

    public void assertContent(String text) {
        Assert.assertEquals("...wrong content!", text, $(cssContent).text());
    }


}
