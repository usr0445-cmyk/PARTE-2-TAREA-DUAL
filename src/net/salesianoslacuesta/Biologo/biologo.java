package net.salesianoslacuesta.Biologo;

import java.util.ArrayList;

import net.salesianoslacuesta.Investigadores.investigador;

public class biologo extends investigador {
    
    private ArrayList<String> especimenes;

    public biologo(String nombre, double sueldo) {
        super(nombre, "Biologia", sueldo);
        this.especimenes = new ArrayList<>();
    }

    public void agregarEspecimen(String especimen) {
        especimenes.add(especimen);
    }

    @Override
    public String estadoDelSueldo() {
        if (sueldo < 1500) {
            return "El biologo solicita aumento de sueldo";
        } else {
            return "El sueldo del biologo es correcto";
        }
    }

    @Override
    public void trabajar(){
        if (especimenes.isEmpty()) {
            System.out.println("El biologo no tiene especimenes para estudiar");
            return;
    
        }

        for (int i = 0; i < especimenes.size() -1; i++) {
            for (int j = 0; j < especimenes.size() - i - 1; j++) {
                
                String actual = especimenes.get(j);
                String siguiente = especimenes.get(j + 1);
                
                if (actual.length() > siguiente.length()) {

                    //Intercambiamos los especimenes
                    especimenes.set(j, siguiente);
                    especimenes.set(j + 1, actual);
                }
            }
        }
    }

}
