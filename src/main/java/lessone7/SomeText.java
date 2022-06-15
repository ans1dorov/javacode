package lessone7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SomeText {
    public static void main(String[] args) {
        String text = "Some text, with. punctuation! marks? Wow how any of them: ;";
        Pattern pattern = Pattern.compile("[,.!?:;]");
        Matcher matcher = pattern.matcher(text);
        StringBuilder punctuation = new StringBuilder();
        int count=0;
        while (matcher.find()) {
            String punctutionMark = matcher.group();
            punctuation.append(punctutionMark);
            count++;
        }


        System.out.println(punctuation);// ,.!?:;
        System.out.println(count);//6
    }
}
