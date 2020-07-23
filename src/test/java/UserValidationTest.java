import org.junit.Assert;
import org.junit.Test;
public class UserValidationTest {
    @Test
    public void firstNameShouldProperReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("Mounika",userValidation.namePattern);
        Assert.assertTrue(result);
        System.out.println(result);
    }

    @Test
    public void firstNameshouldNotProperReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("Mo",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);


    }

    @Test
    public void firstNameFirstLetterNotCapReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("mounika",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);

    }

    @Test
    public void firstNameShouldUpperCaseReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("MOUNIKA",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);

    }

    @Test
    public void firstNameShouldBeDigitReturnFalse(){
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("12345",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);


    }

    @Test
    public void lastNameShouldProperReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("Chiluveri",userValidation.namePattern);
        Assert.assertTrue(result);
        System.out.println(result);


    }

    @Test
    public void lastNameShouldNotProperReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("ch",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }

    @Test
    public void lastNameFirstLetterShouldNotCapReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("chiluveri",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }

    @Test
    public void lastNameShouldBeCaptitalReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("CHILUVERI",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);

    }

    @Test
    public void lastNameShouldDigitReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result=userValidation.userDataValidation("1999",userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);

    }
}

