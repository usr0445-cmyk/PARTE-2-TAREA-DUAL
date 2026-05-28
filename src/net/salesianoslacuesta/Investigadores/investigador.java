package net.salesianoslacuesta.Investigadores;

public abstract class investigador {
    
    protected String nombre;
    protected String especialidad;
    protected double sueldo;

   
    public investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }


    public void identificacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sueldo: " + sueldo + " euros");
    }


    public int hacerCalculoSuma(int a, int b) {
        return a + b;
    }

    public int hacerCalculoResta(int a, int b) {
        return a - b;
    }

    public abstract String estadoDelSueldo();
    public abstract void trabajar();


}