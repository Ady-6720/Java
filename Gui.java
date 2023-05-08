import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter Your name: ");
        int age= Integer.parseInt(JOptionPane.showInputDialog("Whats your age?"));
        JOptionPane.showMessageDialog(null, "Hello "+name+" So you are "+age+" Old!");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Whats your weight "+name+"?"));
        JOptionPane.showMessageDialog(null,"So your weigh is "+weight+"!");
    }
}
