package net.salesianoslacuesta.Matematico;

public abstract class matematico extends investigador {

    private int[][] resultadosActuales; 

    public matematico(String nombre, int[][] matrizInicial, double sueldo) {
        super(nombre, "Matematicas", sueldo);
        this.resultadosActuales = matrizInicial; 
    }

    @Override
    public void trabajar() {
        System.out.println(" Esta trabajando en una matriz 3x3");
    }

}