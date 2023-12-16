package org.example;

import io.qameta.allure.Step;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestCheckNameToEmboss {

    @Parameterized.Parameter(0)
    public String cardHolderName;
    @Parameterized.Parameter(1)
    public boolean answerExpected;

    @Parameterized.Parameters(name = "Тест {index}: для строки {0} нужно получить ответ {1}")
    @Step("Проверка строки для имени владельца карты")
    public static Object[][] data() {
        return new Object[][]{
                {"ANNA", false},
                {" ANNA", false},
                {"ANNA ", false},
                {"ANN", false},
                {"AN", false},
                {"A NN", true},
                {"ANNA REPINA", true},
                {"ANNA REP INA", false},
                {"ANNA VALERIANOVNA REPINA", false},
                {"ANN IVANOVNAREPNINA", true},
        };
    }

    @Test
    public void runTestCheckNameToEmboss() {

        Account account = new Account(cardHolderName);
        assertEquals("Разрешение для строки определено неверно", answerExpected, account.checkNameToEmboss());
    }

}

