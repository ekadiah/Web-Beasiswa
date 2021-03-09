/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.BeasiswaModel;

/**
 *
 * @author Acer
 */
public class BeasiswaDAO {

    public void insertData(BeasiswaModel beasiswa) {
        
    
try{
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("insert into databeasiswa(Kategori,Jenjang_Pendidikan, Lembaga_Beasiswa,Surat_Keterangan, Periode_Perkuliahan, Universitas, Fakultas, Jurusan, Lokasi_Tes, Program_Beasiswa_Lain) value(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, beasiswa.getKategori());
            ps.setString(2, beasiswa.getJenjang());
            ps.setString(3, beasiswa.getLembaga());
            ps.setString(4, beasiswa.getSurat());
            ps.setString(5, beasiswa.getPeriode());
            ps.setString(6, beasiswa.getUniv());
            ps.setString(7, beasiswa.getFakultas());
            ps.setString(8, beasiswa.getJurusan());
            ps.setString(9, beasiswa.getLokasi());
            ps.setString(10, beasiswa.getPernyataan());
            
            
            
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        
    }
    public List<BeasiswaModel> showAllData() throws SQLException {

	List<BeasiswaModel> beasiswa = new ArrayList<>();
	try {
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("select * from databeasiswa");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                BeasiswaModel u = new BeasiswaModel();
                
                u.setID(rs.getInt("ID_Peserta"));
                u.setKategori(rs.getString("Kategori"));
                u.setJenjang(rs.getString("Jenjang_Pendidikan"));
                u.setLembaga(rs.getString("Lembaga_Beasiswa"));
                u.setSurat(rs.getString("Surat_Keterangan"));
                u.setPeriode(rs.getString("Periode_Perkuliahan"));
                u.setUniv(rs.getString("Universitas"));
                u.setFakultas(rs.getString("Fakultas"));
                u.setJurusan(rs.getString("Jurusan"));
                u.setLokasi(rs.getString("Lokasi_Tes"));
                u.setPernyataan(rs.getString("Program_Beasiswa_Lain"));
                
                beasiswa.add(u);
            } 
           }catch (SQLException e) {
                System.out.println(e);
            }
        return beasiswa;
    }
    
    public static BeasiswaModel getDataById(int ID) {
        BeasiswaModel u = null;
        try {
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("select * from databeasiswa where ID_Peserta=?");
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new BeasiswaModel();
                u.setID(rs.getInt("ID_Peserta"));
                u.setKategori(rs.getString("Kategori"));
                u.setJenjang(rs.getString("Jenjang_Pendidikan"));
                u.setLembaga(rs.getString("Lembaga_Beasiswa"));
                u.setSurat(rs.getString("Surat_Keterangan"));
                u.setPeriode(rs.getString("Periode_Perkuliahan"));
                u.setUniv(rs.getString("Universitas"));
                u.setFakultas(rs.getString("Fakultas"));
                u.setJurusan(rs.getString("Jurusan"));
                u.setLokasi(rs.getString("Lokasi_Tes"));
                u.setPernyataan(rs.getString("Program_Beasiswa_Lain"));
                
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return u;
    }
    
     public void editData(BeasiswaModel beasiswa){
        
        try{
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("update databeasiswa set Kategori=?,Jenjang_Pendidikan=?, Lembaga_Beasiswa=?,Surat_Keterangan=?, Periode_Perkuliahan=?, Universitas=?, Fakultas=?, Jurusan=?, Lokasi_Tes=?, Program_Beasiswa_Lain=? where ID_Peserta=?");
            ps.setString(1, beasiswa.getKategori());
            ps.setString(2, beasiswa.getJenjang());
            ps.setString(3, beasiswa.getLembaga());
            ps.setString(4, beasiswa.getSurat());
            ps.setString(5, beasiswa.getPeriode());
            ps.setString(6, beasiswa.getUniv());
            ps.setString(7, beasiswa.getFakultas());
            ps.setString(8, beasiswa.getJurusan());
            ps.setString(9, beasiswa.getLokasi());
            ps.setString(10, beasiswa.getPernyataan());
            ps.setInt(11, beasiswa.getID());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     
    public void deleteData(int ID) {
        try {
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("delete from databeasiswa where ID_Peserta=?");
            ps.setInt(1, ID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
}



