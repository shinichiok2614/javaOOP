
//int	32	-2,147,483,648 đến 2,147,483,647  100000
//long	64	-9,223,372,036,854,775,808 đến 9,223,372,036,854,775,807   100000l
//float	32	1.4E-45 đến 3.4028235E38    9.08f
//double	64	4.9E-34 đến 1.7976931348623157E308    9.08
//char	16	0 đến 65,535    'a'

//Primitive data	Wrapper class
//boolean	Boolean
//char	Character


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    //    khai báo hằng số static final
    public static final int HOUR_OF_DAY = 24;
    public static final String CHUOI = "Hello CHUOI";

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Ép kiểu rộng
        int i1 = 100;
        long l = i1;
        System.out.println("l: " + l);

//        Ép kiểu hẹp
        double d = 100.04;
        long l1 = (long) d;
        System.out.println("l1: " + l1);

//        hằng số
        System.out.println("Hang so: " + HOUR_OF_DAY);
        System.out.println("Hang so: " + CHUOI);

//        toán tử 3 ngôi
        int a = 3;
        int b = 4;
        System.out.println((a > 3) && (b > 4));
        System.out.println((a > 3) || (b > 4));
        boolean c;
        c = a > b ? true : false;
        System.out.println("c: " + c);

//        wrapper
        String Chuoi = "Gia tri khoi tao";
        String ChuoiNew = new String("Gia tri chuoi new");
        System.out.println("Chuoi: " + Chuoi);
        System.out.println("Chuoi new: " + ChuoiNew);
        System.out.println("length: " + Chuoi.length());

//        Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String ChuoiScanner = scanner.nextLine();
        scanner.close();
        System.out.println("kq: " + ChuoiScanner);
        System.out.println("noi chuoi: " + ChuoiScanner.concat("ChuoiConCat"));
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
        int[] mang1chieu2 = {1, 2, 3, 4, 5};
        int[] mang1chieu2copy = new int[5];
//        copy
        System.arraycopy(mang1chieu2, 1, mang1chieu2copy, 1, 2);   //(, vị trí bắt đầu copy,,vị trí paste, )
        for (int i = 0; i < mang1chieu2copy.length; i++) System.out.println("mang1chieu2copy: " + mang1chieu2copy[i]);
        System.out.println("ky tu thu 2: " + mang1chieu1[1]);
        int size = 3;
        int[] array = new int[size];      //được phép tạo mảng với biến, khác với c++
        array[0] = 0;
        array[1] = 1;
        for (int i = 0; i < array.length; i++) System.out.println("array[" + i + "]: " + array[i]);
        for (int i = 0; i < mang1chieu2.length; i++) System.out.println("mang1chieu2[" + i + "]: " + mang1chieu2[i]);

//        lamda


//        mảng 2 chiều
        int mang2c[][];    //khai báo
        int mang2chieu[][] = new int[2][3];     //khai báo và cấp phát bộ nhớ
        String[][] mang2chieu1 = new String[3][5];
        int mang2chieu2[][] = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("địa chỉ mang2chieu2: " + mang2chieu2);
        System.out.println("phần tử 1 1" + mang2chieu2[1][1]);

//        collection
//        List interface
        List<String> listString = new ArrayList<String>();   //Kế thừa cái kiểu gì đây???
        List<String> listString2 = new ArrayList<>();
        List<String> listString3 = new ArrayList<>();
        List<String> listString1 = new ArrayList<>();         //khai báo kim cương
        List<Integer> listInt = new LinkedList<Integer>();
        List<Float> listFloat = new ArrayList<>(1000);      //khai báo kèm số phần từ, chưa cấp phát

        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
        listString.add(3, "Five");   //chèn vào vị trí 4
        listString2.add("Seven");
        listString.addAll(listString);
        listString.addAll(1, listString2);

        System.out.println("listString: " + listString);
//        for cải tiến
        for (String e : listString) System.out.println("for: " + e);

        //iterator
        Iterator<String> iter = null;
        iter = listString.iterator();
        while (iter.hasNext()) System.out.println("iterator: " + iter.next());

