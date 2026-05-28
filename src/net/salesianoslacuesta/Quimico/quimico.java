package net.salesianoslacuesta.Quimico;
import java.util.ArrayList;

public class quimico extends investigador implements trabajoDual {

    private ArrayList<String> elementos;

    // Creamos este constructor para iniciar los atributos de quimico
    public quimico(String nombre, double sueldo) {
        super(nombre, "Quimica", sueldo);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }
    
}
