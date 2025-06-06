import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    public ControlPanel() {
        this.setSize(200, 300);
        this.setBackground(Color.WHITE);
        JButton testButton = new JButton("Hello World");
        this.add(testButton);
    }
}
