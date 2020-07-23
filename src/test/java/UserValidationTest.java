import org.junit.Assert;
import org.junit.Test;
public class UserValidationTest {
    @Test
    public void firstNameShouldProperReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("Mounika", userValidation.namePattern);
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void firstNameshouldNotProperReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("Mo", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void firstNameFirstLetterNotCapReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("mounika", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);

    }
    @Test
    public void firstNameShouldUpperCaseReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("MOUNIKA", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void firstNameShouldBeDigitReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("12345", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void lastNameShouldProperReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("Chiluveri", userValidation.namePattern);
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void lastNameShouldNotProperReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("ch", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void lastNameFirstLetterShouldNotCapReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("chiluveri", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void lastNameShouldBeCaptitalReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("CHILUVERI", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void lastNameShouldDigitReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("1999", userValidation.namePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void emailShouldProperReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("chiluveri.mounika@gmail.com", userValidation.emailPattern);
        Assert.assertTrue(result);
        System.out.println("Properemail");
    }
    @Test
    public void emailShouldHaveSymbolReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("abc", userValidation.emailPattern);
        Assert.assertFalse(result);
        System.out.println("email must contain the symbol");
    }
    @Test
    public void emailNotstartWithdotReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation(".abc@gmail.com", userValidation.emailPattern);
        Assert.assertFalse(result);
        System.out.println("email should not start with dot");
    }
    @Test
    public void emailLastAtleastTwoCharactersReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("abc@gmail.b", userValidation.emailPattern);
        Assert.assertFalse(result);
        System.out.println("Email last atleast two characters");
    }
    @Test
    public void emailOnlyAllowFewSymbolsReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("abc()*@gmail", userValidation.emailPattern);
        Assert.assertFalse(result);
        System.out.println("email doesnot allow some symbols");
    }
    @Test
    public void phoneNumberShouldproperReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("91 9848433437", userValidation.phonePattern);
        Assert.assertTrue(result);
        System.out.println(result);
    }
    @Test
    public void phoneNumberStartingCoutryReturnsFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("9963373873", userValidation.phonePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void phoneNumberCoutrycodeNoSpaceReturnsFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("919965334444", userValidation.phonePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
    @Test
    public void phoneNumberShouldTenDigitsReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.userDataValidation("996533", userValidation.phonePattern);
        Assert.assertFalse(result);
        System.out.println(result);
    }
}

