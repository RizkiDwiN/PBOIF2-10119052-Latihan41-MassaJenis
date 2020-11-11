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
public class Kubus {
    public int sisi;
    public int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return parMassa/volume;
    }
}
