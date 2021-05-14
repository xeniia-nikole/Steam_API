package Steam_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,16,-1,-2,0,32,3,5,8,23,4);
        list.stream()
                .filter(value -> value > 0)
                .filter(value -> value % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
