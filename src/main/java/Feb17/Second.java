package Feb17;

import java.util.*;
import java.util.stream.Collectors;

public class Second {
    
    public static int [] l=new int[]{12,1,4,3,90,45};
    List<Integer> hello=new LinkedList<>();
    public static void arrayOperation(int [] marks){
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
    }

    public static void vowel(char[] vow){
        Arrays.sort(vow);
        System.out.println(Arrays.toString(vow));
    }

    public static void listPractice(){
       List<Integer> list=new LinkedList<>();
       list.add(12);list.add(11);list.add(17);list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void arrayList(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(12);integers.add(11);integers.add(2);integers.add(67);
        Collections.sort(integers);
        System.out.println(integers);
    }

    public static void vectorList(){
        Vector<Integer> vector = new Vector<>();
        vector.add(12);vector.add(89);vector.add(2);vector.add(37);
        Collections.sort(vector);
         System.out.println("Vector is Sorted by collection class =>"+vector);
         //Sorting by Stream:-
        List<Integer> collect = vector.stream().sorted().collect(Collectors.toList());
        System.out.println("Vector is sorted by Stream class =>"+collect);
        vector.add(222);
        System.out.println(vector);
    }
    public static void hashMapPractice(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"ram");hashMap.put(5,"sita");hashMap.put(3,"madhav");hashMap.put(4,"suresh");
        System.out.println(hashMap);

    }
    public static void hashTreePractice(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);hashSet.add(2);hashSet.add(37);
        System.out.println(hashSet);
    }
    public static void hashPractice(){
        Hashtable<Integer,String> o=new Hashtable<>();
        o.put(1,"a");o.put(3,"c");o.put(4,"d");o.put(2,"b");
        System.out.println(o);
    }
    public static void treeSetPractice(){
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(12);treeSet.add(2);treeSet.add(11);
        System.out.println(treeSet);
    }

    public static void treeMapPractice(){
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"A");treeMap.put(2,"B");treeMap.put(4,"D");treeMap.put(3,"h");
        System.out.println(treeMap);
    }
    public static void pro(){
        List<Integer> h=new LinkedList<>();
        h.add(12);
        h.add(11);
        h.add(2);
        h.add(23);
//        for (Integer i:h
//             ) {
//            System.out.println("pro details is => "+i);
//        }
        System.out.println(h);
        List<Integer> evenList = h.stream().filter(p -> p%2 == 0).collect(Collectors.toList());
        System.out.println("Collection is = "+evenList);
       // System.out.println("count is "+count);
    }
    public static void main(String [] args){
//        arrayOperation(new int[]{12,11,13,9,16});
//        vowel(new char[]{'e','a','u','o','i'});
//        listPractice();
//        arrayList();
        vectorList();
//        hashMapPractice();
//        hashTreePractice();
//        hashPractice();
//        treeSetPractice();
//        treeMapPractice();
//        pro();

    }
}
