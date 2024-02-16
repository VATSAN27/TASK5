
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringListChecker {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "" , "be", "efg", "abed", "jkl");

        List<String> nonEmptyStrings = getNonEmptyStrings(strings);

        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }

    public static List<String> getNonEmptyStrings(List<String> strings) {
        List<String> nonEmptyStrings = new ArrayList<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }

        return nonEmptyStrings;
    }
}