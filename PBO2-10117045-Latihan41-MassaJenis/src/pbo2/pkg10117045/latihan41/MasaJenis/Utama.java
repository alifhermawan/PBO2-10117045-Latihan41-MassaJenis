package pbo2.pkg10117045.latihan41.MasaJenis;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk mencari massa 
 * jenis kubus
 */
public class Utama {

    public static void main(String[] args) {
        Kubus kbs = new Kubus();

        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi\t: " + kbs.getSisi());
        System.out.println("Massa\t: " + kbs.getMassa());
        

        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume\t: " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa\t: " + kbs.hitungMassaJenis(kbs.getMassa(), kbs.hitungVolume(kbs.getSisi())));
    }

}
