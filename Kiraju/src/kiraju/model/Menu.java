package kiraju.model;
// Generated May 18, 2017 12:05:47 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Menu generated by hbm2java
 */
public class Menu  implements java.io.Serializable {


     private short id;
     private String nama;
     private Integer harga;
     private Date createdDt;
     private Date updatedDt;
     private JenisMenu jenis;
     private Short deletedFlag;

    public Menu() {
    }

    public Menu(String nama, Integer harga, Date createdDt, Date updatedDt, JenisMenu jenis, Short deletedFlag) {
       this.nama = nama;
       this.harga = harga;
       this.createdDt = createdDt;
       this.updatedDt = updatedDt;
       this.jenis = jenis;
       this.deletedFlag = deletedFlag;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Integer getHarga() {
        return this.harga;
    }
    
    public void setHarga(Integer harga) {
        this.harga = harga;
    }
    public Date getCreatedDt() {
        return this.createdDt;
    }
    
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }
    public Date getUpdatedDt() {
        return this.updatedDt;
    }
    
    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
    public JenisMenu getJenis() {
        return this.jenis;
    }
    
    public void setJenis(JenisMenu jenis) {
        this.jenis = jenis;
    }
    public Short getDeletedFlag() {
        return this.deletedFlag;
    }
    
    public void setDeletedFlag(Short deletedFlag) {
        this.deletedFlag = deletedFlag;
    }




}

