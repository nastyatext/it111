import javax.swing. *;

public class ShowWindow {

    public static void main (String[]args) {

        final int WINDOW_WITH = 358;
        final int WINDOW_HEIGHT = 250;

        JFrame window = new JFrame();
        window.setTitle("My Simple Window");

        window.setSize(WINDOW_WITH,WINDOW_HEIGHT);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}
