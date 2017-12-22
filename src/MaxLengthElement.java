// Задание №2: Поиск максимального элемента в массиве. Для начала задать массив слов.
// Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном
// заданной длине массива.
// В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MaxLengthElement extends JFrame implements ActionListener
{
    JFrame fr1; //Фрейм
    JTextField t1,t2; //Поле текстового ввода и вывода данных
    JButton x; // Кнопка запуска текста
    MaxLengthElement()
    {

        fr1=new JFrame("Задача 2: Поиск самого короткого слова");
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(415,300);
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
            fr1.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("7.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Закрытие только текущего окна, а не всей программы
        fr1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Создаем окно ввода данных
        t1=new JTextField();
        t1.setBounds(10,70,380,60);
        t1.setEditable(true);
        fr1.add(t1);
        //Создаем окно вывода данных
        t2=new JTextField();
        t2.setBounds(10,180,380,60);
        t2.setEditable(true);
        fr1.add(t2);
        //Создаем кнопку для анализа текста
        x=new JButton("Анализ введенного текста");
        x.setBounds(100,145,200,20);
        fr1.add(x);
        x.setBackground(new Color(255, 128, 0));
        x.addActionListener(this);


        fr1.setLayout(null);
        fr1.setVisible(true);
        fr1.setResizable(false);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == x) {
            String l=t1.getText();
            String[] word=l.split(" ");
            String max=" ";
            for(int i=0;i<word.length;i++){
                if(word[i].length()>=max.length())
                {
                    max=word[i];
                }
            }
            t2.setText("Максимально длинное слово: "+String.format(max));
        }
    }
}

