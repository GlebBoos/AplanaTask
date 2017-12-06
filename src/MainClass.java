// Задание №3 Программа должна выполнять одно из заданий на выбор.
// Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
// Остальные задачи (4 и 5) тоже добавлены в менюшку

import java.util.Scanner;
import java.io.IOException;


public class MainClass
{
    public static void main(String... s) throws IOException, InterruptedException
    {
        boolean f;
        f=true;
        while (f)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Задание №3 (Боос Глеб) ");
            System.out.println("Выберите нобходимый пункт меню: ");
            System.out.println("1 - Калькулятор ");
            System.out.println("2-  Поиск максимально длинного слова");
            System.out.println("3-  *не создана*");
            System.out.println("4-  *не создана*");
            System.out.println("0-  Выход из задачи");
            int x = in.nextInt();
            switch (x)
            {
                case 1: new CalcAplana(); break;
                case 2: new MaxLengthElement(); break;
                //case 3:
                //case 4:
                case 0: f=false; break;
                default: System.out.println("Неверно введено значение");
            }
            //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            //Runtime.getRuntime().exec("cls");
        }
    }
}