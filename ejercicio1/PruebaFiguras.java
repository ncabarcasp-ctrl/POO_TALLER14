package ejercicio1;

public class PruebaFiguras {
    public static void main(String[] args) {
        // Mismo tipo de referencia (Figura), distinto tipo de objeto en memoria
        Figura figura1 = new Circulo();
        Figura figura2 = new Rectangulo();

        System.out.println("--- Polimorfismo en Figuras ---");
        figura1.calcularArea(); // En tiempo de ejecución Java usa la versión de Circulo
        figura2.calcularArea(); // En tiempo de ejecución Java usa la versión de Rectangulo
    }
}