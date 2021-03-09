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
public class BeasiswaModel{
    private int ID;
    private int nourut;
    private String kategori;
    private String jenjang;
    private String lembaga;
    private String surat;
    private String periode;
    private String univ;
    private String fakultas;
    private String jurusan;
    private String lokasi;
    private String pernyataan;
    
    public BeasiswaModel(String kategori, String jenjang, String lembaga, String surat, String periode, String univ, String fakultas,String jurusan, String lokasi, String pernyataan){
        
        this.kategori= kategori;
        this.jenjang= jenjang;
        this.lembaga=lembaga;
        this.surat=surat;
        this.periode= periode;
        this.univ=univ;
        this.fakultas=fakultas;
        this.jurusan=jurusan;
        this.lokasi=lokasi;
        this.pernyataan=pernyataan;
    }
    
    public BeasiswaModel(int ID, String kategori, String jenjang, String lembaga, String surat, String periode, String univ, String fakultas,String jurusan, String lokasi, String pernyataan){
        this.ID= ID;

        this.kategori= kategori;
        this.jenjang= jenjang;
        this.lembaga=lembaga;
        this.surat=surat;
        this.periode= periode;
        this.univ=univ;
        this.fakultas=fakultas;
        this.jurusan=jurusan;
        this.lokasi=lokasi;
        this.pernyataan=pernyataan;
}

    public BeasiswaModel() {
        
    }

 

    /**
     * @return the kategori
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the jenjang
     */
    public String getJenjang() {
        return jenjang;
    }

    /**
     * @param jenjang the jenjang to set
     */
    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    /**
     * @return the lembaga
     */
    public String getLembaga() {
        return lembaga;
    }

    /**
     * @param lembaga the lembaga to set
     */
    public void setLembaga(String lembaga) {
        this.lembaga = lembaga;
    }

    /**
     * @return the surat
     */
    public String getSurat() {
        return surat;
    }

    /**
     * @param surat the surat to set
     */
    public void setSurat(String surat) {
        this.surat = surat;
    }

    /**
     * @return the periode
     */
    public String getPeriode() {
        return periode;
    }

    /**
     * @param periode the periode to set
     */
    public void setPeriode(String periode) {
        this.periode = periode;
    }

    /**
     * @return the univ
     */
    public String getUniv() {
        return univ;
    }

    /**
     * @param univ the univ to set
     */
    public void setUniv(String univ) {
        this.univ = univ;
    }

    /**
     * @return the fakultas
     */
    public String getFakultas() {
        return fakultas;
    }

    /**
     * @param fakultas the fakultas to set
     */
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    /**
     * @return the jurusan
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * @param jurusan the jurusan to set
     */
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    /**
     * @return the lokasi
     */
    public String getLokasi() {
        return lokasi;
    }

    /**
     * @param lokasi the lokasi to set
     */
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    /**
     * @return the pernyataan
     */
    public String getPernyataan() {
        return pernyataan;
    }

    /**
     * @param pernyataan the pernyataan to set
     */
    public void setPernyataan(String pernyataan) {
        this.pernyataan = pernyataan;
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

    /**
     * @return the nourut
     */
    public int getNourut() {
        return nourut;
    }

    /**
     * @param nourut the nourut to set
     */
    public void setNourut(int nourut) {
        this.nourut = nourut;
    }

    /**
     * @return the nama
     */

}
    
    

