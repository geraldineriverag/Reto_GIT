package Reto_8;

import java.util.Random;

public class EntradaCarrera {

    public static void main (String [] args){

        int kmEtapa = 100000;

        Coche coche1 = new Coche("C1", "5544AEZ", 150);
        Coche coche2 = new Coche("A3", "8976TVB", 210);
        Coche coche3 = null; //Coche ganador

        do {
            Random random = new Random();
            int aleatorio = random.nextInt(21);

            coche1.acelerar(aleatorio);
            coche2.acelerar(aleatorio);

            if (coche1.getKm() >= kmEtapa || coche2.getKm() >= kmEtapa) {

                if (coche1.getKm() > coche2.getKm()) {
                    coche3 = coche1;
                } else if (coche2.getKm() > coche1.getKm()) {
                    coche3 = coche2;
                }

                if (coche3 != null) {
                    System.out.println("El coche ganador es:");
                    coche3.mostrarDatos();
                } else {
                    System.out.println("Empate");
                }

                break;
            }
        } while (true);
    }
}
