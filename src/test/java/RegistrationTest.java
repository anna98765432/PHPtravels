import org.testng.annotations.Test;

public class RegistrationTest extends MainTest {



    @Test
    public void shouldRegister(){
        mainSearchPage.openTravelPHP()
                .clickMyAccount()
                .clickSignIn()
                .sendName("Anna")
                .sendLastName("Maria")
                .sendMobileNumber("1234567890")
                .sendEmail("annadwawewqewqeqw@o2.pl")
                .sendPassword("anna")
                .sendPasswordConformation("anna")
                .signUp()
                .registrationAssertion.hasUserRegistered();


    }


}
