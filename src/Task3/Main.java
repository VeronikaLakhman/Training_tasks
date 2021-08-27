package Task3;
import java.util.Scanner;
/*ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты различаются.
 Разработчики решили объявить забастовку, если разница максимальной и минимальной зарплаты превысит определённый уровень.
Определите, грозит ли ООО "Круче Гугла" забастовка.
Формат ввода:
В первой строке - зарплаты разработчиков через пробел, три целых числа.
Во второй строке - разница, при превышении которой будет объявлена забастовка.
Формат вывода:
"Ура, бастуем!" - если критический уровень превышен;
"За работу, Солнце ещё высоко" - если критический уровень не превышен.
Sample Input:
300 400 500
100
Sample Output:
Ура, бастуем!
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int levelOfExcess = sc.nextInt();
        int sal1 = Integer.parseInt(a);
        int sal2 = Integer.parseInt(b);
        int sal3 = Integer.parseInt(c);

        int max = Math.max(Math.max(sal1, sal2), sal3);
        int min = Math.min(Math.min(sal1, sal2), sal3);

        if (differenceBetweenMinAndMax(max, min) > levelOfExcess) {
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко");
        }
    }
    static int differenceBetweenMinAndMax(int max, int min) {
        return max - min;
    }
}
