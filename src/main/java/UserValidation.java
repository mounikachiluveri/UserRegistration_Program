public class UserValidation {
    public static final String namePattern="^[A-Z]{1}[a-z]{2,}";
    public static boolean userDataValidation(String dataFromTest,String namePattern){
        return dataFromTest.matches(namePattern);

    }
}
