package L2;


/*
// 1 Создать переменные всех пройденных типов данных и инициализировать их значения.
// 2 (Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//   где a, b, c, d – аргументы этого метода, имеющие тип float.)
// 3 (Написать метод, принимающий на вход два целых числа и проверяющий,
//   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.)
// 4 (Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//   положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.)

// 5 (Написать метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное.)
// 6 (Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//   Метод должен вывести в консоль сообщение «Привет, указанное_имя!».)
// 7 (*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.)

//number 0 нулевой
/*
public class LessonFirst {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}

 */

// number1
// 1 Создать переменные всех пройденных типов данных и инициализировать их значения.
/*
public class LessonFirst {
    public static void main(String[] args){
     byte a = 10;
     short b = 300;
     int c = 3000;
     long d = 30000L;
     boolean e, f;
     e = true;
     f = false;
     float g = 3.15f;
     double h = 3.155;
     char ch = '*';  // кодировка юникод

     }
}
*/

//number2
// 2 (Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//   где a, b, c, d – аргументы этого метода, имеющие тип float.)

/*
public class LessonFirst {
    public static void main(String[] args) {
        float a, b, c, d, e;
        a = 2.5f;
        b = 5.2f;
        c = 2.2f;
        d = 1.5f;
        e = (a * (b + (c / d)));
        System.out.println(e);
    }
    public static float summ(float a, float b, float c, float d) {
        a = 2.5f;
        b = 5.2f;
        c = 2.2f;
        d = 1.5f;

        return a + b + c +d;
    }
}
*/


// number 3
// 3 (Написать метод, принимающий на вход два целых числа и проверяющий,
//   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a, b;
        a = 8;
        b = 10;

        boolean c, d;
        c = true;
        if ((a + b) >= 10 | (a + b) <= 20) {
            System.out.println(c);
        }

        d = false;
        if ((a + b) <= 10 | (a + b) >= 20) {
            System.out.println(d);
        }

    }
    public static int summ(int a, int b) {
        a = 8;
        b = 10;

        return a + b;
    }
}

 */
// number 4
// 4 (Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//   положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a;
        a = 5;
        int b = 0;
        int c = -5;
        if (a <= b) {
            System.out.println("число отрицательное");
        }
        if (a >= b) {
            System.out.println("Число положительное");
        }
        if (b == 0) {
            System.out.println("ноль положителен");
        }
        if (c <= a | c <= b) {
            System.out.println("число отрицательное");
        }
    }
    public static int summ(int a, int b, int c) {
         a = 5;
         b = 0;
         c = -5;
         return a + b + c;
    }
}
*/

// number 5
// 5 (Написать метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a;
        a = -5;
        boolean b, c;
        b = true;
        if (a <= 0) {
            System.out.println("число отрицательное");
        }
        c = false;
        if (a >= 0) {
            System.out.println("Число положительное");
        }
    }
}
*/

//number 6
// 6 (Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//   Метод должен вывести в консоль сообщение «Привет, указанное_имя!».)
/*
public class LessonFirst {
    public static void main(String[] args) {
        printMyText("ПРИВЕТ ВСЕМ");
    }

    public static void printMyText(String txtToPrint) {
          System.out.println("ПРИВЕТ ВСЕМ");
      }


     //   public static void greetings(String name){
     //         System.out.println("ПРИВЕТ ВСЕМ");
     //     }  // не понятно

}

 */

