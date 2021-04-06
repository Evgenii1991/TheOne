import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class login {
    final String URL = "https://www.google.com/";

    @Epic(value = "Большая проверка ГУГЛА")
    @BeforeEach
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open(URL);
    }

    @AfterEach
    public void finish(){
        close();
    }
    @Feature("Проверка поиска")
    @Severity(SeverityLevel.CRITICAL)
    @Description(value = "Проводится проверка поиска ГУГЛА")
    @Story("Перевая проверка ГУГЛА")
    @Test
    public void cooiseOne(){
        inpGoo("Привет как дела");
    }


    @Step(value = "Найти инпут")
    public void inpGoo(String text){ $(".gLFyf.gsfi").setValue(text).pressEnter(); }



}
