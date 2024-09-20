public class Ejer_acoumlador {

    public static void main(String[] args) {
        long resultado = 1;
        for (int i = 3; i > 0; i--){
        
            resultado *= i;  

        }

        System.out.println("La suma total es " + resultado);
    }
}