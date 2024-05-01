package java8;

interface A{
     void show();
}
//class B implements A{
//    public void show(){
//        System.out.println("hello");
//    }
//
//}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
//        A a1 = new B();
//        a1.show();
          A a1 = ()-> System.out.println("helllo");
          a1.show();

    }
}
