package ejercicio4;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miBici = new Bicicleta();

        System.out.println("--- Prueba de Vehículos ---");
        miCoche.mover();
        miBici.mover();
    }
}