//        listIterator
        ListIterator<String> listIterator = null;
        listIterator = listString.listIterator();
        while (listIterator.hasNext()) System.out.println("listIterator: " + listIterator.next());

        System.out.println("get(0): " + listString.get(0));
        listString.set(0, "One Set");
        System.out.println("set: " + listString);

        listString.remove(0);
        System.out.println("remove(0): " + listString);

        listString.remove("Two");   //xóa phần tử đầu tiên
        System.out.println("remove \"Two\" đầu tiên: " + listString);

        System.out.println("contains(\"Two\"): " + listString.contains("Two"));
        System.out.println("vị trí đầu tiên (\"Two\"): " + listString.indexOf("Two"));
        System.out.println("vị trí cuối cùng (\"Two\"): " + listString.lastIndexOf("Two"));
        Collections.sort(listString);
        System.out.println("Collections.sort MergeSort O(nlogn): " + listString);
        for (int i = 0; i < 20; i++) listString3.add("Add");
        Collections.copy(listString3, listString);
        System.out.println(listString3);
        Collections.shuffle(listString);
        System.out.println(listString);
        listString.clear();
        System.out.println("clear: " + listString);
//        ArrayList
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("One");
        Object[] arr = arrListString.toArray();
        System.out.println(arrListString);
        System.out.println(arr);    //arr muốn hiện phải dùng for
        for (int i = 0; i < arr.length; i++) System.out.println(arr[i]);

//        LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("getFirst: " + linkedList.getFirst());
        System.out.println("getLast: " + linkedList.getLast());
        System.out.println("get(1): " + linkedList.get(1));
        linkedList.removeLast();
        System.out.println("removeLast: " + linkedList);
        linkedList.removeFirst();
        System.out.println("removeFirst: " + linkedList);
        linkedList.remove(0);
        System.out.println("remove(0): " + linkedList);
        System.out.println("linkedList: " + linkedList);
        linkedList2.add(3);
        linkedList.removeAll(linkedList2);
        System.out.println("linkedList: " + linkedList);

//        Set        //không chứa phần tử trùng nhau
        Set<Integer> hashsetInteger = new HashSet<>();
        hashsetInteger.add(1);
        hashsetInteger.add(2);
        hashsetInteger.add(3);
        System.out.println("hashsetInteger: " + hashsetInteger);
        Set<Integer> treesetInteger = new TreeSet<>();
        treesetInteger.add(11);
        treesetInteger.add(12);
        treesetInteger.add(13);
        System.out.println("treesetInteger: " + treesetInteger);

        //List->Set
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(3);
        listInteger.add(10);
        listInteger.add(2);
        System.out.println("listInteger: " + listInteger);
        Set<Integer> setInteger = new TreeSet<>(listInteger);
        System.out.println("setInteger" + setInteger);
        System.out.println(listInteger.stream());

        //Stream
        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        System.out.println(collection);


//        Lớp Arrays
        int[] i2 = {24, 13, 45, 37, 84, 13, 28};                     //đây là mảng
        System.out.println("Arrays.toString(i2): " + Arrays.toString(i2));             //mảng 1 chiều -> chuỗi
        Integer[] i3 = new Integer[]{1, 2, 3, 4};
        System.out.println("Arrays.deepToString(i3)" + Arrays.deepToString(i3));       //phải sử dụng với wrapper
        Integer[][] i4 = new Integer[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println("Arrays.deepToString(i4): " + Arrays.deepToString(i4));
        Integer[] i5 = new Integer[]{4, 6, 3, 3, 5, 6};
        Arrays.sort(i5);
        System.out.println("Quicksort MergeSort O(nlogn): " + Arrays.toString(i5));
        Arrays.sort(i2);
        System.out.println(Arrays.binarySearch(i2, 13));                        //phải sắp xếp trước khi tìm nhị phân
        Arrays.fill(i2, 10);
        System.out.println("Arrays.fill: " + Arrays.toString(i2));                     //Gán tất cả các phần tử =10
        int[] i6 = Arrays.copyOf(i2, 5);                                  //copy ra mảng mới với độ dài mới
        Integer[] i7 = Arrays.copyOf(i3, 5);
        System.out.println("i6: " + Arrays.toString(i6));
        System.out.println("i7: " + Arrays.toString(i7));
        Integer[] i8 = Arrays.copyOfRange(i3, 1, 8);
        System.out.println("i8: " + Arrays.toString(i8));                              //giống copy nhưng được chọn điểm bắt đầu
        List<Integer> list = Arrays.asList(i3);
        System.out.println("list: "+list);                                              //mảng wraper ->List
        System.out.println("Arrays.equals(i3,i4): "+Arrays.equals(i3,i4));              //so sánh hai mảng wraper

        String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
        String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };

        System.out.println("equals: "+Arrays.equals(s1, s2));                           //so sánh mảng 1 chiều
        System.out.println("deepEquals: "+Arrays.deepEquals(s1, s2));                   //so sánh mảng 2 chiều
//        https://topdev.vn/blog/lam-ban-ve-tham-chieu-tham-tri-trong-java/
//        https://chuyenmucit.code.blog/2020/08/01/van-de-ve-pointer-huong-doi-tuong/
    }


}
