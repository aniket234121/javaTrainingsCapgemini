package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExampleMethods {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[a-zA-Z]{4,}]");
        String input="aniket";

        Matcher m=p.matcher(input);
        System.out.println(m.matches());
    }
}
