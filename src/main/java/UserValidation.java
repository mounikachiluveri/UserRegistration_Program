public class UserValidation {
    public static final String namePattern="^[A-Z]{1}[a-z]{2,}";
    public static final String emailPattern = "^[A-Za-z]{3,}([.|+|_|-]?[A-Za-z0-9]+)?[@][A-Za-z0-9]+[.][A-Za-z]{2,4}([.][A-Za-z]{2,4}+)?$";
    public static final String phonePattern = "^[1-9]{1}[0-9]{1,2}[ ][1-9]{1}[0-9]{9}$";
    public static final String passWordRule1="^[A-Za-z]{8,}$";
    public static final String passWordRule2="^(?=.*?[A-Z])[A-Za-z]{8,}$";
    public static final String passWordRule3 ="^(?=.*?[A-Z])(?=.*?[0-9])[A-Za-z0-9]{8,}$";
    public static final String passWordRule4 ="^(?=.?[A-Z])(?=[^@|#|$|%|&][@|#|$|%|&][^@|#|$|%|&]$)(?=.*[0-9])[A-Za-z0-9@#$%&]{8,}$";


    public static boolean userDataValidation(String dataFromTest,String Pattern){
        return dataFromTest.matches(Pattern);

    }
}
