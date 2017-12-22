//Задание №1: Калькулятор с простыми функциями (реализовано на swing)


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

class CalcAplana implements ActionListener
{
    JFrame f; //Фрейм
    JTextField t; //Поле текстового ввода
    JButton x_0,x_1,x_2,x_3,x_4,x_5,x_6,x_7,x_8,x_9; //Кнопки числовых значений
    JButton bdiv,bmul,bsub,badd,bdec,beq,bCE,bC; //Кнопки операций калькулятора
    JLabel l; //Лейбл

    static double a=0,b=0,result=0;
    static int operator=0;

    CalcAplana()
    {
        //Создаем форму для калькулятора
        f=new JFrame("Задача 1: Калькулятор");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(345,530);
        //f.setLocationRelativeTo(null); //отцентровка
       // f.getContentPane().setBackground(new Color(153, 255, 153));
        //f.getContentPane().setBackground(new Color(0, 0, 0));
        //Установка экрана заливки
        try {
            f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("6.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Установка иконки
        Image icon = Toolkit.getDefaultToolkit().getImage("4.png");
        f.setIconImage(icon);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
        //Закрытие только текущего окна, а не всей программы
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Создаем окно ввода данных для калькулятора
        t=new JTextField();
        t.setBounds(10,20,310,60);
        t.setEditable(true);
        f.add(t);

        //Лейбл для калькулятора
        l=new JLabel("gboos@aplana.com", new ImageIcon("1.png"),SwingConstants.LEFT);
        l.setForeground(new Color(255, 128, 0));
        l.setBounds(10,450,350,30);
        f.add(l);

        //Добавление наименований кнопкам
        x_1=new JButton("1"); x_2=new JButton("2"); x_3=new JButton("3");
        x_4=new JButton("4"); x_5=new JButton("5"); x_6=new JButton("6");
        x_7=new JButton("7"); x_8=new JButton("8"); x_9=new JButton("9");
        x_0=new JButton("0"); bdiv=new JButton("/"); bmul=new JButton("*");
        bsub=new JButton("-"); badd=new JButton("+"); bdec=new JButton(".");
        beq=new JButton("="); bCE=new JButton("CE"); bC=new JButton("C");

        //Установка кнопок по координатной оси
        x_1.setBounds(10,240,70,50); x_2.setBounds(90,240,70,50);
        x_3.setBounds(170,240,70,50); x_4.setBounds(10,170,70,50);
        x_5.setBounds(90,170,70,50); x_6.setBounds(170,170,70,50);
        x_7.setBounds(10,100,70,50); x_8.setBounds(90,100,70,50);
        x_9.setBounds(170,100,70,50);x_0.setBounds(90,310,70,50);
        badd.setBounds(250,100,70,50);  bdiv.setBounds(250,310,70,50);
        bmul.setBounds(250,240,70,50); bdec.setBounds(10,310,70,50);
        beq.setBounds(170,310,70,50); bsub.setBounds(250,170,70,50);
        bCE.setBounds(50,385,80,50); bC.setBounds(200,385,80,50);

        //Доба вление кнопок на фрейм
        f.add(x_1); f.add(x_2); f.add(x_3); f.add(x_4); f.add(x_5); f.add(x_6); f.add(x_7); f.add(x_8);
        f.add(x_9); f.add(x_0); f.add(t); f.add(bdiv); f.add(bmul); f.add(bsub); f.add(bdec); f.add(x_0);
        f.add(beq); f.add(badd); f.add(bCE); f.add(bC);

        //Установка цвета для кнопок калькулятора
        x_1.setBackground(new Color(255,255,255)); x_2.setBackground(new Color(255,255,255));
        x_3.setBackground(new Color(255,255,255)); x_4.setBackground(new Color(255,255,255));
        x_5.setBackground(new Color(255,255,255)); x_6.setBackground(new Color(255,255,255));
        x_7.setBackground(new Color(255,255,255)); x_8.setBackground(new Color(255,255,255));
        x_9.setBackground(new Color(255,255,255)); x_0.setBackground(new Color(255,255,255));
        badd.setBackground(new Color(255, 128, 0)); bmul.setBackground(new Color(255, 128, 0));
        beq.setBackground(new Color	(255, 128, 0)); bCE.setBackground(new Color	(255, 128, 0));
        bdiv.setBackground(new Color(255, 128, 0)); bdec.setBackground(new Color(255, 128, 0));
        bsub.setBackground(new Color(255, 128, 0)); bC.setBackground(new Color(255, 128, 0));

        //Реалзиация метода ActionListener для кнопок
        x_1.addActionListener(this); x_2.addActionListener(this); x_3.addActionListener(this);
        x_4.addActionListener(this); x_5.addActionListener(this); x_6.addActionListener(this);
        x_7.addActionListener(this); x_8.addActionListener(this); x_9.addActionListener(this);
        x_0.addActionListener(this); badd.addActionListener(this); bdiv.addActionListener(this);
        bmul.addActionListener(this); bsub.addActionListener(this); bdec.addActionListener(this);
        beq.addActionListener(this); bCE.addActionListener(this); bC.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==x_1) t.setText(t.getText().concat("1"));
        if(e.getSource()==x_2) t.setText(t.getText().concat("2"));
        if(e.getSource()==x_3) t.setText(t.getText().concat("3"));
        if(e.getSource()==x_4) t.setText(t.getText().concat("4"));
        if(e.getSource()==x_5) t.setText(t.getText().concat("5"));
        if(e.getSource()==x_6) t.setText(t.getText().concat("6"));
        if(e.getSource()==x_7) t.setText(t.getText().concat("7"));
        if(e.getSource()==x_8) t.setText(t.getText().concat("8"));
        if(e.getSource()==x_9) t.setText(t.getText().concat("9"));
        if(e.getSource()==x_0) t.setText(t.getText().concat("0"));
        if(e.getSource()==bdec) t.setText(t.getText().concat("."));
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
            switch(operator)
            {
                case 1: result=a+b; break;
                case 2: result=a-b; break;
                case 3: result=a*b; break;
                case 4: result=a/b; break;
                default: result=0;
            }
            t.setText(""+String.format("%.2f",result));
        }
        if(e.getSource()==bC)
            t.setText("");
        if(e.getSource()==bCE)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
                t.setText(t.getText()+s.charAt(i));
        }
    }
}