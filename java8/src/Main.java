import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyFunctionInterface {                       //lambda
    public String functionString();
}

@FunctionalInterface
interface FIAdd {
    public int add(int a);

    default void show() {                              //dung default de tao method trong interface
        System.out.println("show");
    }
}

interface IA {
    void A1();

    void A2();

    void A3();
}

class AImp implements IA {
    @Override
    public void A1() {
    }

    @Override
    public void A2() {
    }

    @Override
    public void A3() {
    }
}

public class Main {
    public static void main(String[] args) {
//        lambda
        MyFunctionInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.functionString());

        FIAdd myfunction = (num) -> num + 5;
        System.out.println(myfunction.add(22));

        myfunction.show();                          //su dung default

        List<String> list = new ArrayList<>();                      //lamda với mang
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.forEach((names) -> System.out.println(names));
        List<String> list1 = Arrays.asList("Rick", "Negan", "Daryl");
        list1.forEach((names) -> System.out.println(names));

        list.forEach((names)->names.concat(" haha"));
        System.out.println(list);
    }
}