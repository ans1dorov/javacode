package lessone7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {
    public static void main(String[] args) {
        String text = "I love writing code with the help of awesome Java!";
        Pattern pattern = Pattern.compile("\\b\\w*(\\w)\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuilder builder = new StringBuilder();
        while (matcher.find()){
            builder.append(matcher.group(1));
        }
        System.out.println(builder);
    }
}
