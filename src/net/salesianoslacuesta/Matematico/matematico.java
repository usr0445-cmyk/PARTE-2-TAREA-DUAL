package net.salesianoslacuesta.Matematico;

import net.salesianoslacuesta.Investigadores.investigador;

public abstract class matematico extends investigador {

    //Aqui creamos un atributo para guardar los resultados actuales de la matriz
    private int[][] resultadosActuales; 

    //Creamos este constructor para inicializar los atributos de la clase matematico
    public matematico(String nombre, int[][] matrizInicial, double sueldo) {
        super(nombre, "Matematicas", sueldo);
        this.resultadosActuales = matrizInicial; 
    }

    //Override para mostrar la informacion del matematico
    @Override
    public void trabajar() {
        System.out.println(" Esta trabajando en una matriz 3x3");
    }

    //Aqui creamos dos metodos para trabajar con la matriz, uno para multiplicar por un factor y otro para sumar otra matriz
    public void trabajar(int factor) {
        for (int i = 0; i < resultadosActuales.length; i++) {
            for (int j = 0; j < resultadosActuales[i].length; j++) {
                // Multiplicamos cada elemento de la matriz por el factor
                resultadosActuales[i][j] *= factor;
            }
        }
        System.out.println("La matriz ha sido multiplicada por el factor: " + factor);
    } 

    //Metodo para sumar otra matriz a la matriz actual comprobando que ambas matrices sean 3x3
    public void trabajar(int otraMatriz[][] ) {
        if (otraMatriz.length != 3 || otraMatriz[0].length != 3) {
            System.out.println("La matriz recibida no es 3x3");
            return;
    }

    // Sumamos cada elemento de la otra matriz a la matriz actual
    for (int i = 0; i < resultadosActuales.length; i++) {
        for (int j = 0; j < resultadosActuales[i].length; j++) {
            resultadosActuales[i][j] += otraMatriz[i][j];
        }
    }
    System.out.println("Se han sumado las matrices correctamente");
}

//Por ultimo, ponemos un metodo para mostrar el estado del sueldo del matematico

    @Override
    public String estadoDelSueldo() {
    if (sueldo < 1800) {
        return "El matematico solicita aumento de sueldo";
    } else {
        return "El sueldo del matematico es correcto";
    }
}
}