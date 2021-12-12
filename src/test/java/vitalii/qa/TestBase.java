package vitalii.qa;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

import java.util.Locale;

//Файл с общими вещами
public class TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    //добавили фейкер
    Faker faker = new Faker(new Locale("ru")); //выставили локализацию фейкера
    String randomName = faker.name().firstName();
    String randomTelephone = faker.number().digits(10);


    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        //Configuration.startMaximized = false;
        //Configuration.browserSize = "1366x768";
    }

}