//Задача №6: Доработка задачи с подарком. Добавлены функции для удобного вывода, добавлено наследование,
//добавлен ввод с клавиатуры, удаление и добавление новых строк таблицы данных.

import java.util.Scanner;
//import java.io.IOException;


class Present3
{
    String country;
}
class Present2 extends Present3
{
    String name; //Название сладости
    float weight; // Вес сладости
    float price; // Цена сладости
    int id; // Уникальный номер сладости
}
class NewYearPresent2
{
    //Создание меню для работы с задачей
    static void menu()
    {
        System.out.println("Задание №6 (Боос Глеб) ");
        System.out.println("Выберите нобходимый пункт меню: ");
        System.out.println("1-  Добавление новых данных в таблицу");
        System.out.println("2-  Удаление данных из таблицы");
        System.out.println("3-  Подсчет показателей");
        System.out.println("4-  Вывод текущей таблицы");
        System.out.println("0-  Выход из задачи");
    }

    //4-Подсчет показателей
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
    //5-Вывод текущей таблицы
    static void datePrint(Present2[] arr)
    {
        int n=arr.length;
        for (int i=0;i<n;i++) {
            System.out.printf("%d | %s | %.2f | %.2f | %d | %s |\n",i+1,arr[i].name,arr[i].weight,arr[i].price,arr[i].id,arr[i].country);
        }
        System.out.println("");
        System.out.println("");
    }

    NewYearPresent2()
    {
        int n,x;
        boolean f;
        f=true;
        Scanner ini = new Scanner(System.in);
        System.out.println("Введите кол-во подарков: ");
        n = ini.nextInt();
        Present2 Box[]= new Present2[n];
        for (int i=0;i<n;i++) {
            Box[i]=new Present2();
        }
        for (int i=0;i<n;i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите название сладости ");
            Box[i].name = in.nextLine();
            System.out.println("Введите вес сладости ");
            Box[i].weight = in.nextFloat();
            System.out.println("Введите цену сладости ");
            Box[i].price = in.nextFloat();
            System.out.println("Введите ID сладости ");
            Box[i].id = in.nextInt();
            System.out.println("Введите страну производителя");
            Box[i].country = in.nextLine();
            System.out.println("");
        }
        while (f)
        {
            Scanner ing = new Scanner(System.in);
            menu();
            x = ing.nextInt();
            switch (x) {
                case 1: //addElement(Box);
                    {
                        int n1=n+1;
                        Present2 Box1[]= new Present2[n1];
                        for (int i=0;i<n1;i++) {
                            Box1[i]=new Present2();
                        }
                        for (int i=0;i<n;i++) {
                            Box1[i]=Box[i];
                        }
                        Scanner inr = new Scanner(System.in);
                        System.out.println("Введите название сладости ");
                        Box1[n].name = inr.nextLine();
                        System.out.println("Введите вес сладости ");
                        Box1[n].weight = inr.nextFloat();
                        System.out.println("Введите цену сладости ");
                        Box1[n].price = inr.nextFloat();
                        System.out.println("Введите ID сладости ");
                        Box1[n].id = inr.nextInt();
                        System.out.println("Введите страну производителя");
                        Box1[n].country = inr.nextLine();
                        System.out.println("");
                        Box=Box1;
                        n++;
                    }
                    break;
                case 2:
                    {
                        Scanner ini2 = new Scanner(System.in);
                        System.out.println("Введите номер строки из таблицы, которую нужно удалить: ");
                        System.out.println(" ");
                        int j = ini2.nextInt();

                        int n2=n-1;
                        Present2 Box2[]= new Present2[n2];
                        for (int i=0;i<n2;i++) {
                            Box2[i]=new Present2();
                        }
                        if (j==1) {
                            for (int i=1; i<n;i++)
                                Box2[i-1]=Box[i];
                        }
                        if (j==n) {
                            for (int i = 0; i<n2; i++)
                                Box2[i] = Box[i];
                        }
                        if ((j!=n)&&(j!=1))
                        {
                            for (int i=0;i<j-1;i++) {
                                Box2[i]=Box[i];
                            }
                            for (int i=j;i<n;i++) {
                                Box2[i-1]=Box[i];
                            }
                        }
                        Box=Box2;
                        n--;
                        //removeElement(Box,j);
                    }
                    break;
                case 3: CountDate(Box);
                    break;
                case 4: datePrint(Box);
                    break;
                case 0:
                    f = false;
                    break;
                default:
                    System.out.println("Неверно введено значение");
            }
        }
    }
}

