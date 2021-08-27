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

        boolean isleapYear = (years % 400 == 0 || years % 4 == 0 && years % 100 != 0) && (years >= 1584);
        boolean monthWith31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean monthWith30Days = month == 4 || month == 6 || month == 9 || month == 11;

        if ( validNumberOfDays(days, 31) && monthWith31Days && !isleapYear) {
            System.out.println("true");
        } else if (validNumberOfDays(days, 30) && monthWith30Days && !isleapYear){
            System.out.println("true");
        } else if (validNumberOfDays(days, 28)&& (month == 2) && !isleapYear) {
            System.out.println("true");
        } else if (validNumberOfDays(days, 29) && (month == 2) && isleapYear) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean validNumberOfDays (int days, int lessThen){
        return days > 0 && days <= lessThen;
    }
}
