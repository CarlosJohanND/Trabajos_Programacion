
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Ejercicio_EntradaSalida
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba su nombre");
        String name = scanner.nextLine();
        
        System.out.println("Escriba su Edad");
        int age = scanner.nextInt();
        
        System.out.println("Escriba su altura");
        double hight = scanner.nextDouble();
        
        System.out.println("Bienvenido a nuestra app " + name + " y gracias por darnos tu informacion");
        System.out.println("tu altura es de " +  hight);
        System.out.println("tines " + age + " años");
    }
}
