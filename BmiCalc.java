import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your weight(kg)=");
        double wt= scan.nextDouble();
        System.out.println("Enter your height(m)=");
        double h= scan.nextDouble();
        double bmi=(wt/(h*h));
        System.out.println("BMI= "+bmi);
        if(bmi<=18.5){
            System.out.println("You are Underweight");
        }
        else if (bmi>18.5&&bmi<=25) {
            System.out.println("You are Normal");
        }
        else if(bmi>=25&&bmi<30){
            System.out.println("You are Overweight");
        }
        else{
            System.out.println("You are Obese, Go GYMMMMMM");
        }

    }
}
