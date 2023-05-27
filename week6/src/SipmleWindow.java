import javax.swing.*;

public class SipmleWindow extends JFrame {

    public SipmleWindow() {

        final int WINDOW_WITH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window");

        setSize(WINDOW_WITH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

}
