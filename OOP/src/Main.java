interface IHuman {              //ban thiet ke cua class //mặc định là public interface
    //default, static methods,private methods
    int speedWalk = 0;          //mặc định là pulic static final, chỉ được phép static final

    void showIHuman();          //mặc định là public abstract

    void show1();

    default void show2() {
        System.out.println("IHuman.show2");
    }

    void show3();
}

interface ISuperman {
    int speedFly = 0;

    void showISuperman();

    void show1();

    default void show2() {
        System.out.println("ISuperman.show2");
    }

    default void show3() {
        System.out.println("ISuperman.show3");
    }
}

class Student<M> implements IHuman, ISuperman {

    @Override
    public void showIHuman() {
        System.out.println("showIHuman");
    }

    @Override
    public void show1() {           //cung method thi override

    }

    public void show2() {           //cung default thi chon 1 trong 2 = super
        IHuman.super.show2();
    }

    //    @Override                     //1 method === 1 default thi override hoac super
//    public void show3() {
//
//    }
    public void show3() {
        ISuperman.super.show3();
    }

    @Override
    public void showISuperman() {
        System.out.println("showISuperman");
    }
}

class Math {
    int scores;

    private void functionMathPrivate() {
        System.out.println("functionMathPrivate");
    }
}


abstract class Animal {                           //abstract
    //Giong nhu interface, nhưng cấp thấp hơn, và khong thể đa kế thừa
    //bien: final, non-final, static và non-static
    //pt: static, main và constructor
    public abstract void show();
    void run(){
        System.out.println("Animal.run");
    }
}

class Dog extends Animal {
    @Override
    public void show() {
        System.out.println("Dog.show");
    }
}

public class Main {
    public void myMethod() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
//        IHuman<Math> man=new Student<Math>();
        Dog dog = new Dog();
        dog.show();
        dog.run();


        Main instanceMain = new Main();                     //Dinh nghia phuong thuc cua interface bang method cua class ma k implements!!!
        instanceMain.myMethod();
//        Method references
        INew objnew = instanceMain::myMethod;               //Gan Instance method vao method cua FunctionInterface
        objnew.show();

    }
}

@FunctionalInterface
interface INew {
    void show();
}
//https://topdev.vn/blog/checked-va-unchecked-exception-trong-java/
//Số lượng đối số không cố định
//http://vncoding.net/2018/03/17/phuong-thuc-trong-java/