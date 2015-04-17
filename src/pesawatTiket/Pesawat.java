/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesawatTiket;

/**
 *
 * @author acer-pc
 */
public class Pesawat {
    
    private String kode;
    private String Asal;
    private String Tujuan;
    private Kursi kursi;

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the Asal
     */
    public String getAsal() {
        return Asal;
    }

    /**
     * @param Asal the Asal to set
     */
    public void setAsal(String Asal) {
        this.Asal = Asal;
    }

    /**
     * @return the Tujuan
     */
    public String getTujuan() {
        return Tujuan;
    }

    /**
     * @param Tujuan the Tujuan to set
     */
    public void setTujuan(String Tujuan) {
        this.Tujuan = Tujuan;
    }

    /**
     * @return the kursi
     */
    public Kursi getKursi() {
        return kursi;
    }

    /**
     * @param kursi the kursi to set
     */
    public void setKursi(Kursi kursi) {
        this.kursi = kursi;
    }
    
}
