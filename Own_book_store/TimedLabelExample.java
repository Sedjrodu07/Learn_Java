import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimedLabelExample extends JFrame {

    private JLabel timeLabel;
    private Timer timer;

    public TimedLabelExample() {
        setTitle("Timed JLabel Update");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setLocationRelativeTo(null);

        timeLabel = new JLabel("Loading time...");
        add(timeLabel);

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLabel.setText("Current Time: " + new Date().toString());
            }
        });
        timer.start(); // Start the timer when the frame is created
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TimedLabelExample().setVisible(true);
        });
    }
}