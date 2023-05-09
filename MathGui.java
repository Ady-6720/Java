import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

        int a= Integer.parseInt(JOptionPane.showInputDialog("Enter value of A:"));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Enter value of B:"));
        int Max= Math.max(a,b);
        int Min=Math.min(a,b);
        double sqa= Math.sqrt(a);
        double sqb= Math.sqrt(b);
        JOptionPane.showMessageDialog(null,"Max="+Max+"\nMin="+Min+"\nSquare root of A="+sqa+"\nSquare root of B="+sqb);
    }

}
