import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,3,65,8,90);
        list.stream().filter(n->n%2==0).forEach(System.out::println);
        list.stream().map(n->n+1).forEach(System.out::print);

    }
}

