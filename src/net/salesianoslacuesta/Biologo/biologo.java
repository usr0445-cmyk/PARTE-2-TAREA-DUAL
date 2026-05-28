package net.salesianoslacuesta.Biologo;
import java.util.ArrayList;
import net.salesianoslacuesta.Investigadores.investigador;

//Usamos extends para heredar de la clase investigador
public class biologo extends investigador {
    
    //Aqui creamos un atributo para guardar los especimenes del biologo
    private ArrayList<String> especimenes;

    // Creamos este constructor para iniciar los atributos de biologos 
    public biologo(String nombre, double sueldo) {
        super(nombre, "Biologia", sueldo);
        this.especimenes = new ArrayList<>();
    }

    public void agregarEspecimen(String especimen) {
        especimenes.add(especimen);
    }

    //Override para mostrar el estado del sueldo del biologo
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

        //Hacemos todo esto con for y if para ordenar la lista de especimenes por cantidad de caracteres
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
        //Se elimina el de mayor cantidad de caracteres, que es el ultimo de la lista
        especimenes.remove(especimenes.size() - 1);
        System.out.println("El biologo ha reorganizado y eliminado el especiamen mas largo de su lista");
    }
     
    public ArrayList<String> getEspecimenes() {
        return especimenes;
    }
    

}
