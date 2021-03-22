public class Mobiiltelefon extends Telefon{
    private String omanikuNimi;
    private boolean pildistamisvõimalus;

    public Mobiiltelefon(String telefoniNumber, String telefoniHelin, String omanikuNimi, boolean pildistamisvõimalus) {
        super(telefoniNumber, telefoniHelin);
        this.omanikuNimi = omanikuNimi;
        this.pildistamisvõimalus = pildistamisvõimalus;
    }

    @Override
    String tähtisInfo() {
        return omanikuNimi;
    }

    @Override
    public String toString() {
        return "Mobiiltelefon: " + super.toString() + ", omanikuNimi = " + omanikuNimi +
                ", pildistamisvõimalus = " + pildistamisvõimalus;
    }
}
