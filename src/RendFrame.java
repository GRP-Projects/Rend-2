import javax.swing.JFrame;

public class RendFrame extends JFrame {
    ControlPanel controlPanel;
    RendPanel rendPanel;

    public RendFrame() {
        this.setSize(700, 300);

        this.controlPanel = new ControlPanel();
        this.rendPanel = new RendPanel();

        this.add(this.controlPanel);
        this.add(this.rendPanel);

        this.setVisible(true);
    }
}
