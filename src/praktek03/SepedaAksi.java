package praktek03;

public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        s.setMerk("Kupu-Kupu");
        s.setWarna("Kuning");
        s.setHarga(2000);

        s.cetakInfo();

        System.out.println("mereknya \t: ");
        System.out.println(s.getMerk());
        System.out.println("warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.println("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}
