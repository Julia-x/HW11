package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Bill", "Filip", "Ivan", "Stepan");
        Stream<String> nameStream = IntStream.range(0, names.size())
                .filter(index -> index % 2 == 0)
                .mapToObj(index -> (index + 1) + ". " + names.get(index))  // додаємо індекс ім'я
                .collect(Collectors.joining(", ")).lines();

        List<String> filteredNames = nameStream.collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
