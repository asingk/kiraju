package kiraju.model;
// Generated Sep 9, 2017 10:15:32 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;




/**
 * MenuItem generated by hbm2java
 */
public class MenuItem  implements java.io.Serializable {


//     private int id;
     private String nama;
     private Menu menuId;
     private Integer stok;
     private String code;
     private Boolean stokFlag;
     private Integer hargaTotal;
     private Integer modal;
     private Integer untungCode;
     private Integer untung;
     private Integer tambahanCode;
     private Integer tambahan;
     private Set<StokOpnameItem> stokOpname = new HashSet<>(0);

    public MenuItem() {
    }

	
    public MenuItem(String code) {
        this.code = code;
    }
    public MenuItem(String nama, Menu menuId, Integer stok, String code, Boolean stokFlag, Integer hargaTotal, Integer modal, Integer untungCode, Integer untung, Integer tambahanCode, Integer tambahan) {
//       this.id = id;
       this.nama = nama;
       this.menuId = menuId;
       this.stok = stok;
       this.code = code;
       this.stokFlag = stokFlag;
       this.hargaTotal = hargaTotal;
       this.modal = modal;
       this.untungCode = untungCode;
       this.untung = untung;
       this.tambahanCode = tambahanCode;
       this.tambahan = tambahan;
    }
   
//    public int getId() {
//        return this.id;
//    }
//    
//    public void setId(int id) {
//        this.id = id;
//    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Menu getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(Menu menuId) {
        this.menuId = menuId;
    }
    public Integer getStok() {
        return this.stok;
    }
    
    public void setStok(Integer stok) {
        this.stok = stok;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Boolean getStokFlag() {
        return this.stokFlag;
    }
    
    public void setStokFlag(Boolean stokFlag) {
        this.stokFlag = stokFlag;
    }
    public Integer getHargaTotal() {
        return this.hargaTotal;
    }
    
    public void setHargaTotal(Integer hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
    public Integer getModal() {
        return this.modal;
    }
    
    public void setModal(Integer modal) {
        this.modal = modal;
    }
    public Integer getUntungCode() {
        return this.untungCode;
    }
    
    public void setUntungCode(Integer untungCode) {
        this.untungCode = untungCode;
    }
    public Integer getUntung() {
        return this.untung;
    }
    
    public void setUntung(Integer untung) {
        this.untung = untung;
    }
    public Integer getTambahanCode() {
        return this.tambahanCode;
    }
    
    public void setTambahanCode(Integer tambahanCode) {
        this.tambahanCode = tambahanCode;
    }
    public Integer getTambahan() {
        return this.tambahan;
    }
    
    public void setTambahan(Integer tambahan) {
        this.tambahan = tambahan;
    }

    public Set<StokOpnameItem> getStokOpname() {
        return stokOpname;
    }

    public void setStokOpname(Set<StokOpnameItem> stokOpname) {
        this.stokOpname = stokOpname;
    }




}

