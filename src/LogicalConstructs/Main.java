package LogicalConstructs;

import java.util.Scanner;

/*На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
Выведите true, если эти числа составляют валидную дату, и false - в противном случае. */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int month = sc.nextInt();
        int years = sc.nextInt();

        boolean notLeapYear = (years % 400 != 0 || years % 4 != 0 && years % 100 == 0) && (years >= 0);
        boolean leapYear = (years % 400 == 0 || years % 4 == 0 && years % 100 != 0) && (years >= 1584);


        if ((days > 0 && days <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && notLeapYear) {
            System.out.println("true");
        } else if ((days > 0 && days <= 30) && (month == 4 || month == 6 || month == 9 || month == 11) && notLeapYear) {
            System.out.println("true");
        } else if ((days > 0 && days <= 28) && (month == 2) && notLeapYear) {
            System.out.println("true");
        } else if ((days > 0 && days <= 29) && (month == 2) && leapYear) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
