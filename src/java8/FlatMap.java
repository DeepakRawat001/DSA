package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 5), Arrays.asList(4, 56, 7));
        List<Integer> flattenList = list.stream().flatMap(li->li.stream()).collect(Collectors.toList());
        System.out.println(flattenList);
    }
}
