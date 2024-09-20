public class Ejer_ropa{
    public static void main(String[] args) {
        double Camiseta = 25;
        double Pantalon = 30;
        double Respuesta = (Camiseta * 0.85) + (Pantalon * 0.85);
        System.out.println("El precio de la camiseta y el pantalon con el descuento de 15% es de: " + Respuesta);
        
        Respuesta = ((Camiseta * 0.85) * 0.95) + (Camiseta * 0.85) + (Pantalon * 0.85);
        System.out.println("El precio de dos camisetas y el pantalon con el descuento de 15% + 5% a la primera camiseta es de: " + Respuesta);
    }
}