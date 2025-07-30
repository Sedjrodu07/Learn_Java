    import java.io.*;
    import javax.swing.*;

    class HomePage {
        JFrame frame;
        JLabel label;

        public HomePage() {
            // Creating the frame which i decided to name Home Page
            frame = new JFrame("Home Page");
            System.out.println("Creating Home Page");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1920, 1080);

            label = new JLabel("Welcome to the Homepage", SwingConstants.CENTER);
            frame.add(label);
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            HomePage homePage = new HomePage();
        }
    }