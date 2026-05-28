package ejercicio3;

// ---------------- CLASE BASE ----------------

class Animal {

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal...");
    }
}

// ---------------- CLASE PERRO ----------------

class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("¡Guau, guau!");
    }

    // Método exclusivo de Perro
    public void buscarPelota() {
        System.out.println("El perro está buscando la pelota.");
    }
}

// ---------------- CLASE GATO ----------------

class Gato extends Animal {

    /*
     * MALA PRÁCTICA:
     * Sobrescribir un método sin modificar el comportamiento.
     */

    @Override
    public void hacerSonido() {
        super.hacerSonido();
    }
}

// ---------------- CLASE PRINCIPAL ----------------

public class ErroresPolimorfismo {

    public static void main(String[] args) {

        Animal miMascota = new Perro();

        // Polimorfismo correcto
        miMascota.hacerSonido();

        // ERROR DE COMPILACIÓN:
        // miMascota.buscarPelota();

        /*
         * Aunque el objeto es un Perro,
         * la referencia es de tipo Animal.
         *
         * Solo pueden usarse métodos definidos en Animal.
         *
         * Solución:
         * ((Perro) miMascota).buscarPelota();
         */
    }
}