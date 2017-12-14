//Задача №6;

import java.util.Scanner;
//import java.io.IOException;



class Present2
{
    String name; //Название сладости
    float weight; // Вес сладости
    float price; // Цена сладости
    int id; // Уникальный номер сладости
}
class NewYearPresent2
{
    //Создание меню для работы с задачей
    public void menu()
    {
        System.out.println("Задание №6 (Боос Глеб) ");
        System.out.println("Выберите нобходимый пункт меню: ");
        System.out.println("1 - Ввод данных по кондитерским изделиям ");
        System.out.println("2-  Добавление новых данных в таблицу");
        System.out.println("3-  Удаление данных из таблицы");
        System.out.println("4-  Подсчет показателей");
        System.out.println("5-  Вывод текущей таблицы");
        System.out.println("0-  Выход из задачи");
    }

    //1- Ввод элементов массива по классу
    public void addarray(String N, float x, float y, int i)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название сладости ");
        N = in.nextLine();
        System.out.println("Введите вес сладости ");
        x = in.nextFloat();
        System.out.println("Введите цену сладости ");
        y= in.nextFloat();
        System.out.println("Введите ID сладости ");
        i = in.nextInt();
        System.out.println("");
    }

    //2-Функция добавления элемента массива
    public void addElement(Present2[] arr, int addIdx)
    {
        int n=arr.length;
        n=n+1;
        addarray(arr[n].name,arr[n].weight,arr[n].price,arr[n].id);
    }
    //3-Функция удаление элемента массива
    public void removeElement(Object[] arr, int removedIdx)
    {
        System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
    }
    //4-Подсчет показателей
    public void pokaz(Present2[] arr)
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
        for (int i=0;i<n;i++) {
            System.out.printf("%s | %.2f | %.2f | %d |\n",arr[i].name,arr[i].weight,arr[i].price,arr[i].id);
        }
        System.out.println("");
        System.out.println("");
    }
    //5-Вывод текущей таблицы
    public void datePrint(Present2[] arr)
    {
        int n=arr.length;
        for (int i=0;i<n;i++) {
            System.out.printf("%s | %.2f | %.2f | %d |\n",arr[i].name,arr[i].weight,arr[i].price,arr[i].id);
        }
        System.out.println("");
        System.out.println("");
    }


    static void main()
    {
        boolean f;
        f=true;
        while (f) {
            Scanner in = new Scanner(System.in);

            int x = in.nextInt();
            switch (x) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    f = false;
                    break;
                default:
                    System.out.println("Неверно введено значение");
            }
        }
    }

    NewYearPresent2()
    {
        int n;
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
            System.out.println("");
        }
        double sumW=0.0,sumCost=0.0;
        for (int i=0;i<n;i++) {
            sumW=sumW+Box[i].weight;
            sumCost=sumCost+Box[i].price;
        }
        System.out.println("");
        System.out.println("");
        System.out.printf("Суммарный вес сладостей и всего подарка: %.2f \n",sumW);
        System.out.printf("Суммарная стоимость всех сладостей и всего подарка: %.2f \n",sumCost);
        System.out.println("");
        System.out.println("");
        for (int i=0;i<n;i++) {
            System.out.printf("%s | %.2f | %.2f | %d |\n",Box[i].name,Box[i].weight,Box[i].price,Box[i].id);
        }
        System.out.println("");
        System.out.println("");
        //System.out.println("Введите данные по сладостям в подарке");
    }
}

