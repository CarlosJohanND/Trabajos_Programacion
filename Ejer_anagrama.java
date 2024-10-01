import java.util.Scanner;
public class Ejer_anagrama {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int analysis = 0;
        boolean anagramanalys = true;

        System.out.println("Escriba la primera palabra");
        String palabra1 = scanner.nextLine();
        char[] characters1 = palabra1.toCharArray();
        int numPal1 = palabra1.length();

        System.out.println("Escriba la segunda palabra");
        String palabra2 = scanner.nextLine();
        char[] characters2 = palabra2.toCharArray();
        int numPal2 = palabra2.length();
        
        boolean exactword = palabra1.equals(palabra2);
        if (numPal1 == numPal2 && exactword == false){

            for(int i = 0; i < numPal1; i++){
                for (int j = 0; j < numPal1; j++){
                    if(characters1[i] == characters2[j]){
                        analysis += 1;
                    }
                }
            }
        }

        if (analysis == numPal1){
            anagramanalys = true;
        }else{
            anagramanalys = false;
        }
        System.out.println(anagramanalys);   
    }
}