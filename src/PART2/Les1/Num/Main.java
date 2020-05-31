//         5. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//           С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели
//           по заданному текущему дню. Возвращает кол-во оставшихся рабочих часов до конца
//          недели по заданному текущему дню. Считается, что
//             текущий день ещё не начался, и рабочие часы за него должны учитываться.
//           Если заданный день выходной то вывести "Сегодня выходной" public class DayOfWeekMain {
//              public static void main(String[] args) { System.out.println(getWorkingHours(DayOfWeek.MONDAY)); }


package PART2.Les1.Num;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        for (DayWeek w : DayWeek.values()) {

            System.out.println(w + "  - " + " \t день - " + w.getDay() + " \t количество рабочих часов дня  "
                    + w.getWorkingHours() + " \t количество не рабочих часов дня  " + w.getNoWorkingHours());

        }

      Day();

    }
    public static void Day() {
        DayWeek dW1 = DayWeek.Sunday;
//        dW1.getDay();
//        dW1.getWorkingHours();
//        dW1.getNoWorkingHours();
        DayWeek dW2 = PART2.Les1.Num.DayWeek.Monday;
//        dW2.getWorkingHours();
//        dW2.getNoWorkingHours();
        DayWeek dW3 = PART2.Les1.Num.DayWeek.Thursday;
        DayWeek dW4 = PART2.Les1.Num.DayWeek.Wednesday;
        DayWeek dW5 = PART2.Les1.Num.DayWeek.Tuesday;
        DayWeek dW6 = PART2.Les1.Num.DayWeek.Friday;
        DayWeek dW7 = PART2.Les1.Num.DayWeek.Saturday;

        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер от 0 до 6");

        int day_W = sc.nextInt();
        //int i = DayWeek.values().length;
        switch (day_W) {
            case (0):
                System.out.println(dW1 + " \t" + dW1.getDay());
                break;
            case (1):
                System.out.println(dW2 + "  - осталось рабочих часов до конца недели :" + (dW2.getWorkingHours() * 5));
                break;

            case (2):
                System.out.println(dW3 + "  - осталось рабочих часов до конца недели :" + (dW3.getWorkingHours() * 4));
                break;

            case (3):
                System.out.println(dW4 + "  - осталось рабочих часов до конца недели :" + (dW4.getWorkingHours() * 3));
                break;

            case (4):
                System.out.println(dW5 + "  - осталось рабочих часов до конца недели :" + (dW5.getWorkingHours() * 2));
                break;

            case (5):
                System.out.println(dW6 + "  - осталось рабочих часов до конца недели :" + dW2.getWorkingHours());
                break;

            case (6):
                System.out.println(dW7 + " \t" + dW7.getDay());
                break;

            default:
                System.out.println("Вы ввели неправильное число");
                break;

        }

//        Scanner cd = new Scanner(System.in);
//        int qw = cd.nextInt();
//        while (true) {
//            if (qw == day_W) {
//
//                System.out.println("введите номер от 0 до 6");
//
//                return;
//            } else  {
//                System.out.println();
//                break;
//            }
//        }
    }
}

//            if (day_W == 0){
//                System.out.println(dW1);
//                return;
//            } else if (day_W == 1){
//                System.out.println(dW2);
//                return;
//            } else if (day_W == 2){
//                System.out.println(dW3);
//                return;
//            } else if (day_W == 3){
//                System.out.println(dW4);
//                return;
//            } else if (day_W == 4){
//                System.out.println(dW5);
//                return;
//            } else if (day_W == 5){
//                System.out.println(dW6);
//                return;
//            } else if (day_W == 6){
//                System.out.println(dW7);
//                return;
//            }





   //         if (day_W.equals(PART2.Les1.Num.dayWeek[])) )
//            System.out.println(dayWeek.compareTo(dayWeek1));
//            System.out.println(dayWeek1.ordinal());


