import Entities.Environment;

import javax.swing.JFrame;

public class RendFrame extends JFrame {
    ControlPanel controlPanel;
    RendPanel rendPanel;
    Environment environment;

    public RendFrame(Environment env) {
        this.setSize(700, 300);

        this.environment = env;
        this.controlPanel = new ControlPanel();
        this.rendPanel = new RendPanel();

        this.add(this.controlPanel);
        this.add(this.rendPanel);

        this.setVisible(true);
    }
}
