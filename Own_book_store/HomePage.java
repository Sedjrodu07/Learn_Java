    import java.io.*;
    import javax.swing.*;
    import java.awt.Image;
    import java.awt.Color;
    import java.util.Timer;
    import java.util.TimerTask;
    import java.awt.Point;

    class HomePage {
        JFrame frame;
        JLabel label;
        static int x = 0;
        static int absicssa = 500;
        static int  ordinate = 500;
        public HomePage() {
            frame = new JFrame("Home Page");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1920, 1080);
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setLayout(null);
            label = new JLabel("This is a test to see whether it can be possible to add step by step");
            label.setBackground(Color.WHITE);
            label.setForeground(Color.WHITE);
            label.setBounds(absicssa, ordinate, 120, 30);
            frame.add(label);

            
            ImageIcon font = new ImageIcon("home_image.jpeg");
            Image scaled_image = font.getImage();
            scaled_image = scaled_image.getScaledInstance(1920, 1080, Image.SCALE_DEFAULT);
            ImageIcon final_image = new ImageIcon(scaled_image);
            //JLabel label = new JLabel(final_image);
            //JLabel label = new JLabel("This is a test to see weather it can be possible to add step by step and \n");
            //frame.add(label);
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            //int x = 0;
            HomePage homePage = new HomePage();
            Timer timer = new Timer();
            TimerTask task = new TimerTask()
            {
                public void run()
                {
                    
                    Point polar_position = homePage.label.getLocation();
                  //  System.out.printf("The current coordonates of the label are (%d; %d\n", polar_position.x, polar_position.y);
                    ordinate = ordinate + 100;
                    homePage.label.setBounds(absicssa, ordinate, 150, 30);
                    //System.out.printf("The supposed current polar coordonates of the label are (%d; %d)\n", absicssa, ordinate);
                    x++;
                }
            };
            timer.schedule(task, 1000);
            //HomePage homePage = new HomePage();
        }
    }
