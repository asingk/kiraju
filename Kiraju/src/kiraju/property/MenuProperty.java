/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiraju.property;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author arvita
 */
public class MenuProperty {
    private final NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id", "ID"));
    
    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty nama = new SimpleStringProperty();
    private final StringProperty harga = new SimpleStringProperty();
    private final ObjectProperty<Date> createdDate = new SimpleObjectProperty<>();
    private final ObjectProperty<Date> updatedDate = new SimpleObjectProperty<>();
    private final IntegerProperty jenisId = new SimpleIntegerProperty();
    private final StringProperty jenisNama = new SimpleStringProperty();
//    private final StringProperty deletedFlag = new SimpleStringProperty();
    
    //Arvit@20170830-Retail Version
//    private final StringProperty code = new SimpleStringProperty();
//    private final StringProperty jenisCode = new SimpleStringProperty();
    private final StringProperty status = new SimpleStringProperty();

    /**
     * @return the id
     */
    public int getId() {
        return id.get();
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id.set(id);
    }
    
    public IntegerProperty idProperty() {
        return id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama.get();
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama.set(nama);
    }
    
    public StringProperty namaProperty() {
        return nama;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga.get();
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga.set(numberFormat.format(harga));
    }
    
    public StringProperty hargaProperty() {
        return harga;
    }
    
    public Date getCreatedDate() {
        return createdDate.get();
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate.set(createdDate);
    }
    
    public ObjectProperty<Date> createdDateProperty() {
        return createdDate;
    }
    
    public Date getUpdatedDate() {
        return updatedDate.get();
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate.set(updatedDate);
    }
    
    public ObjectProperty<Date> updatedDateProperty() {
        return updatedDate;
    }

    /**
     * @return the jenisId
     */
    public int getJenisId() {
        return jenisId.get();
    }

    /**
     * @param jenisId the jenisId to set
     */
    public void setJenisId(int jenisId) {
        this.jenisId.set(jenisId);
    }
    
    public IntegerProperty jenisIdProperty() {
        return jenisId;
    }

    /**
     * @return the jenisNama
     */
    public String getJenisNama() {
        return jenisNama.get();
    }

    /**
     * @param jenisNama the jenisNama to set
     */
    public void setJenisNama(String jenisNama) {
        this.jenisNama.set(jenisNama);
    }

    public StringProperty jenisNamaProperty() {
        return jenisNama;
    }

//    public short getDeletedFlag() {
//        return deletedFlag.get().equalsIgnoreCase("Aktif") ? (short) 0 : (short) 1;
//    }
//
//    public void setDeletedFlag(short deletedFlag) {
//        String status = deletedFlag == 0 ? "Aktif" : "Tidak Aktif";
//        this.deletedFlag.set(status);
//    }
//    
//    public StringProperty deletedFlagProperty() {
//        return deletedFlag;
//    }
//
//    public String getCode() {
//        return code.get();
//    }
//
//    public void setCode(String cd) {
//        this.code.set(cd);
//    }
//    
//    public StringProperty codeProperty() {
//        return code;
//    }
//
//    public String getJenisCode() {
//        return jenisCode.get();
//    }
//
//    public void setJenisCode(String jenisCode) {
//        this.jenisCode.set(jenisCode);
//    }
//    
//    public StringProperty jenisCodeProperty() {
//        return jenisCode;
//    }
    public Boolean getStatus() {
        Boolean statusBoolean = status.get().equalsIgnoreCase("Ya") ? Boolean.TRUE : Boolean.FALSE;
        return statusBoolean;
    }

    public void setStatus(Boolean status) {
        String statusString = status ? "Ya" : "Tidak";
        this.status.set(statusString);
    }
    
    public StringProperty statusProperty() {
        return status;
    }
}
