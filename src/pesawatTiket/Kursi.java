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
public class Kursi {
    
    private String nokursi;
    private String jeniskursi;

    /**
     * @param nokursi the nokursi to set
     */
    public void setNokursi(String nokursi) {
        this.nokursi = nokursi;
    }
    
    /**
     * @return the nokursi
     */
    public String getNokursi() {
        return nokursi;
    }

    /**
     * @param jeniskursi the jeniskursi to set
     * @throws java.lang.Exception
     */
    public void setJeniskursi(String jeniskursi) throws Exception{
        if(jeniskursi.equalsIgnoreCase("Ekonomi") || 
                jeniskursi.equalsIgnoreCase("Bisnis")){
            this.jeniskursi = jeniskursi;}
        else{
            throw new Exception("Pilih satu = Ekonomi atau Bisnis");
        }
    }

    /**
     * @return the jeniskursi
     */
    public String getJeniskursi() {
        return jeniskursi;
    }

    
    
}
