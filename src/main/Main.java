package main;
import boiler.Boiler;

public class Main {

    public static void main(String[] args) {

        Boiler boiler = Boiler.getInstance();


        System.out.println("Iniciando proceso de llenado");

        boiler.Fill();
        boiler.Fill();
        
        boiler.Mix();

        boiler.Empty();

        boiler.Empty();

        // Comprobar Singleton
        System.out.println("\n Para comprobar el patrón Singleton");

        Boiler boiler2 = Boiler.getInstance();

        if (boiler == boiler2) {
            System.out.println("Es la misma instancia.");
        } else {
            System.out.println("Son instancias diferentes.");
        }
    }
}
