import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StramExample {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().map( number -> number * number)
                .map(number -> number * number).sorted()
                .collect(Collectors.toList()));
    }
}