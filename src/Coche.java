package Reto_8;

import java.util.Random;

public class Coche {

    private String modelo;
    private String matricula;
    private int cv;
    private int velocidad;
    private double km;

    //Constructor por defecto
    public Coche (){
        this.modelo = "Sin especificar";
        this.matricula = "0000AAA";
        this.cv = 0;
        this.velocidad = 0;
        this.km = 0.0;
    }

    //Constructor con parámetros
    public Coche (String modelo, String matricula, int cv) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    //Método acelerar
    public void acelerar (int velocidadAcelerar) {

        if (velocidad >= 180) {
            velocidad = 180;
            System.out.println ("Velocidad máxima alcanzada");
        } else {
            velocidad += velocidadAcelerar;
        }

        Random random = new Random();
        int aleatorio = random.nextInt(10)+1;
        km += velocidad * (cv * aleatorio);
    }

    //Método frenar
    public void frenar(int velocidadFrenar) {

        if (velocidad - velocidadFrenar <= 0) {
            velocidad = 0;
            System.out.println("Velocidad mínima alcanzada");
        } else {
            velocidad -= velocidadFrenar;
        }
    }

    //Método parar
    public void parar (){
        velocidad = 0;
    }

    //Método resetear
    public void resetear(){
        velocidad = 0;
        km = 0;
    }

    //Método mostrar datos.
    public void mostrarDatos(){
        System.out.println("El modelo del coche es: "+modelo);
        System.out.println("La matrícula es: "+matricula);
        System.out.println("Los caballos son: "+cv);
        System.out.println("La velocidad es de: "+velocidad);
        System.out.println("Los km recorridos son "+km);
    }

    //Métodos getter y setter
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getCv(){
        return cv;
    }

    public void setCv(int cv){
        this.cv = cv;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public double getKm(){
        return km;
    }

    public void setKm(double km){
        this.km = km;
    }
}