// number 7
// 7 (*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
////   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a;
        a = 2020; // точка отчета
        int b = 4;  //интервал между годами, когда високосный
        int d = (a + b);  // след.год високосный
        int c = (a + 100);  // точка отчета, каждый сотый год невисокосный
        int e = (a + 400);  // точка отчета, каждый четырехсотый год високосный
        System.out.println("ГОД ВИСОКОСНЫЙ" + "\t" + a + "г");
        System.out.println("каждый четвертый ГОД ВИСОКОСНЫЙ" + "\t" + d + "г");
        System.out.println("ГОД НЕВИСОКОСНЫЙ" + "\t" + c + "г");
        System.out.println("ГОД ВИСОКОСНЫЙ" + "\t" + e + "г");
        boolean z, x, v;
        z = true;
        if (a == 2020 | d == e) {
            System.out.println("високосный год" + "\t" + a + "г" + "\t" + d + "г" + "\t" + e + "г");

        }

        x = false;
        if (a != c | d != c) {
            System.out.println("невисокосный" + "\n" + "\t\t" + "год" + "\t\t\t" + c + "г");
        }
    }
}
 */

    /*
    // здесь ошибки к №7
      int a, b, c, d, e;
      for (a = 2020; b = 4; c = (a + b); d = 100; e = (a + d); c != e | a <= c; a++) {
      System.out.println(a);
      }
      // понять формулу нужно цикла,  но наверно списком нужно выводить года а как ? do while
}
*/
/*
public class LessonFirst {
        public static void main(String[] args) {
            System.out.print("Hello World");
        }
    }
*/

//     LESSON 2 _________________________________________________________________

//  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
//     0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
/*
public class LessonFirst {
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int c = arr.length;
        int d;
        for (int i = 0; i < (arr.length + 1) / 2; i++) {             // пришлось воспользоваться инетом кое где
            d = arr[c - i - 1];
            arr[c - i - 1] = arr[i];
            arr[i] = d;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
 */
//  2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
//        значениями 0 3 6 9 12 15 18 21;
/*
public class LessonFirst {
    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 0;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 9;
        arr[4] = 12;
        arr[5] = 15;
        arr[6] = 18;
        arr[7] = 21;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//        умножить на 2;
/*
public class LessonFirst {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int z = arr.length;
        for (int i = 0; i < z; i++) {
            if (arr[i] < 6) arr[i] *=2;
            }
        for (int i = 0; i < z; i++) {
          System.out.print(arr[i] + " ");

        }
    }
}
*/
//      4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//       одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

/*    // не верно!!!!
  public class LessonFirst {
    public static void main(String[] args) {
        int a = 1;
        int s;

        int[][] table = new int[6][6];


        for (int i = 0; i < 6; i++) {
            for (s = 0; s < 6; s++) {
                table[i][s] = a;
                System.out.print(a + "\t");
                a++;
            }
            System.out.println();
        }
    }
  }
*/


/*        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
        помощи интернета);
        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
        массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, ||
        2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть
        положительным, или отрицательным), при этом метод должен сместить все элементы
        массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
        массивами.
*/
//________________________________________________________________________________________________
/*
Написать программу, которая загадывает случайное число от 0 до 9,
 и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер
 должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
 После победы или проигрыша выводится запрос – «Повторить игру еще раз?
 1 – да / 0 – нет»(1 – повторить, 0 – нет)
 */
import java.util.Scanner;
//import java.util.Random;

class L2{
    public static void main(String[] args) {
        System.out.println("Угадай число от 0 до 9 за три попытки!!!");
        System.out.println("ВВЕДИТЕ ЧИСЛО :  ");

        for (int i = 1; i <= 3; i++) {
            int s = 2;
            Scanner scan = new Scanner(System.in);
            int aq = scan.nextInt();
            int numb = s;

            if (aq == numb) {
                System.out.println("УГАДАЛ ЭТО " + numb);
                break;
            }
            else   if (aq < numb) {
                System.out.println("ЗАГАДАННОЕ ЧИСЛО больше " + aq);

            }
            else if (aq > numb) {
                System.out.println("ЗАГАДАННОЕ ЧИСЛО меньше " + aq);

            }

            System.out.println( );

        }
        System.out.println("Повторить игру еще раз?" + " 1 – да / 0 – нет");
        int e = 1;
        int r = 0;
        Scanner cd = new Scanner(System.in);
        int qw = cd.nextInt();
        while (true) {
            if (qw == e) {
                System.out.println();

                System.out.println("Угадай число от 0 до 9 за три попытки!!!");
                System.out.println("ВВЕДИТЕ ЧИСЛО :  ");
                return;
            }
            else if(qw == r)  {
                System.out.println();
                break;
            }
            /// не доконца выполнена программма так как не поймй как возвратить на круг
        }



    }
}