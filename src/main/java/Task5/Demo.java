package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8);

        zip(stream1, stream2).forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.collect(Collectors.toList());
        List<T> list2 = second.collect(Collectors.toList());
        int size = Math.min(list1.size(), list2.size());
        List<T> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        return result.stream();
    }
}
