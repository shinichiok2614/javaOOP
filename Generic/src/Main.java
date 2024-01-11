//T - Type
//E - Element
//K - Key
//N - Number
//V - Value


abstract class Sub {
    abstract void functionSub();
}

class Math<T> extends Sub {
    T score;

    void functionMath() {
        System.out.println("functionMath");
    }

    @Override
    void functionSub() {
        System.out.println("functionSubOverrideMath");
    }
}

class Physics extends Sub {
    int phy;

    @Override
    void functionSub() {
        System.out.println("functionSubOverridePhysics");
    }
}

public class Main {
    public static <E> void functionE(E e) {
        System.out.println("functionE: " + e.toString());
    }

    public static void functionK(Math<? extends Sub> a) {
        a.functionMath();
        a.functionSub();
    }

    public static void main(String[] args) {
        Math<Integer> math = new Math<>();
        math.functionMath();
        int a = 1;
        functionE(a);
        String b = "asdfa";
        functionE(b);


        functionK(new Math<>());
    }

}
//https://viettuts.vn/java-new-features/generics-trong-java