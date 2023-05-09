import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random= new Random();
        int a= random.nextInt()+1;
        System.out.println("Random integer= "+a);
        double b= random.nextDouble();
        System.out.println("Random double value= "+b);
        boolean c= random.nextBoolean();
        System.out.println("Next Boolean= "+c);
    }
}
