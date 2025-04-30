package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("^[a-z0-9](\\.?[a-z0-9]){5,}@g(oogle)?mail\\.com$");
        Matcher m=p.matcher("aniketchauhan@gmail.com");
        System.out.println(m.matches());
    }
}
