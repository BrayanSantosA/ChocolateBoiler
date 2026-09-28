package boiler;

public class Boiler {
    private static Boiler instance;
    private boolean empty;
    private boolean resistenceOn;
    private boolean mixing;

    private Boiler() {
        empty = true;
        resistenceOn = false;
        mixing = false;
    }

    public static Boiler getInstance() {
        if (instance == null) {
            instance = new Boiler();
        }
        return instance;
    }

    public void Fill() {
        if (empty && !resistenceOn) {
            empty = false;
            System.out.println("\nBoiler lleno con chocolate y leche");
        } else {
            System.out.println(
                "\nEl Boiler ya está lleno o la resistencia está prendida"
            );
        }
    }

    public void Mix() {
        if (!empty && !resistenceOn) {
            mixing = true;
            resistenceOn = true;
            System.out.println("\nMezclando chocolate y leche");
        } else {
            System.out.println("\nNo podemos hacer la mezcla");
        }
    }

    public void Empty() {
        if (!empty && resistenceOn) {
            empty = true;
            mixing = false;
            resistenceOn = false;
            System.out.println("\nEl Boiler se vació");
        } else {
            System.out.println(
                "\nNo podemos vaciar el Boiler: debe estar lleno y la resistencia encendida"
            );
        }
    }
}
