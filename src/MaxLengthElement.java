// Задание №2: Поиск максимального элемента в массиве. Для начала задать массив слов.
// Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном
// заданной длине массива.
// В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль

import java.util.Scanner;

class MaxLengthElement
{
    MaxLengthElement()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание №2 (Боос Глеб) ");
        System.out.print("Введите необходимую строку: ");
        String s = in.nextLine();
        String[] word=s.split(" ");
        String max=" ";
        for(int i=0;i<word.length;i++){
            if(word[i].length()>=max.length())
            {
                max=word[i];
            }
        }
        //System.out.println(max," ", max.length());
        System.out.println("");
        System.out.println("Максимально длинное слово: ");
        System.out.println(max);
        System.out.println("Максимальная длинна слова: ");
        System.out.println(max.length());
        System.out.println("");
    }
}