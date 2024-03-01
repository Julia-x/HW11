package Task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1. John", "2. Bill", "3. Filip", "4. Ivan", "5. Stepan");
        List<String> sortedUpperCaseName = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.comparing(s -> s.split("\\. ")[1], Comparator.reverseOrder()))
                .collect(Collectors.toList());
                System.out.println(sortedUpperCaseName);
    }
}
