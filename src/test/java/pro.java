import groovy.json.JsonOutput;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class pro {
    public static void main(String[] args) {
//       listToSet();
//        pro.setToList();
        highestNumber();
        minimumValue();
    }
    public static void listToSet(){
        List<Integer> list=new LinkedList<>();
        list.add(12);list.add(12);list.add(11);list.add(7);list.add(57);
        for (Integer listNew:list
             ) {
            System.out.print(" "+listNew);
        }
        //List to Set (remove all duplicate values from list because Set is not allowed duplicate values)
        Set<Integer> integerSet=new HashSet<>(list);
        System.out.println(integerSet);
    }
    public static List setToList(){
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(32);
        set.add(12);
        set.add(45);
        System.out.println(set);
        List<Integer> list=new LinkedList<>(set);
        System.out.println(list);
        return list;
    }
    public static void highestNumber(){
        List<Integer> list=new LinkedList<>();
        list.add(12);list.add(12);list.add(11);list.add(7);list.add(57);
        int highestNumber=Integer.MIN_VALUE;
        for (int n:list){

            if(n>highestNumber){
                highestNumber=n;
            }
        }
        System.out.println("The maximum value is: "+highestNumber);
    }
    public static void minimumValue(){
            List<Integer> numbers = new LinkedList<>();
            numbers.add(12);
            numbers.add(12);
            numbers.add(11);
            numbers.add(7);
            numbers.add(57);

            int minValue = Integer.MAX_VALUE;

            for (int number : numbers) {
                if (number < minValue) {
                    minValue = number;
                }
            }

            System.out.println("The minimum value is: " + minValue);
        }

}
