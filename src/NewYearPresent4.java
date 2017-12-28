//Задача №9: Доработка задачи с подарком. Выгрузка данных из файла, запись данных в файл.

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

class  Present5
{
    ArrayList<String> name = new ArrayList<String>(); // Название сладсти
    ArrayList<String> weight = new ArrayList<String>(); // Вес сладости
    ArrayList<String> price = new ArrayList<String>(); // Цена сладости
    ArrayList<String> id = new ArrayList<String>(); // Уникальный номер сладости
}

class NewYearPresent4 {
    static void menu()
    {
        System.out.println("Задание №8 (Боос Глеб) ");
        System.out.println("Выберите нобходимый пункт меню: ");
        System.out.println("1-  Добавление новых данных в таблицу");
        System.out.println("2-  Удаление данных из таблицы");
        System.out.println("3-  Подсчет показателей");
        System.out.println("4-  Вывод текущей таблицы");
        System.out.println("5-  Просмотр записей из файла");
        System.out.println("6-  Добавление новых записей из файла");
        System.out.println("7-  Запись текущей таблицы в файл");
        System.out.println("0-  Выход из задачи");
    }
    NewYearPresent4()
    {
        int n=0,x;
        boolean f;
        f=true;
        String line;

        Scanner ini = new Scanner(System.in);
        System.out.println("Введите кол-во подарков: ");
        n = ini.nextInt();
        Present5 Box= new Present5();
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
        while (f) {
            Scanner ing = new Scanner(System.in);
            menu();
            x = ing.nextInt();
            switch (x) {
                case 1: {
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
                    n++;
                }
                break;
                case 2: {
                    Scanner ini2 = new Scanner(System.in);
                    System.out.println("Введите номер строки из таблицы, которую нужно удалить: ");
                    System.out.println(" ");
                    int j = ini2.nextInt();
                    Box.name.remove(j-1);
                    Box.weight.remove(j-1);
                    Box.price.remove(j-1);
                    Box.id.remove(j-1);
                    n--;
                }
                break;
                case 3:{
                    double sumW=0.0,sumCost=0.0;
                    for (int i = 0; i < n; i++) {
                        try {
                            double x1 = Double.parseDouble(Box.weight.get(i));
                            double y1 = Double.parseDouble(Box.price.get(i));
                            sumW=sumW+x1;
                            sumCost=sumCost+y1;
                        }
                        catch (NumberFormatException e) {
                            System.err.println("Неверный формат числа");
                        }
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.printf("Суммарный вес сладостей и всего подарка: %.2f \n",sumW);
                    System.out.printf("Суммарная стоимость всех сладостей и всего подарка: %.2f \n",sumCost);
                    System.out.println("");
                    System.out.println("");
                }
                break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        String a, b, c, d;
                        a = Box.name.get(i);
                        b = Box.weight.get(i);
                        c = Box.price.get(i);
                        d = Box.id.get(i);
                        System.out.printf(" | %s | %s | %s | %s | \n", a, b, c, d);
                    }
                break;
                case 5: {
                    BufferedReader readFromFile = null;
                    try {
                        readFromFile = new BufferedReader(new FileReader("FileV.txt"));
                        System.out.println(" ");
                        while ((line = readFromFile.readLine()) != null) {
                            System.out.println(line);
                        }
                        System.out.println(" ");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (readFromFile != null)
                            try {
                                readFromFile.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                    }
                }
                break;
                case 6: {
                    BufferedReader readFromFile = null;
                    try {
                        readFromFile = new BufferedReader(new FileReader("FileV.txt"));
                        System.out.println(" ");
                        String line1 =readFromFile.readLine();
                        char[] CharArray=line1.toCharArray();
                        boolean flag=false;
                        while (f)
                        {
                            String name1="",weight1="",price1="",id1="";
                            int i1=0,i2=0,i3=0,i4=0;
                            char k=' ',k1='\n';
                            String k3=null;
                            for (int i=0; i<CharArray.length; i++)
                            {
                                if (CharArray[i]==k)
                                {
                                    Box.name.add(name1);
                                    i1=i+1;
                                    break;
                                }
                                name1=name1+CharArray[i];
                            }
                            for (int i=i1; i<CharArray.length; i++)
                            {
                                if (CharArray[i]==k)
                                {
                                    Box.weight.add(weight1);
                                    i2=i+1;
                                    break;
                                }
                                weight1=weight1+CharArray[i];
                            }
                            for (int i=i2; i<CharArray.length; i++)
                            {
                                if (CharArray[i]==k)
                                {
                                    Box.price.add(weight1);
                                    i3=i+1;
                                    break;
                                }
                                price1=price1+CharArray[i];
                            }
                            for (int i=i3; i<CharArray.length; i++)
                            {
                                if (CharArray[i]==k1)
                                {
                                    Box.price.add(weight1);
                                    i4=i+1;
                                    break;
                                }
                                if (i==(CharArray.length-1))
                                {
                                    Box.price.add(weight1);
                                    i4=i+1;
                                    flag=true;
                                    break;
                                }
                                id1=id1+CharArray[i];
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if (readFromFile != null)
                            try {
                                readFromFile.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                    }
                }
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
