
/**
 * Write a description of class CLass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculator
{
    // instance variables - replace the example below with your own 
    public static void main(String[] args)
    {
        double a,b;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Isi variable a adalah = ");
        a = input.nextDouble();
        System.out.println("Isi variable b adalah = ");
        b = input.nextDouble();
        System.out.println("Hasil penjumlahan variable a dan b = " + (a + b));
        System.out.println("Hasil pengurangan variable a dan b = " + (a - b));
        System.out.println("Hasil perkalian variable a dan b = " + (a * b));
        System.out.println("Hasil pembagian variable a dan b = " + (a/b));
    }

}
