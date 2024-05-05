package Reto_8;

import java.util.Random;

public class Entrada {

    public static void main (String [] args){

        //Crear coches.
        Coche coche = new Coche();
        Coche coche1 = new Coche("A1", "A35L89", 136);

        //Mostrar datos de ambos coches
        System.out.println("Datos del primer coche:");
        coche.mostrarDatos();

        System.out.println("\nDatos del segundo coche:");
        coche1.mostrarDatos();

        //Modificar datos de los coches
        coche.setModelo("Fiat");
        coche.setMatricula("2324AAA");
        coche.setCv(120);
        coche.setVelocidad(0);
        coche.setKm(50.5);

        coche1.setModelo("Puma");
        coche1.setMatricula("9890AQG");
        coche1.setCv(250);
        coche1.setVelocidad(75);
        coche1.setKm(128);

        //Mostrar los datos modificados
        System.out.println("\nDatos del primer coche, modificados:");
        coche.mostrarDatos();

        System.out.println("\nDatos del segundo coche, modificados:");
        coche1.mostrarDatos();

        //Aceleraciones de los coches
        Random random = new Random();
        int aleatorio = random.nextInt(21);

        coche.acelerar(aleatorio);
        coche1.acelerar(aleatorio);

        //Mostrar datos de la aceleracion
        System.out.println("\nEl primer coche ha acelerado hasta: ");
        coche.mostrarDatos();

        System.out.println("\nEl segundo coche ha acelerado hasta: ");
        coche1.mostrarDatos();

        //Seleccionar ganador
        Coche cocheGanador = null;
        if (coche.getKm() > coche1.getKm()) {
            cocheGanador = coche;
        } else if (coche1.getKm() > coche.getKm()) {
            cocheGanador = coche1;
        }

        if (cocheGanador != null) {
            System.out.println("\nEl coche ganador es:");
            cocheGanador.mostrarDatos();
        } else {
            System.out.println("\nEmpate");
        }
    }
}
