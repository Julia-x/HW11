package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1.John", "2. Bill", "3. Filip", "4. Ivan", "5. Stepan");
        Stream<String> nameStream = names.stream()
                .filter(name -> {
                    int index = Integer.parseInt(name.split("\\.")[0]);
                    return index % 2 != 0;
                })
                .collect(Collectors.joining(", ")).lines();


        List<String> filteredNames = nameStream.collect(Collectors.toList());

       System.out.println(filteredNames);
    }
}
