package kiraju.model;
// Generated May 18, 2017 12:05:47 PM by Hibernate Tools 4.3.1



/**
 * Meja generated by hbm2java
 */
public class Meja  implements java.io.Serializable {


     private short id;
     private Short status;
     private String nomor;

    public Meja() {
    }

	
    public Meja(short id) {
        this.id = id;
    }
    public Meja(short id, Short status, String nomor) {
       this.id = id;
       this.status = status;
       this.nomor = nomor;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public Short getStatus() {
        return this.status;
    }
    
    public void setStatus(Short status) {
        this.status = status;
    }
    public String getNomor() {
        return this.nomor;
    }
    
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }




}


