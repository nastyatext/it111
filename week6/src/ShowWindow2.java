import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    private static final int COMPONENT_HEIGHT = 40;

    public static void main (String[]args) {

        final int WINDOW_WITH = 365;
        final int WINDOW_HEIGHT = 450;

        JFrame window = new JFrame();


        window.setTitle("My Simple Window");
        window.getContentPane().setBackground(Color.RED);
        window.setSize(WINDOW_WITH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setLocationRelativeTo(null);

        int indentSize = 15;
        window.add(createLabel(indentSize,COMPONENT_HEIGHT,"My First Big Label!!!",Font.PLAIN, 20));
        window.add(createTextField(indentSize,2*COMPONENT_HEIGHT));
        window.add(createLabel(indentSize,3*COMPONENT_HEIGHT,"My Second Big Label!",Font.BOLD,18));
        window.add(createTextField(indentSize,4*COMPONENT_HEIGHT));

        window.setVisible(true);



    }


    public static JLabel createLabel(int x, int y ,final String text, int fontStyle, int fontSize){
        JLabel jLabel = new JLabel(text);
        jLabel.setFont( new Font("Roboto",fontStyle,fontSize));
        jLabel.setBounds(new Rectangle(x, y, 200,COMPONENT_HEIGHT));
        return jLabel;
    }

    public static JTextField createTextField(int x, int y){
        JTextField jTextField = new JTextField();
        jTextField.setBounds(new Rectangle(x,y,300,COMPONENT_HEIGHT));
        return jTextField;
    }



}
