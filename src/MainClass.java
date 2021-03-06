// Задание №3 Программа должна выполнять одно из заданий на выбор.
// Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
// Остальные задачи (4 и 5) тоже добавлены в менюшку

// UPD 21.12.2017
// В новой версии добавлены все задачи+интерфейс для будущей задачи (понедельник 25.12.2017). Добавлен графический
// интерфейс меню с выбором задач по кнопке. Весь данный класс основного меню был переработан.

import java.io.IOException;
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.text.*;
import javax.imageio.ImageIO;


public class MainClass extends JFrame implements ActionListener {
    JFrame fr; //Фрейм
    JButton z1, z2, z3, z4, z5, z6, z7, z8, z0; //Кнопки числовых значений
    boolean f;

    MainClass() {

        fr = new JFrame("Aplana Java Course 2.0 - Boos G.O.");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        fr.setSize(400, 520);
        fr.setLocationRelativeTo(null); //отцентровка
        // fr.getContentPane().setBackground(new Color(255, 255, 200));
        Image icon = Toolkit.getDefaultToolkit().getImage("4.png");
        fr.setIconImage(icon);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
        try {
            fr.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("6.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //fr.pack();
        //fr.setUndecorated(true);
        z1 = new JButton("Задача 1: Калькулятор");
        z2 = new JButton("Задача 2: Поиск самого короткого слова");
        z3 = new JButton("Задача 3: Смена мест MAX и MIN в массиве Random ");
        z4 = new JButton("Задача 4: Расчет подарка версия 1.0");
        z5 = new JButton("Задача 5: Расчет подарка версия 2.0");
        z6 = new JButton("Задача 6: Расчет подарка версия 3.0");
        z7 = new JButton("Задача 7: Расчет подарка версия 4.0");
        z8 = new JButton("Задача 8: UNIT тесты для простого расчета");
        z0 = new JButton("Выход из программы");

        z1.setBounds(10, 120, 365, 20);
        z2.setBounds(10, 160, 365, 20);
        z3.setBounds(10, 200, 365, 20);
        z4.setBounds(10, 240, 365, 20);
        z5.setBounds(10, 280, 365, 20);
        z6.setBounds(10, 320, 365, 20);
        z7.setBounds(10, 360, 365, 20);
        z8.setBounds(10, 400, 365, 20);
        z0.setBounds(10, 440, 365, 20);


        fr.add(z1);
        fr.add(z2);
        fr.add(z3);
        fr.add(z4);
        fr.add(z5);
        fr.add(z6);
        fr.add(z7);
        fr.add(z8);
        fr.add(z0);


        z1.setBackground(new Color(230, 255, 255));
        z2.setBackground(new Color(230, 255, 255));
        z3.setBackground(new Color(230, 255, 255));
        z4.setBackground(new Color(230, 255, 255));
        z5.setBackground(new Color(230, 255, 255));
        z6.setBackground(new Color(230, 255, 255));
        z7.setBackground(new Color(230, 255, 255));
        z8.setBackground(new Color(230, 255, 255));
        z0.setBackground(new Color(255, 128, 0));


        z1.addActionListener(this);
        z2.addActionListener(this);
        z3.addActionListener(this);
        z4.addActionListener(this);
        z5.addActionListener(this);
        z6.addActionListener(this);
        z7.addActionListener(this);
        z8.addActionListener(this);
        z0.addActionListener(this);

        fr.setLayout(null);
        fr.setVisible(true);
        fr.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == z1) new CalcAplana();
        if (e.getSource() == z2) new MaxLengthElement();
        if (e.getSource() == z3) new RandomMassive();
        if (e.getSource() == z4) new NewYearPresent();
        if (e.getSource() == z5) new NewYearPresent2();
        if (e.getSource() == z6) new NewYearPresent3();
        if (e.getSource() == z7) new NewYearPresent4();
        if (e.getSource() == z8) new UnitTests();
        if (e.getSource() == z0) fr.dispose();
    }



    public static void main(String... s) throws IOException, InterruptedException {
        new MainClass();
    }
}

