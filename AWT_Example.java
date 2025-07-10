// Java AWT Program for Hello World

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_Example {
    public static void main(String[] args)
    {
        Button button_test = new Button("0");
        button_test.setForeground(Color.black);
        button_test.setBackground(Color.white);
        button_test.setBounds(0, 0, 50, 50);

         Button button_test1 = new Button("1");
         button_test1.setForeground(Color.black);
         button_test1.setBackground(Color.white);
         button_test1.setBounds(50, 0, 50, 50);

        Button button_test2 = new Button("2");
        button_test2.setForeground(Color.black);
        button_test2.setBackground(Color.white);
        button_test2.setBounds(100, 0, 50, 50);

        Button button_test3 = new Button("3");
        button_test3.setForeground(Color.black);
        button_test3.setBackground(Color.white);
        button_test3.setBounds(0, 50, 50, 50);

        Button button_test4 = new Button("4");
        button_test4.setForeground(Color.black);
        button_test4.setBackground(Color.white);
        button_test4.setBounds(50, 50, 50, 50);

        Button button_test5 = new Button("5");
        button_test5.setForeground(Color.black);
        button_test5.setBackground(Color.white);
        button_test5.setBounds(100, 50, 50, 50);

        Button button_test6 = new Button("6");
        button_test6.setForeground(Color.black);
        button_test6.setBackground(Color.white);
        button_test6.setBounds(0, 100, 50, 50);

        Button button_test7 = new Button("7");
        button_test7.setForeground(Color.black);
        button_test7.setBackground(Color.white);
        button_test7.setBounds(50, 100, 50, 50);

        Button button_test8 = new Button("8");
        button_test8.setForeground(Color.black);
        button_test8.setBackground(Color.white);
        button_test8.setBounds(100, 100, 50, 50);

        Button button_test9 = new Button("9");
        button_test9.setForeground(Color.black);
        button_test9.setBackground(Color.white);
        button_test9.setBounds(0, 150, 50, 50);

        Button button_test10 = new Button("*");
        button_test10.setForeground(Color.black);
        button_test10.setBackground(Color.white);
        button_test10.setBounds(50, 150, 50, 50);

        Button button_test11 = new Button("-");
        button_test11.setForeground(Color.black);
        button_test11.setBackground(Color.white);
        button_test11.setBounds(100, 150, 50, 50);

        Button button_test12 = new Button("+");
        button_test12.setForeground(Color.black);
        button_test12.setBackground(Color.white);
        button_test12.setBounds(150, 150, 50, 50);

        Button button_test13 = new Button("/");
        button_test13.setForeground(Color.black);
        button_test13.setBackground(Color.white);
        button_test13.setBounds(0, 200, 50, 50);

        Button button_test14 = new Button("=");
        button_test14.setForeground(Color.black);
        button_test14.setBackground(Color.white);
        button_test14.setBounds(50, 200, 50, 50);

        Button button_test15 = new Button("C");
        button_test15.setForeground(Color.black);
        button_test15.setBackground(Color.white);
        button_test15.setBounds(100, 200, 50, 50);

        Button button_test16 = new Button("Del");
        button_test16.setForeground(Color.black);
        button_test16.setBackground(Color.white);
        button_test16.setBounds(150, 200, 50, 50);

        Frame frame = new Frame("Basic Program");
        Label label = new Label("Hello World!");

        label.setAlignment(Label.LEFT);
        label.setForeground(Color.green);
        frame.setSize(1920, 1080);
        frame.setBackground(Color.black);
        frame.setVisible(true);
        frame.add(button_test);
        frame.setLayout(null);
        frame.add(button_test1);
        frame.add(button_test2);
        frame.add(button_test3);
        frame.add(button_test4);
        frame.add(button_test5);
        frame.add(button_test6);
        frame.add(button_test7);
        frame.add(button_test8);
        frame.add(button_test9);
        frame.add(button_test10);
        frame.add(button_test11);
        frame.add(button_test12);
        frame.add(button_test13);
        frame.add(button_test14);
        frame.add(button_test15);
        frame.add(button_test16);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        button_test14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.out.printf("%d\n", 123);
            }
        });
    }
}