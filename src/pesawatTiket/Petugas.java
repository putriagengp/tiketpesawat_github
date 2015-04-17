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
public class Petugas {
 
    private String namapetugas;
    private String id;

    /**
     * @return the nama
     */
    public String getNamapetugas() {
        return namapetugas;
    }

    /**
     * @param nama the nama to set
     * @throws java.lang.Exception
     */
    public void setNamapetugas(String namapetugas) throws Exception {
        for(char c:namapetugas.toCharArray()){
            if (Character.isDigit(c)){
                throw new Exception("Nama hanya bisa terdiri dari huruf");
            }
        }
        this.namapetugas = namapetugas;
    }
   
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}    
