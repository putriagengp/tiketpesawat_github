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
public class Penumpang {
    
    private String namapenumpang;
    private String noktp;
    private String nohp;

    /**
     * @return the nama
     */
    public String getNamapenumpang() {
        return namapenumpang;
    }

    /**
     */
    public void setNamapenumpang(String namapenumpang) throws Exception{
        for(char c:namapenumpang.toCharArray()){
            if(Character.isDigit(c)){
                throw new Exception("Nama hanya bisa terdiri dari huruf");
            }
        }
        this.namapenumpang = namapenumpang;
    }

    /**
     * @return the noktp
     */
    public String getNoktp() {
        return noktp;
    }

    /**
     * @param noktp the noktp to set
     */
    public void setNoktp(String noktp) throws Exception {
        try{
            Integer.parseInt(noktp);
        }
        catch(Exception e){
            throw new Exception("Nomor ktp hanya bisa berupa angka");
        }
        this.noktp = noktp;
    }

    /**
     * @return the nohp
     */
    public String getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     * @throws java.lang.Exception
     */
    public void setNohp(String nohp) throws Exception {
        try{
            Integer.parseInt(nohp);
        }
        catch(Exception e){
            throw new Exception("Nomor hp hanya bisa berupa angka");
        }
        this.nohp = nohp;
        
    }
     
}