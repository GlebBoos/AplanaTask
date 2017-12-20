//Задача №8: Доработка задачи с подарком. Добавлено обращение с коллекциями типа List.

import java.util.Scanner;
//import java.io.IOException;
import java.util.ArrayList;


class Present4
{
    ArrayList<String> name = new ArrayList<String>(); // Название сладсти
    ArrayList<String> weight = new ArrayList<String>(); // Вес сладости
    ArrayList<String> price = new ArrayList<String>(); // Цена сладости
    ArrayList<String> id = new ArrayList<String>(); // Уникальный номер сладости
}

class NewYearPresent3 {
    static void menu()
    {
        System.out.println("Задание №8 (Боос Глеб) ");
        System.out.println("Выберите нобходимый пункт меню: ");
        System.out.println("1-  Добавление новых данных в таблицу");
        System.out.println("2-  Удаление данных из таблицы");
        System.out.println("3-  Подсчет показателей");
        System.out.println("4-  Вывод текущей таблицы");
        System.out.println("0-  Выход из задачи");
    }
    static void CountDate(Present2[] arr)
    {
        int n=arr.length;
        double sumW=0.0,sumCost=0.0;
        for (int i=0;i<n;i++) {
            sumW=sumW+arr[i].weight;
            sumCost=sumCost+arr[i].price;
        }
        System.out.println("");
        System.out.println("");
        System.out.printf("Суммарный вес сладостей и всего подарка: %.2f \n",sumW);
        System.out.printf("Суммарная стоимость всех сладостей и всего подарка: %.2f \n",sumCost);
        System.out.println("");
        System.out.println("");
    }
    NewYearPresent3()
    {
        int n=1,x;
        boolean f;
        f=true;
        Scanner ini = new Scanner(System.in);
        System.out.println("Введите кол-во подарков: ");
        n = ini.nextInt();
        Present4 Box= new Present4();
        for (int i=0;i<n;i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название сладости ");
            Box.name.add(in.nextLine());
            System.out.println("Введите вес сладости ");
            Box.weight.add(in.nextLine());
            System.out.println("Введите цену сладости ");
            Box.price.add(in.nextLine());
            System.out.println("Введите ID сладости ");
            Box.id.add(in.nextLine());
            System.out.println("");
        }
        for (int i=0;i<n;i++) {
            String a,b,c,d;
            a=Box.name.get(i);
            b=Box.weight.get(i);
            c=Box.price.get(i);
            d=Box.id.get(i);
            System.out.printf(" | %s | %s | %s | %s | \n",a,b,c,d);
        }
        //System.out.println(Box.name.get(1));
        //System.out.println(Box.name);
    }
}
