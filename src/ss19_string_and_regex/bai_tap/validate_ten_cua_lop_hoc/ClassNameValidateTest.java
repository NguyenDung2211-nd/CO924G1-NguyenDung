package ss19_string_and_regex.bai_tap.validate_ten_cua_lop_hoc;

public class ClassNameValidateTest {
    private static ClassNameValidate classNameValidate;
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args){
        classNameValidate = new ClassNameValidate();

        for(String className : validClassName){
            boolean isValid = classNameValidate.validate(className);
            System.out.println("Class name "+ className + " isValid "+isValid);
        }
        for(String className : invalidClassName){
            boolean isValid = classNameValidate.validate(className);
            System.out.println("Class name "+ className + " isValid "+isValid);
        }
    }
}
