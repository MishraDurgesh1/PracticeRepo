import java.util.*;
import java.util.stream.Collectors;

public class doubts {
    public static void main(String[] args) {
        pro();
    }
    public static void pro(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8));
        System.out.println("Print list by ForEach Loop");
        for (Integer number : numbers) {
            System.out.print(number+"");
        }
        System.out.println();
        Iterator<Integer> iterator= numbers.iterator();
        System.out.println("Print list by Iterator");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"");}
        System.out.println();
        Collections.sort(numbers);
        System.out.println("Sort list by collections "+numbers);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("without repeated number "+collect);

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,4,12,6,3,7));
        List<Integer> list2=new ArrayList<>(Arrays.asList(2,1,3,4,87));
        list1.removeAll(list2);
        System.out.println("List1-List2 => " +list1);
        System.out.println("---------------------");
        String s="Hello Ram Ji";
        StringBuffer stringBuffer=new StringBuffer(s);
        System.out.println(stringBuffer.reverse());
        int num = 12345;
        String str="Durgeeeesh";
        //System.out.println(stringBuffer.append(string).reverse());
      //We can reverse string with StringBuilder:-
        StringBuilder stringBuilder=new StringBuilder(str);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
        //length of any string
        char[] chars = str.toCharArray();
        int length = chars.length;
        System.out.println(length);
        System.out.println(str.lastIndexOf('h')+1);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(1);
        Iterator<Integer> iterator1=arrayList.iterator();
        while(iterator1.hasNext()) {
            System.out.print(iterator1.next()+" ");
        }
        System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.stream().collect(Collectors.toSet()));
        System.out.println("Hashset is "+new HashSet<>(arrayList));
        HashSet<Integer> hashSet=new HashSet<>(arrayList);
        System.out.println(hashSet);
        System.out.println("------------------------");
        int[] marks={12,11,2,34,90};
        OptionalDouble average = Arrays.stream(marks).average();
        System.out.println(average);
//        for (Integer s2:marks
//             ) {
//            System.out.println(s2);
//        }

    }

}
