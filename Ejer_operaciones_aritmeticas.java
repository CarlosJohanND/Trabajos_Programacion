import java.util.Scanner;
public class Ejer_operaciones_aritmeticas
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        //Entrada
        System.out.println("Escriba el primer numero");
        float Num1 = scanner.nextFloat();
        System.out.println("Escriba el segundo numero");
        float Num2 = scanner.nextFloat();
        
        //Proceso
        float Suma = Num1 + Num2;
        float Resta = Num1 - Num2;
        float Multiplicacion = Num1 * Num2;
        float Divicion = Num1 / Num2;
        float Modulo = Num1 % Num2;
        
        //Salida
        System.out.println("Suma: " +                      Suma);
        System.out.println("Resta: " +                    Resta);
        System.out.println("Multiplicacion: " +  Multiplicacion);
        System.out.println("Divicion: " +              Divicion);
        System.out.println("Modulo: " +                  Modulo);
        
    }
}