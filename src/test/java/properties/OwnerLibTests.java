package properties;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;


//здесь мы с помощью либы owner скрываем данные. (логин пароль)


//@Tag("properties") //тэг для запуска таски в дженкенс
public class OwnerLibTests {
    public CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

    @DisplayName("креды")
    @Test
    void readCredentialTest() {
        String login = credentials.login();
        String password = credentials.password();

        System.out.println(login);
        System.out.println(password);

        String message = format("login: %s and password: %s", login, password);
        System.out.println(message);
    }
}
