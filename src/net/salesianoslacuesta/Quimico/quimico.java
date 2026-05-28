package net.salesianoslacuesta.Quimico;
import java.util.ArrayList;

//Usamos implements para implementar la interfaz TrabajoDual
public class quimico extends investigador implements trabajoDual {

    private ArrayList<String> elementos;

    public quimico(String nombre, double sueldo) {
        super(nombre, "Quimica", sueldo);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    @Override
    public void trabajar() {
       //Invertimos lista manualmente
        int i = 0;
        int j = elementos.size() - 1;

        while (i < j) {
            String temporal = elementos.get(i);
            elementos.set(i, elementos.get(j));
            elementos.set(j, temporal);
            i++;
            // Decrementamos j para que se mueva hacia el centro de la lista
            j--;
        }
    }

    @Override
    public void trabajoDual() {
        for (int i = 0; i < elementos.size() - 1; i++) {
            for (int j = 0; j < elementos.size() - i - 1; j++) {

                String actual = elementos.get(j);
                String siguiente = elementos.get(j + 1);

                if (actual.length() > siguiente.length()) {
                    elementos.set(j, siguiente);
                    elementos.set(j + 1, actual);
                }
            }
        }
        if (!elementos.isEmpty()) {
            elementos.remove(elementos.size() - 1);
        }
        System.out.println("Trabajo dual hecho: El quimico ha ordenado y eliminado el elemento mas largo de su lista");
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }



    
}
