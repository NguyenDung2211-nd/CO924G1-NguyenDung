package ss19_string_and_regex.bai_tap.validate_so_dien_thoai;

public class PhoneNumberValidateTest {
   private static PhoneNumberValidate phoneNumberValidate;
   public static String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
   public static String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

   public static void main(String[] args){
       phoneNumberValidate = new PhoneNumberValidate();

       for(String phoneNumber : validPhoneNumber){
           boolean isValid = phoneNumberValidate.validate(phoneNumber);
           System.out.println("Phone number "+ phoneNumber + " is valid "+ isValid);
       }

       for(String phoneNumber : invalidPhoneNumber){
           boolean isValid = phoneNumberValidate.validate(phoneNumber);
           System.out.println("Phone number "+ phoneNumber + " is valid "+ isValid);
       }
   }
}
