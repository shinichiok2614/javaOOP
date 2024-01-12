interface IHuman {                          //ban thiet ke cua class
    int speedWalk = 0;

    void showIHuman();

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


abstract class Animal{                                  //abstract
    public abstract void show();
}
class Dog extends Animal{
    @Override
    public void show() {
        System.out.println("Dog.show");
    }
}
public class Main {
    public void myMethod(){
        System.out.println("Instance method");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        IHuman<Math> man=new Student<Math>();
        Dog dog=new Dog();
        dog.show();


//        https://freetuts.net/method-references-trong-java-8-3014.html
        Main instanceMain=new Main();                               //Dinh nghia phuong thuc cua interface bang method cua class ma k implements
        INew objnew=instanceMain::myMethod;
        objnew.show();


    }
}
@FunctionalInterface
interface INew{
    void show();
}