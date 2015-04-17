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
public class Sistem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Petugas petugas1 = new Petugas();
            petugas1.setId("13.7806");
            
            try{
                petugas1.setNamapetugas("Putri");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        
        Penumpang penumpang1 = new Penumpang();    
            try{
                penumpang1.setNamapenumpang("Ageng");
            } catch (Exception e){
                System.out.println("Terjadi error:" + e.getMessage());
            }
            
            try{
                penumpang1.setNohp("0858963456");
            } catch (Exception e){
                System.out.println("Terjadi error:" + e.getMessage());
            }
            
            try{
                penumpang1.setNoktp("1234567890");
            } catch (Exception e){
                System.out.println(e.getMessage());
            } 
               
        Pesawat pesawat1 = new Pesawat();
            pesawat1.setKode("BOEING737");
            pesawat1.setAsal("CGK");
            pesawat1.setTujuan("PTK");
            
        Kursi kursi1 = new Kursi();
            kursi1.setNokursi("15B");
            try{
                kursi1.setJeniskursi("Eksekutif");
            } catch(Exception e){
                System.out.println("Terjadi error:"+ e.getMessage());
            }
                    
        Tiket tiket1 = new Tiket();
        
        tiket1.setDate(new Date());
        tiket1.setKodeTiket("0607");
        tiket1.setPetugas(petugas1);
        tiket1.setPenumpang(penumpang1);
        tiket1.setPesawat(pesawat1);
        tiket1.setKursi(kursi1);
        cetakTiket (tiket1);
    }
    
    static void cetakTiket(Tiket tiket1){
        
            System.out.println(tiket1.getDate());
            System.out.println(tiket1.getKodeTiket());
            System.out.println(tiket1.getPetugas().getNamapetugas());
            System.out.println(tiket1.getPetugas().getId());
            System.out.println(tiket1.getPenumpang().getNamapenumpang());
            System.out.println(tiket1.getPenumpang().getNohp());
            System.out.println(tiket1.getPenumpang().getNoktp());
            System.out.println(tiket1.getPesawat().getKode());
            System.out.println(tiket1.getPesawat().getAsal());
            System.out.println(tiket1.getPesawat().getTujuan());
            System.out.println(tiket1.getKursi().getJeniskursi());
            System.out.println(tiket1.getKursi().getNokursi());
            
        }
         
}