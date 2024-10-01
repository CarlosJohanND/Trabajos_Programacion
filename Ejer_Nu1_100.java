
public class Ejer_Nu1_100 {
    public static void main(String[] args) {

    for (int i = 1; i <= 100; i ++){
            System.out.print(i + " ");
            if (0 == (i % 3)){
                System.out.print("fizz");
            }
            if (0 == (i % 5)){
                System.out.print("buzz");
            }
            System.out.println("");
        }
    }
}