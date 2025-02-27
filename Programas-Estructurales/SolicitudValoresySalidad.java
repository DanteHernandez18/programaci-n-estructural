import java.util.Scanner;
public class SolicitudValoresySalidad {
    public static void main(String[] args) {
        String nombre;
        String ing;
        int edad;
        nombre="jose luis";
        ing="ingeiero";
        edad=18;
        Scanner lectura = new Scanner(System.in);
        nombre=lectura.nextLine();
        System.out.println(nombre+" es " +ing+ " en asunto");
        System.out.println("introduce tu nombre"+ edad);
        edad = lectura.nextLine();
        System.out.println("introduce tu edad"+ " "+nombre+ " es " + edad);
    }
}