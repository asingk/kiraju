package kiraju.model;
// Generated Nov 1, 2017 11:35:46 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * General generated by hbm2java
 */
public class General  implements java.io.Serializable {


     private short id;
     private Date installDt;
     private Boolean modeCafe;
     private String printerCode;

    public General() {
    }

	
    public General(short id) {
        this.id = id;
    }
    public General(short id, Date installDt, Boolean modeCafe, String printerCode) {
       this.id = id;
       this.installDt = installDt;
       this.modeCafe = modeCafe;
       this.printerCode = printerCode;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public Date getInstallDt() {
        return this.installDt;
    }
    
    public void setInstallDt(Date installDt) {
        this.installDt = installDt;
    }
    public Boolean getModeCafe() {
        return this.modeCafe;
    }
    
    public void setModeCafe(Boolean modeCafe) {
        this.modeCafe = modeCafe;
    }
    public String getPrinterCode() {
        return this.printerCode;
    }
    
    public void setPrinterCode(String printerCode) {
        this.printerCode = printerCode;
    }




}


