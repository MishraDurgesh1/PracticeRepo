package Feb17;

import java.util.*;
public class First {


    public static void main(String [] args){
        //Convert Array in to String
        System.out.println("Hello");
        int [] age={12,11,23,16};
        System.out.println(Arrays.toString(age));
        //sorting of Array
        Arrays.sort(age);
        System.out.println(Arrays.toString(age));
        //Third-Highest age in array:-
        System.out.println(age[age.length-3]);

        char [] vowel={'a','e','o','i','u'};
        //Convert Array in to string:-
        System.out.println(Arrays.toString(vowel));
        //Sorting of Array:-
        Arrays.sort(vowel);
        System.out.println(Arrays.toString(vowel));

        //ArrayList:-
        List<Integer> integerList=new ArrayList<>();
        integerList.add(12);
        integerList.add(10);
        integerList.add(89);
        System.out.println(integerList);

        //Sorting of Arraylist by Collections methods:-
        Collections.sort(integerList);
        System.out.println(integerList);

        //String builder:-(Mutable)
        StringBuilder sb = new StringBuilder(9+9+"Hello Guys, Today i want to explain how java language work " + '\n' +
                "for any Application or software." + " World" + 12+5);
        sb.append(50);
        sb.delete(0,2);
        System.out.println(sb);

        //String Buffer :-(Mutable)
        StringBuffer sf=new StringBuffer("Ram and ");
        sf.append("Sita");
        System.out.println(sf);

        //Hash Set:-
        Set<Integer> integerSet=new HashSet<>(integerList);

        //Call the method:-
        detailOfName();

    }

    public static void detailOfName()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of Employee:- ");
        String name=scanner.nextLine();

       switch(name){
           case "durgesh":
               System.out.println("||"+"Name"+"-"+"Durgesh Mishra"+"||");
               break;
           case "aarush":
               System.out.println("||"+"Name"+"-"+"Aarush Mishra"+"||");
               break;
           case "siddhi":
               System.out.println("||"+"Name"+"-"+"Siddhi Mishra"+"||");
               break;
           default:
               System.out.println("Invalid selection!!!");
       }
    }




}

