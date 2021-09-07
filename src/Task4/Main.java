package Task4;
import java.util.Scanner;
/* На вход подаётся целое трёхзначное число, а затем цифра.
Выведите true, если эта цифра является средней в числе (разряд десятков),
и false - если нет. Если введённое число не является трёхзначным, выведите "error".
Sample Input:
123 2

Sample Output:
true
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int d = sc.nextInt();
        e = Math.abs(e);
        if (!(100 <= e && e <= 999)){
            System.out.println("error");
        }else if ((e%=100)/10 == d){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
