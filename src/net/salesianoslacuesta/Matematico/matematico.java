package net.salesianoslacuesta.Matematico;

import net.salesianoslacuesta.Investigadores.investigador;

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

    public void trabajar(int factor) {
        for (int i = 0; i < resultadosActuales.length; i++) {
            for (int j = 0; j < resultadosActuales[i].length; j++) {
                resultadosActuales[i][j] *= factor;
            }
        }
        System.out.println("La matriz ha sido multiplicada por el factor: " + factor);
    } 






}