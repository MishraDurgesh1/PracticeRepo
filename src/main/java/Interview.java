import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Interview {
    public static void main(String[] args) throws IOException {
        //reverseNumber();
        // printAlphabet();
        reverseString();

    }

    public static void reverseNumber() {

        int n;
        int rev = 0;
        System.out.println("Enter Number :-");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n != 0) {
            rev = rev * 10;
            rev = rev + n % 10;
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void printAlphabet() {
        char ch;
        for (ch = 'a'; ch < 'z'; ch++) {
            System.out.print("Small letters = " + ch + "-");
        }
        System.out.println();
        for (ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print("Capital Letter =" + ch + "-");
        }
    }

    public static void reverseString() throws IOException {
        StringBuffer stringBuffer = new StringBuffer("hello world ");
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        //compare strings:-
        String s1 = " hello Pratapgarh ";
        String s2 = "Kanpur";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.replace('h', 'Z'));
        System.out.println(s1.replaceAll("ell", "abb"));
        System.out.println(s1.substring(1));
        System.out.println("-----------");
        System.out.println(s1.trim());
//get Time:-
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        System.out.println(formatter.format(date));
//get IP Address:-
        System.out.println(InetAddress.getLocalHost());
//open Notepad:-
        System.out.println(Runtime.getRuntime().exec("notepad"));

    }
}

