package ss19_string_and_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public ClassNameValidate(){
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
    public boolean validate(String className) {
        matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
