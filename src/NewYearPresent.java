//Задача №5: Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.) э
// У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
// Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.

import java.util.Scanner;
import java.io.IOException;

class Present
{
    String name; //Название сладости
    float weight; // Вес сладости
    float price; // Цена сладости
    int id; // Уникальный номер сладости
}
class NewYearPresent
{
        NewYearPresent()
        {
            int n;
            Scanner ini = new Scanner(System.in);
            System.out.println("Задача №5 (Боос Глеб)");
            System.out.println("Введите кол-во подарков: ");
            n = ini.nextInt();
            Present Box[]= new Present[n];
            for (int i=0;i<n;i++) {
                Box[i]=new Present();
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

