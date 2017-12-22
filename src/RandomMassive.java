// Задача №4: Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
// Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.awt.Dimension;
import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

class RandomMassive implements ActionListener
{
    JFrame fr1; //Фрейм
    JTextField t1,t2; //Поле текстового ввода и вывода данных
    JButton x; // Кнопка запуска текста
    RandomMassive()
    {
        fr1=new JFrame("Задача 3: Смена мест MAX и MIN в массиве Random ");
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(415,200);
        fr1.getContentPane().setBackground(new Color(255, 255, 255));
        //f.setLocationRelativeTo(null); //отцентровка
        //Установка иконки
        Image icon = Toolkit.getDefaultToolkit().getImage("4.png");
        fr1.setIconImage(icon);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
        //Установка экрана заливки
        try {
            fr1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("8.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Закрытие только текущего окна, а не всей программы
        fr1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Создаем окно вывода начального массива
        t1=new JTextField();
        t1.setBounds(10,60,380,20);
        t1.setEditable(false);
        fr1.add(t1);
        //Создаем окно ввода конечного массива
        t2=new JTextField();
        t2.setBounds(10,90,380,20);
        t2.setEditable(false);
        fr1.add(t2);

        //Создаем кнопку для анализа текста
        x=new JButton("Обработка данных");
        x.setBounds(100,125,200,20);
        fr1.add(x);
        x.setBackground(new Color(255, 128, 0));
        x.addActionListener(this);


        fr1.setLayout(null);
        fr1.setVisible(true);
        fr1.setResizable(false);
    }
    public void actionPerformed(ActionEvent e) {
        int n=20,arr[];
        arr = new int [n];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = (int)(-10+(Math.random()*(10+10)));
        }

        String ms = "";
        for (int i=0;i<arr.length;i++)
        {
            String b = String.valueOf(arr[i]);
            ms+=b+" ";
        }
        t1.setText(" "+ms);
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i] < arr[iMax])&&(arr[i]<0))
            {
                iMax = i;
            }
            if ((arr[i] < arr[iMin])&&(arr[i]>0))
            {
                iMin = i;
            }
        }
        int b=0;
        b=arr[iMax];
        arr[iMax]=arr[iMin];
        arr[iMin]=b;
        if (e.getSource() == x) {
            String ms1 = "";
            for (int i=0;i<arr.length;i++)
            {
                String bb = String.valueOf(arr[i]);
                ms1+=bb+" ";
            }
            t2.setText(" "+ms1);
        }
    }
}

