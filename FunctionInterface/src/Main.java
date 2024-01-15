//function printResult(calculate) {
//    console.log('Result is', calculate())
//}
//
//printResult(function () {
//    return 3.14
//})
@FunctionalInterface                //tham số là hàm //SAM type: single abstrach method
interface ICalculate {
    double calculate();
}
@FunctionalInterface
interface FlyAble{
    void tryFly();
}
public class Chicken implements FlyAble{
    @Override
    public void tryFly(){
        System.out.println("Chicken.tryFly");
    }
}
public class Main implements FlyAble{
     void printResult(ICalculate func){
        System.out.println("Main.printResult(func): "+func.calculate());
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main main =new Main();
        main.printResult(new ICalculate() {     //anonymous class
            @Override
            public double calculate() {
                return 0;
            }
        });
    }
}
//https://blog.tonghoangvu.id.vn/hieu-hon-ve-functional-interface-trong-java
//https://blog.tonghoangvu.id.vn/cac-dang-implementation-cua-functional-interface?source=more_series_bottom_blogs