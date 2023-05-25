import javax.swing.*;

public class Age {
    public static void main(String[] args) {

        JTextField textField = new JTextField(12);
        JLabel label = new JLabel("Enter ur age : ");
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);

        int option = JOptionPane.showConfirmDialog(
            null,
            panel,
            "AGE CALCULATOR",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE);

            if (option == JOptionPane.OK_OPTION){
                String input = textField.getText().trim();
                if (input.isEmpty())
                JOptionPane.showMessageDialog(null, " ;-; " , "BN8" , JOptionPane.ERROR_MESSAGE);
                else
                JOptionPane.showMessageDialog(null, "Your age is " + textField.getText() + " ! ");
            }
    }
}


