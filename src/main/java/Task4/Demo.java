package Task4;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args){
    long a = 25214903917L;
    long c = 11L;
    long m = (long) Math.pow(2, 48);
    long seed = 1L;

        UnaryOperator<Long> generator = x -> (a * x + c) % m;
        Stream<Long> randomStream = Stream.iterate(seed, generator).limit(20);
        randomStream.forEach(System.out::println);
        //      LongStream randomStream = LongStream.iterate(seed, x -> ((a * x) + c) % m).limit(20);
   //     randomStream.forEach(System.out::println);
    }
}
