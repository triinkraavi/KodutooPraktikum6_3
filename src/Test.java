import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Telefon mobiil1 = new Mobiiltelefon("56724999", "Tirin", "Kadri", true);
        Telefon lauatelefon1 = new Lauatelefon("6123456", "Plärin", "Kadrina");
        Telefon mobiil2 = new Mobiiltelefon("57324646", "Kikerikii", "Karmo", false);
        Telefon lauatelefon2 = new Lauatelefon("6754832", "Plärin", "Tartu");

        Telefon[] telefonid = {mobiil1, lauatelefon1, mobiil2, lauatelefon2};
        System.out.println("Esialgne järjestus: " + Arrays.toString(telefonid));
        java.util.Arrays.sort(telefonid);
        System.out.println("Sorteeritud järjestus: " + Arrays.toString(telefonid));
    }
}
