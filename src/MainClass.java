// Задание №3 Программа должна выполнять одно из заданий на выбор.
// Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
// Остальные задачи (4 и 5) тоже добавлены в менюшку

import java.util.Scanner;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.awt.Dimension;
import javax.swing.ImageIcon;

 public class MainClass
{
    public static void main(String... s) throws IOException, InterruptedException
    {
        JFrame fr; //Фрейм
        JButton z1,z2,z3,z4,z5,z6,z7,z8,z0; //Кнопки числовых значений
        boolean f;
        f=true;
        while (f)
        {
            fr=new JFrame("Aplana Java Course 2.0 - Boos G.O.");
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setSize(400,420);
            fr.setLocationRelativeTo(null); //отцентровка
            fr.getContentPane().setBackground(new Color(255, 255, 255));

            z1=new JButton("Задача 1: Калькулятор");
            z2=new JButton("Задача 2: Поиск самого короткого слова");
            z3=new JButton("Задача 3: Смена мест MAX и MIN в массиве Random ");
            z4=new JButton("Задача 4: Расчет подарка версия 1.0");
            z5=new JButton("Задача 5: Расчет подарка версия 2.0");
            z6=new JButton("Задача 6: Расчет подарка версия 3.0");
            z7=new JButton("Задача 7: UNIT тесты для простого расчета");
            z8=new JButton("Задача 8: *Недоступно*");
            z0=new JButton("Выход из программы");

            z1.setBounds(10,20,365,20);
            z2.setBounds(10,60,365,20);
            z3.setBounds(10,100,365,20);
            z4.setBounds(10,140,365,20);
            z5.setBounds(10,180,365,20);
            z6.setBounds(10,220,365,20);
            z7.setBounds(10,260,365,20);
            z8.setBounds(10,300,365,20);
            z0.setBounds(10,340,365,20);

            fr.add(z1); fr.add(z2); fr.add(z3);
            fr.add(z4); fr.add(z5); fr.add(z6);
            fr.add(z7); fr.add(z8); fr.add(z0);

            z1.setBackground(new Color(255,255,255)); z2.setBackground(new Color(255,255,255));
            z3.setBackground(new Color(255,255,255)); z4.setBackground(new Color(255,255,255));
            z5.setBackground(new Color(255,255,255)); z6.setBackground(new Color(255,255,255));
            z7.setBackground(new Color(255,255,255)); z8.setBackground(new Color(255,255,255));
            z0.setBackground(new Color(255,255,255));


            fr.setLayout(null);
            fr.setVisible(true);
            fr.setResizable(false);


            Scanner in = new Scanner(System.in);
            System.out.println("Задание №3 (Боос Глеб) ");
            System.out.println("Выберите нобходимый пункт меню: ");
            System.out.println("1 - Калькулятор ");
            System.out.println("2-  Поиск максимально длинного слова");
            System.out.println("3-  Поменять местами MAX и MIN в рандомном массиве");
            System.out.println("4-  Подсчет подарка");
            System.out.println("5-  Подсчет подарка 2.0 (наследование)");
            System.out.println("6-  Подсчет подарка 3.0 (коллекции) ");
            System.out.println("7-  Вызов UNIT тестов для последней задачи");
            System.out.println("0-  Выход из задачи");
            int x = in.nextInt();
            switch (x)
            {
                case 1: new CalcAplana(); break;
                case 2: new MaxLengthElement(); break;
                case 3: new RandomMassive(); break;
                case 4: new NewYearPresent(); break;
                case 5: new NewYearPresent2(); break;
                case 6: new NewYearPresent3(); break;
                case 7: new UnitTests(); break;
                case 0: f=false; break;
                default: System.out.println("Неверно введено значение");
            }
        }
    }
}