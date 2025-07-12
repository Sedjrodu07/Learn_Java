// Java AWT Program for Hello World

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_Example {
    public static Button [] place_button()
    {
        Button[] buttons = new Button[17];
        Button button_zero = new Button("0");
        button_zero.setForeground(Color.black);
        button_zero.setBackground(Color.white);
        button_zero.setBounds(0, 0, 50, 50);
        buttons[0] = button_zero;

         Button button_one = new Button("1");
         button_one.setForeground(Color.black);
         button_one.setBackground(Color.white);
         button_one.setBounds(50, 0, 50, 50);
         buttons[1] = button_one;

        Button button_two = new Button("2");
        button_two.setForeground(Color.black);
        button_two.setBackground(Color.white);
        button_two.setBounds(100, 0, 50, 50);
        buttons[2] = button_two;

        Button button_three = new Button("3");
        button_three.setForeground(Color.black);
        button_three.setBackground(Color.white);
        button_three.setBounds(0, 50, 50, 50);
        buttons[3] = button_three;

        Button button_four = new Button("4");
        button_four.setForeground(Color.black);
        button_four.setBackground(Color.white);
        button_four.setBounds(50, 50, 50, 50);
        buttons[4] = button_four;

        Button button_five = new Button("5");
        button_five.setForeground(Color.black);
        button_five.setBackground(Color.white);
        button_five.setBounds(100, 50, 50, 50);
        buttons[5] = button_five;

        Button button_six = new Button("6");
        button_six.setForeground(Color.black);
        button_six.setBackground(Color.white);
        button_six.setBounds(0, 100, 50, 50);
        buttons[6] = button_six;

        Button button_seven = new Button("7");
        button_seven.setForeground(Color.black);
        button_seven.setBackground(Color.white);
        button_seven.setBounds(50, 100, 50, 50);
        buttons[7] = button_seven;

        Button button_eight = new Button("8");
        button_eight.setForeground(Color.black);
        button_eight.setBackground(Color.white);
        button_eight.setBounds(100, 100, 50, 50);
        buttons[8] = button_eight;

        Button button_nine = new Button("9");
        button_nine.setForeground(Color.black);
        button_nine.setBackground(Color.white);
        button_nine.setBounds(0, 150, 50, 50);
        buttons[9] = button_nine;

        Button button_multiplicator = new Button("*");
        button_multiplicator.setForeground(Color.black);
        button_multiplicator.setBackground(Color.white);
        button_multiplicator.setBounds(50, 150, 50, 50);
        buttons[10] = button_multiplicator;

        Button button_substractor = new Button("-");
        button_substractor.setForeground(Color.black);
        button_substractor.setBackground(Color.white);
        button_substractor.setBounds(100, 150, 50, 50);
        buttons[11] = button_substractor;

        Button button_additionner = new Button("+");
        button_additionner.setForeground(Color.black);
        button_additionner.setBackground(Color.white);
        button_additionner.setBounds(150, 150, 50, 50);
        buttons[12] = button_additionner;

        Button button_divisor = new Button("/");
        button_divisor.setForeground(Color.black);
        button_divisor.setBackground(Color.white);
        button_divisor.setBounds(0, 200, 50, 50);
        buttons[13] = button_divisor;

        Button button_equalizer = new Button("=");
        button_equalizer.setForeground(Color.black);
        button_equalizer.setBackground(Color.white);
        button_equalizer.setBounds(50, 200, 50, 50);
        buttons[14] = button_equalizer;

        Button button_clearer = new Button("C");
        button_clearer.setForeground(Color.black);
        button_clearer.setBackground(Color.white);
        button_clearer.setBounds(100, 200, 50, 50);
        buttons[15] = button_clearer;

        Button button_deleter = new Button("Del");
        button_deleter.setForeground(Color.black);
        button_deleter.setBackground(Color.white);
        button_deleter.setBounds(150, 200, 50, 50);
        buttons[16] = button_deleter;

        Frame frame = new Frame("Basic Program");
        Label label = new Label("Hello World!");

        label.setAlignment(Label.LEFT);
        label.setForeground(Color.green);
        frame.setSize(1920, 1080);
        frame.setBackground(Color.black);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(button_additionner);
        frame.add(button_clearer);
        frame.add(button_deleter);
        frame.add(button_divisor);
        frame.add(button_equalizer);
        frame.add(button_multiplicator);
        frame.add(button_substractor);
        frame.add(button_zero);
        frame.add(button_one);
        frame.add(button_two);
        frame.add(button_three);
        frame.add(button_four);
        frame.add(button_five);
        frame.add(button_six);
        frame.add(button_seven);
        frame.add(button_eight);
        frame.add(button_nine);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                frame.dispose();
                System.exit(0);
            }
        });
        // @Override
        // public void actionPerformed(ActionEvent e)
        // {
        //     if (e.getSource() == button_additionner) {
        //         System.out.printf("It is working ohhhhhhhhh\n");
        //     }
        // }
        return buttons;
    };
    // public void actionPerformed(ActionEvent e)
    //     {
    //         if (e.getSource() == button_additionner) {
    //             System.out.printf("It is working ohhhhhhhhh\n");
    //         }
    //     }   

    public static void main (String args[])
    {
        Button[] buttons = new Button[17];
        buttons = AWT_Example.place_button();
        System.out.println("Created button with label: " + buttons[1].getLabel());
       
    }
    // public void actionPerformed(ActionEvent e)
    // {
    //     if (e.getSource() == button_additionner) {
    //         System.out.printf("It is working ohhhhhhhhh\n");
    //     }
    // }
}


// public static void main (string args[])
// {
//     test = new AWT_Example;
// }