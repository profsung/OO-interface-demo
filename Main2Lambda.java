import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2Lambda {

    public static void main(String[] args) {

        JButton button = new JButton("Enter");
        ButtonListener listener = new ButtonListener();
        button.addActionListener(listener);

    }
    
}

class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent arg0) {
       System.out.println("Enter button is pressed");
    }

}
