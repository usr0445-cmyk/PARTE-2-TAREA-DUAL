package net.salesianoslacuesta.Biologo;

import java.util.ArrayList;

public class biologo extends investigador {
    
    private ArrayList<String> especimenes;

    public biologo(String nombre, double sueldo) {
        super(nombre, "Biologia", sueldo);
        this.especimenes = new ArrayList<>();
    }
}
