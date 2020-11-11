package pboif2.pkg10119052.latihan41.massajenis;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Massa kubus berbasis objek
 * 
 */
public class PBOIF210119052Latihan41MassaJenis {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi : " + kubus.getSisi());
        System.out.println("Masssa : " + kubus.getMassa());
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
