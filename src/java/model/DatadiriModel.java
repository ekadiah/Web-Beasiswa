/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Acer
 */
public class DatadiriModel {
    private int ID;
       private String nama;
    private int noktp;
    private String kelamin;
    private String status;
    private String agama;
    private String tanggal;
    private String alamat;
    private int nohp;
    private String pendidikan;
    private int tahunlulus;


    public DatadiriModel(String nama, int noktp, String kelamin, String status, String agama, String tanggal, String alamat,
            int nohp, String pendidikan, int tahunlulus){
        
        this.nama=nama;
        this.noktp=noktp;
        this.kelamin=kelamin;
        this.status=status;
        this.agama=agama;
        this.tanggal=tanggal;
        this.alamat=alamat;
        this.nohp=nohp;
        this.pendidikan=pendidikan;
        this.tahunlulus=tahunlulus;
    }
    
    public DatadiriModel( int ID, String nama, int noktp, String kelamin, String status, String agama, String tanggal, String alamat,
            int nohp, String pendidikan, int tahunlulus){
        this.ID=ID;
        this.nama=nama;
        this.noktp=noktp;
        this.kelamin=kelamin;
        this.status=status;
        this.agama=agama;
        this.tanggal=tanggal;
        this.alamat=alamat;
        this.nohp=nohp;
        this.pendidikan=pendidikan;
        this.tahunlulus=tahunlulus;
    }
    
    public DatadiriModel(){
        
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the noktp
     */
    public int getNoktp() {
        return noktp;
    }

    /**
     * @param noktp the noktp to set
     */
    public void setNoktp(int noktp) {
        this.noktp = noktp;
    }

    /**
     * @return the kelamin
     */
    public String getKelamin() {
        return kelamin;
    }

    /**
     * @param kelamin the kelamin to set
     */
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the agama
     */
    public String getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(String agama) {
        this.agama = agama;
    }

   
    public String getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kab
     */
    
    public int getNohp() {
        return nohp;
    }

    /**
     * @param nohp the nohp to set
     */
    public void setNohp(int nohp) {
        this.nohp = nohp;
    }

    /**
     * @return the pendidikan
     */
    public String getPendidikan() {
        return pendidikan;
    }

    /**
     * @param pendidikan the pendidikan to set
     */
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    /**
     * @return the tahunlulus
     */
    public int getTahunlulus() {
        return tahunlulus;
    }

    /**
     * @param tahunlulus the tahunlulus to set
     */
    public void setTahunlulus(int tahunlulus) {
        this.tahunlulus = tahunlulus;
    }

    
    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
