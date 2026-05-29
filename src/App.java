
import java.util.Scanner;
import net.salesianoslacuesta.Biologo.biologo;
import net.salesianoslacuesta.Investigadores.investigador;
import net.salesianoslacuesta.Quimico.quimico;
import net.salesianoslacuesta.Matematico.matematico;


public class App {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona el tipo de investigador:");
        System.out.println("1. Biologo");
        System.out.println("2. Quimico");
        System.out.print("3. Matematico");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        investigador investigador = null;   

        if (opcion == 1) {
            investigador = new biologo("Biologo", 1500);
        } else if (opcion == 2) {
            investigador = new quimico("Quimico", 1600);
        } else if (opcion == 3) {
            investigador = new matematico("Matematico", 1700, matriz);
        }


    }
}
