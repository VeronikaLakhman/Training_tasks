package LogicalConstructs2;
import java.util.Scanner;
import java.util.TreeSet;

/* На вход подаются три слова на одной строке, разделённые пробелом.
Выведите их в алфавитном порядке. Гарантируется, что слова начинаются с разных букв.
Sample Input:
Python Java C++

Sample Output:
C++
Java
Python
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        TreeSet<String> words = new TreeSet<>();
        words.add(a);
        words.add(b);
        words.add(c);
        for (String word : words){
            System.out.println(word);
        }

/*        char indexFirstWord = a.charAt(0);
        char indexSecondWord = b.charAt(0);
        char indexThirdWord = c.charAt(0);

        if ((indexFirstWord < indexSecondWord) && (indexSecondWord < indexThirdWord)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if ((indexFirstWord < indexThirdWord) && (indexThirdWord < indexSecondWord)) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if ((indexSecondWord < indexThirdWord) && (indexThirdWord < indexFirstWord)) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if ((indexSecondWord < indexFirstWord) && (indexFirstWord < indexThirdWord)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if ((indexThirdWord < indexFirstWord) && (indexFirstWord < indexSecondWord)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if ((indexThirdWord < indexSecondWord) && (indexSecondWord < indexFirstWord)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } */
    }
}
