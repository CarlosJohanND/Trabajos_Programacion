
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Ejer_promedio
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el primer numero");
        double Num1 = scanner.nextDouble();
        System.out.println("Escriba el segundo numero");
        double Num2 = scanner.nextDouble();
        System.out.println("Escriba el tercero numero");
        double Num3 = scanner.nextDouble();
        
        double promedio = (Num1 + Num2 + Num3) / 3; 
        
        System.out.println("El promedio entre, " + Num1 + ", " + Num2 + ", " + Num3 + " es: " + promedio);
    }
}