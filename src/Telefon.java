public abstract class Telefon implements Comparable<Telefon>{
    private String telefoniNumber;
    private String telefoniHelin;

    public Telefon(String telefoniNumber, String telefoniHelin) {
        this.telefoniNumber = telefoniNumber;
        this.telefoniHelin = telefoniHelin;
    }

    public String getNumber() {
        return String.valueOf(telefoniNumber);
    }

    public String getHelin() {
        return telefoniHelin;
    }

    abstract String tähtisInfo();

    String viimasedNumbrid(int n){
        String viimasedNumbrid = telefoniNumber.substring(telefoniNumber.length()-n, telefoniNumber.length());
        return viimasedNumbrid;
    }

    @Override
    public String toString() {
        return "Telefoninumber: " + telefoniNumber +
                ", telefonihelin: " + telefoniHelin;
    }


    public int compareTo(Telefon o) {
        if (Integer.parseInt(viimasedNumbrid(3)) < Integer.parseInt(o.viimasedNumbrid(3)))
            return -1; // negatiivne arv näitab, et this on väiksem kui võrreldav
        if (Integer.parseInt(viimasedNumbrid(3)) > Integer.parseInt(o.viimasedNumbrid(3)))
            return 1; // positiivne arv näitab, et this on suurem kui võrreldav
        return 0; // null tähendab, et mõlemad on võrdsed
    }
}
