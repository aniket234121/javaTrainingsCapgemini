package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matcherMethods {

    public static void main(String[] args) {
        String input = "Hello 123, this is a test 456. Bye 789!";
        Pattern pattern = Pattern.compile("\\d+"); // Matches numbers
        Matcher matcher = pattern.matcher(input);

        // matches()
        System.out.println("matches(): " + matcher.matches()); // false because full string is not only digits

        // find()
        while (matcher.find()) {
            System.out.println("find(): " + matcher.group() + " at index " + matcher.start() + "-" + (matcher.end() - 1));
        }

        // Resetting matcher to start over
        matcher.reset();

        // lookingAt()
        Matcher m2 = Pattern.compile("Hello").matcher(input);
        System.out.println("lookingAt(): " + m2.lookingAt()); // true

        // group(), group(int group)
        matcher.find(); // finds "123"
        System.out.println("group(): " + matcher.group());
        System.out.println("group(0): " + matcher.group(0));

        // start(), start(int group), end(), end(int group)
        System.out.println("start(): " + matcher.start());
        System.out.println("end(): " + matcher.end());

        // reset(CharSequence)
        matcher.reset("Only 999 here");
        if (matcher.find()) {
            System.out.println("After reset(CharSequence), found: " + matcher.group());
        }

        // replaceAll(String str), replaceFirst(String s)
        matcher.reset(input);
        System.out.println("replaceAll(): " + matcher.replaceAll("#"));
        System.out.println("replaceFirst(): " + matcher.replaceFirst("#"));

        // appendReplacement() and appendTail()
        matcher.reset();
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "<NUM>");
        }
        matcher.appendTail(sb);
        System.out.println("appendReplacement() + appendTail(): " + sb);

        // region(int start, int end)
        matcher.reset();
        matcher.region(7, 25); // Only consider part of input
        while (matcher.find()) {
            System.out.println("region find(): " + matcher.group());
        }

        // hasTransparentBounds()
        System.out.println("hasTransparentBounds(): " + matcher.hasTransparentBounds());

        // usePattern(Pattern)
        Pattern newPattern = Pattern.compile("[A-Za-z]+");
        matcher.usePattern(newPattern);
        matcher.reset();
        while (matcher.find()) {
            System.out.println("usePattern(): " + matcher.group());
        }
    }
}
