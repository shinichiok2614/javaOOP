interface IHuman {                          //ban thiet ke cua class
    int speedWalk = 0;

    void showIHuman();
}

interface ISuperman {
    int speedFly=0;
    void showISuperman();
}
class Student<M> implements IHuman, ISuperman{

    @Override
    public void showIHuman() {
        System.out.println("showIHuman");
    }

    @Override
    public void showISuperman() {
        System.out.println("showISuperman");
    }
}
class Math {
    int scores;
    private void functionMathPrivate(){
        System.out.println("functionMathPrivate");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        IHuman<Math> man=new Student<Math>();
    }
}