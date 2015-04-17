/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesawatTiket;

import java.util.Date;

/**
 *
 * @author acer-pc
 */
public class Tiket {
    
    private Date tanggal;
    private String kodetiket;
    private Petugas petugas;
    private Penumpang penumpang;
    private Pesawat pesawat;
    private Kursi tempatduduk;
    private Kursi kursi;
    
    void setDate(Date tanggal){
        this.tanggal = tanggal;
    }
    
    Date getDate(){
        return tanggal;
    }
    
    void setKodeTiket (String kodetiket){
        this.kodetiket = kodetiket;
    }
            
    String getKodeTiket(){
        return kodetiket;
    }
    
    void setPetugas(Petugas petugas){
        this.petugas = petugas;
    }
    
    Petugas getPetugas(){
        return petugas;
    }
    
    void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    
    Penumpang getPenumpang(){
        return penumpang;
    }
    
    void setPesawat(Pesawat pesawat){
        this.pesawat = pesawat;
    }
    
    Pesawat getPesawat(){
        return pesawat;
    }
    
    void setKursi(Kursi kursi){
        this.kursi = kursi;
    }
    
    Kursi getKursi(){
        return kursi;
    }
            
}
