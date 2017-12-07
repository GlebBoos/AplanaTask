// Задача №4: Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
// Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.

import java.util.Scanner;
import java.lang.Math;
//import java.util.Arrays;

class RandomMassive
{
    RandomMassive()
    {
        int n=20,arr[];
        //Scanner in = new Scanner(System.in);
        //System.out.println("Введите размер массива: ");
        //n = in.nextInt();
        arr = new int [n];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = (int)(-10+(Math.random()*(10+10)));
        }
        System.out.println("");
        for(int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i] + " " );
        }
        System.out.println("");
        System.out.println("");
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i] < arr[iMax])&&(arr[i]<0))
            {
                iMax = i;
                //max=arr[i];
            }
           if ((arr[i] < arr[iMin])&&(arr[i]>0))
            {
                iMin = i;
                //min=arr[i];
            }
        }
        int b=0;
        b=arr[iMax];
        arr[iMax]=arr[iMin];
        arr[iMin]=b;
        System.out.println("");
        for(int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i] + " " );
        }
        System.out.println("");
        System.out.println("");
    }
}

