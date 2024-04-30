package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,4,3,6,5,2,7);
        Stream<Integer> data = l1.stream();
        //---to count the size of the stream---//
//        System.out.println(data.count());
        //---to sort the data---//
//        data.sorted().forEach(System.out::print);
//      data.forEach(System.out::print);
//        l1.stream().filter(n->n%2 ==1).sorted().map(n->n*n).forEach(System.out::println);
        int sum = l1.stream().filter(n->n%2==1).map(n->n*n).reduce(0,(c,e)->c+e);
    }

}
