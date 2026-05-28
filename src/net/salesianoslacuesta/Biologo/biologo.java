package net.salesianoslacuesta.Biologo;

import java.util.ArrayList;

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

}
