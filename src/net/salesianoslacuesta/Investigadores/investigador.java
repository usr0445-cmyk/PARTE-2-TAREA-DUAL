package net.salesianoslacuesta.Investigadores;

public abstract class investigador {
    
    //Aqui creamos los atributos de la clase investigador
    protected String nombre;
    protected String especialidad;
    protected double sueldo;

   //Creamos este constructor para poder inicializar los atributos de la clase investigador
    public investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }


    //Aqui creamos el metodo identificacion para mostrar la informacion
    public void identificacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Sueldo: " + sueldo + " euros");
    }


    //Aqui ponemos dos metodos para hacer calculos, uno para sumar y otro para restar
    public int hacerCalculoSuma(int a, int b) {
        return a + b;
    }

    public int hacerCalculoResta(int a, int b) {
        return a - b;
    }

    //Y dos metodos abstractos para que las clases hijas los implementen, uno para investigar y otro para trabajar
    public abstract void trabajar();
    public abstract String estadoDelSueldo();


}