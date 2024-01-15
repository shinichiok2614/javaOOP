//T - Type
//E - Element
//K - Key
//N - Number
//V - Value


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public <T> void thamSoePhaiGiongNumber(List<T> e){
        System.out.println("thamSoePhaiGiongNumber");
    };
    public void thamSoeBatKy(List<?> e){
        System.out.println("thamSoeBatKy");
    }
    public static <E> void functionE(E e) {
        System.out.println("functionE: " + e.toString());
    }

    //Ký tự đại diện ? cho các lớp con thừa kế
    public static void functionKTDD(List<? extends Sub> a) {   //k the viet <>, k the viet E nen phai dung tam List<>
//        a.forEach((i)->i.functionSub());
//        a.forEach(i->i.functionSub());
        a.forEach(Sub::functionSub);

    }

    public static void main(String[] args) {
        Math<Integer> math = new Math<>();
        math.functionMath();
        int a = 1;
        functionE(a);
        String b = "asdfa";
        functionE(b);

        List<Math> listMath = new ArrayList<>();
        listMath.add(new Math());
        listMath.add(new Math());
        functionKTDD(listMath);

        List<Physics> physicsList = new ArrayList<>();
        physicsList.add(new Physics());
        physicsList.add(new Physics());
        functionKTDD(physicsList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(3, "3");
        map.put(2, "2");
        System.out.println(map);

        Main main=new Main();
        List<String> stringList = new ArrayList<>();
        stringList.add("stringList");
        main.thamSoeBatKy(stringList);
        main.thamSoePhaiGiongNumber(stringList);
    }

}
//https://viettuts.vn/java-new-features/generics-trong-java
//https://viblo.asia/p/java-generic-aWj53Xw1K6m