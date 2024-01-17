import javax.naming.Context;
import java.lang.reflect.*;

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

class TestInvokeNoConstructor {
    private void functionPrivate() {             //k doi so
        System.out.println("TestInvokeNoConstructor.functionPrivate");
    }

    public void functionPublic() {               //k doi so
        System.out.println("TestInvokeNoContructor.functionPublic");
    }

    public void functionPublic(String a) {       // 1 doi so
        System.out.println("TestInvokeNoContructor.functionPublic(String a): "+a);
    }
}

abstract class Animal {                                  //abstract
    public abstract void show();
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

    public void show() {
        System.out.println("main.show");
    }

    public void testInvoke() throws Exception {

        Class<?> test = Class.forName(TestInvokeNoConstructor.class.getName());
        Method method = test.getMethod("functionPublic", new Class[]{});        //k doi so
//        Method method1 = test.getMethod("functionPublic", new Class[]{Context.class});     // reflection để lấy một phương thức từ một lớp thông qua getMethod
        Method method1 = test.getMethod("functionPublic", String.class);
//        Method method2 = test.getMethod("functionPrivate");
//        Method method2 = test.getDeclaredMethod("functionPrivate");                 //k doi so thi co new Class[]{} hay k cung dc
        Method method2 = test.getDeclaredMethod("functionPrivate", new Class[]{});
        method2.setAccessible(true);

        // Create an instance of the class using newInstance
        Object instance = test.newInstance();

        // Invoke the method on the instance   //gọi một phương thức trên một đối tượng
        method.invoke(instance);
        method1.invoke(instance, "hehe");
        method2.invoke(instance);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
//        IHuman<Math> man=new Student<Math>();
        Dog dog = new Dog();
        dog.show();


//        https://freetuts.net/method-references-trong-java-8-3014.html
        Main instanceMain = new Main();                      //Dinh nghia phuong thuc cua interface bang method cua class ma k implements
        INew objnew = instanceMain::myMethod;
        objnew.show();

        instanceMain.show();
        instanceMain.testInvoke();

    }
}

@FunctionalInterface
interface INew {
    void show();
}