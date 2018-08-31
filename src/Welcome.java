import javax.swing.*;

public class Welcome {
    public static void main(String[] args) {
        String name;
        name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Welcome to Year2 "+name);
    }
}
