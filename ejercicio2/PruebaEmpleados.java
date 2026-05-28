package ejercicio2;

public class PruebaEmpleados {
    public static void main(String[] args) {
        // Arreglo polimórfico
        Empleado[] equipo = { new Medico(), new Programador(), new Empleado() };

        System.out.println("--- Jornada Laboral ---");
        for (Empleado emp : equipo) {
            emp.trabajar(); // Cada objeto reacciona de forma única
        }
    }
}