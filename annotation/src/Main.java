//@Override
//@SuppressWarnings()  ngan chan cac canh bao cua trinh bien dich
//@Deprecated          danh dau k tan thanh - danh dau pht se dc xoa trong tuong lai

//Marker Annotation
//  @Override
//  @Deprecated
//Single-Value Annotation
//  @interface
//Multi-Value Annotation

//Java Reflection - Classes, Constructors, Fields, Methods


import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassA {
    @Deprecated
    static void deprecated() {
        System.out.println("A.deprecated");
    }

    public void function() {                 //public?
        System.out.println("A.function");
    }
}
//Single-Value Annotation - 1 phuong thuc
//Multi-Value Annotation  - nhieu phuong thuc
@interface MyAnnotation {
    int value();

    int defaultValue() default 0;
}

@MyAnnotation(value = 1)
class TheClass {
}

@Retention(RetentionPolicy.RUNTIME)     //thời điểm sử dụng: có the truy cập luc runtime
@Target(ElementType.TYPE)               //cách thức sử dung: chi co the su dung voi class v interface
@interface NewAnnotation {
    String value();
}


public class Main {
    @MyAnnotation(value = 42)           //Multi-Value Annotation
    @SuppressWarnings({"rawtypes", "unchecked", "MismatchedQueryAndUpdateOfCollection"})
    public static void main(String[] args) throws Exception {
//    public static void main(String[] args){
        System.out.println("Hello world!");
        List list = new ArrayList(Arrays.asList("C++", "Java", "PHP")); //List<String>

//        A a=new A();
        ClassA.deprecated();

//        MyAnnotation annotation=Main.class.getMethod("main",String[].class).getAnnotation(MyAnnotation.class);

        ClassA a = new ClassA();
        //reflection ben ngoai goi nen phai co public
        Method method = a.getClass().getMethod("function", null);
        method.invoke(a, null);


//        Java Reflection - Classes
        Class classA = ClassA.class;
//        Class instanceAClassName = Class.forName("A");  //chuoi string la ten lop tai thoi diem runtime


//        Class Annotations
        Annotation[] annotations = classA.getAnnotations();
        Arrays.asList(annotations).forEach(annotation -> {
            NewAnnotation newAnnotation = (NewAnnotation) annotation;
            System.out.println("newAnnotation.value()"+newAnnotation.value());
        });
//        https://viblo.asia/p/annotation-su-dung-annotation-voi-reflection-trong-java-PDOkqXxyejx



//        Java Reflection - Constructors
        Constructor<?>[] constructors = classA.getConstructors();
        if (constructors.length > 0) {
            Constructor<?> constructor = constructors[0];
            Class<?>[] parameterTypes = constructor.getParameterTypes();

            ClassA myobj = (ClassA) constructor.newInstance("constructor-arg1");

//        Java Reflection - Methods : thuoc tinh
            Method[] methods = ClassA.class.getMethods();
            Method methodReflection = ClassA.class.getMethod("function", String.class);
            Object returnvalue = methodReflection.invoke(null, "parameter-value1");
        } else System.out.println("=0");


    }
}
//https://viblo.asia/p/java-reflection-and-anotation-DbmvmWRMeAg
//https://viettuts.vn/java-new-features/tuy-chinh-annotation-trong-java

//https://www.google.com/search?q=invoke+trong+java&oq=invoke+trong+java&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQABgeMgYIAhAAGB4yBggDEAAYHjIGCAQQABgeMgYIBRAAGB4yBggGEAAYHjIGCAcQABgeMgYICBAAGB4yBggJEAAYHtIBCDM0NDVqMGoxqAIAsAIA&sourceid=chrome&ie=UTF-8