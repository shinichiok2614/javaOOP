
//int	32	-2,147,483,648 đến 2,147,483,647  100000
//long	64	-9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807   100000l
//float	32	1.4E-45 đến 3.4028235E38    9.08f
//double	64	4.9E-34 đến 1.7976931348623157E308    9.08
//char	16	0 đến 65,535    'a'

//Primitive data	Wrapper class
//boolean	Boolean
//char	Character


import java.util.Scanner;

public class Main {
//    khai báo hằng số static final
    public static final int HOUR_OF_DAY=24;
    public static final String CHUOI = "Hello CHUOI";
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Ép kiểu rộng
        int i1 =100;
        long l=i1;
        System.out.println("l: "+l);

//        Ép kiểu hẹp
        double d=100.04;
        long l1=(long) d;
        System.out.println("l1: "+l1);

//        hằng số
        System.out.println("Hang so: "+HOUR_OF_DAY);
        System.out.println("Hang so: "+CHUOI);

//        toán tử 3 ngôi
        int a=3;
        int b=4;
        System.out.println((a>3)&&(b>4));
        System.out.println((a>3)||(b>4));
        boolean c;
        c=a>b? true:false;
        System.out.println("c: "+c);

//        wrapper
        String Chuoi = "Gia tri khoi tao";
        String ChuoiNew = new String("Gia tri chuoi new");
        System.out.println("Chuoi: "+Chuoi);
        System.out.println("Chuoi new: "+ChuoiNew);
        System.out.println("length: " + Chuoi.length());

//        Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String ChuoiScanner = scanner.nextLine();
        scanner.close();
        System.out.println("kq: "+ChuoiScanner);
        System.out.println("noi chuoi: "+ChuoiScanner.concat("ChuoiConCat"));
        System.out.println("ky tu (1): " + ChuoiScanner.charAt(1));
        System.out.println("so sanh 2 chuoi: " + ChuoiScanner.compareTo("abc"));
        System.out.println("vị trí chuỗi trong chuỗi: " + ChuoiScanner.indexOf("abc"));
        System.out.println("thay thế chuỗi con bằng chuỗi khác: " + ChuoiScanner.replace("a", "0"));
        System.out.println("loại bỏ khoảng trắng đầu và cuối: " + ChuoiScanner.trim());
        System.out.println("tạo chuỗi: " + ChuoiScanner.substring(2, 3));

//        mảng 1 chiều
        int[] mang1c;   //khai báo
        int mang1chieu[] = new int[3];   //cấp phát bộ nhớ
        int[] mang1chieu1 = new int[]{1, 2, 3, 4};
        System.out.println("ky tu thu 2: "+mang1chieu1[1]);
        int size=3;
        int[] array = new int[size];      //được phép tạo mảng với biến, khác với c++
        array[0]=0;
        array[1]=1;
        for (int i = 0; i < array.length; i++) System.out.println("array[" + i + "]: " + array[i]);

//        https://freetuts.net/hoc-java
//        https://freetuts.net/mang-mot-chieu-trong-java-1062.html
    }
}
