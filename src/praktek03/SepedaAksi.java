package praktek03;

public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda s = new Sepeda();
        s.setMerk("Kupu-Kupu");
        s.setWarna("Kuning");
        s.setHarga(2000);
        //s.setJenisMotor
        s.cetakInfo();

        System.out.println("mereknya \t: ");
        System.out.println(s.getMerk());
        System.out.println("warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.println("Harganya \t: ");
        System.out.println(s.getHarga());

        SepedaMotor sm = new SepedaMotor();
        sm.setMerk("Hamaya");
        sm.setWarna("Hitam");
        sm.setHarga(100000);
        sm.setJenisMotor("Listrik");
        sm.cetakInfo();
        System.out.println("Jenis \t:"+sm.getJenisMotor());
        sm.throttle();

    }
}
