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
import model.DatadiriModel;

/**
 *
 * @author Acer
 */
public class DatadiriDAO {
    
    
    
    public void insertData(DatadiriModel datadiri) {
        
    
try{
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("insert into datadiripeserta(Nama,NoKTP,JenisKelamin,StatusMenikah,Agama,TangalLahir,Alamat,NoHp,Pendidikan,TahunLulus)value(?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1, datadiri.getNama());
            ps.setInt(2, datadiri.getNoktp());
            ps.setString(3, datadiri.getKelamin());
            ps.setString(4, datadiri.getStatus());
            ps.setString(5, datadiri.getAgama());
            ps.setString(6, datadiri.getTanggal());
            ps.setString(7, datadiri.getAlamat());
            ps.setInt(8, datadiri.getNohp());
            ps.setString(9, datadiri.getPendidikan());
            ps.setInt(10, datadiri.getTahunlulus());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
        
    }
    public List<DatadiriModel> showAllData() throws SQLException {

	List<DatadiriModel> datadiri = new ArrayList<>();
	try {
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("select * from datadiripeserta where ID_Peserta=?");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                DatadiriModel d = new DatadiriModel();
                d.setID(rs.getInt("ID_Peserta"));
                d.setNama(rs.getString("Nama"));
                d.setNoktp(rs.getInt("NoKTP"));
                d.setKelamin(rs.getString("JenisKelamin"));
                d.setStatus(rs.getString("StatusMenikah"));
                d.setAgama(rs.getString("Agama"));
                d.setTanggal(rs.getString("TangalLahir"));
                d.setAlamat(rs.getString("Alamat"));
                d.setNohp(rs.getInt("NoHp"));
                d.setPendidikan(rs.getString("Pendidikan"));
                d.setTahunlulus(rs.getInt("TahunLulus"));
                datadiri.add(d);
                
            } 
           }catch (SQLException e) {
                System.out.println(e);
            }
        return datadiri;
    }
    
    public static DatadiriModel getDataById(int ID) {
        DatadiriModel d = null;
        try {
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("select * from datadiripeserta where ID_Peserta=?");
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d = new DatadiriModel();
                d.setID(rs.getInt("ID_Peserta"));
                d.setNama(rs.getString("Nama"));
                d.setNoktp(rs.getInt("NoKTP"));
                d.setKelamin(rs.getString("JenisKelamin"));
                d.setStatus(rs.getString("StatusMenikah"));
                d.setAgama(rs.getString("Agama"));
                d.setTanggal(rs.getString("TangalLahir"));
                d.setAlamat(rs.getString("Alamat"));
                d.setNohp(rs.getInt("NoHp"));
                d.setPendidikan(rs.getString("Pendidikan"));
                d.setTahunlulus(rs.getInt("TahunLulus"));            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return d;
    }
    
     public void editData(DatadiriModel datadiri){
        
        try{
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("update datadiripeserta set Nama=?,NoKTP=?,JenisKelamin=?,StatusMenikah=?,Agama=?,TangalLahir=?,Alamat=?,NoHp=?,Pendidikan=?,TahunLulus=? where ID_Peserta=?");
            ps.setString(1, datadiri.getNama());
            ps.setInt(2, datadiri.getNoktp());
            ps.setString(3, datadiri.getKelamin());
            ps.setString(4, datadiri.getStatus());
            ps.setString(5, datadiri.getAgama());
            ps.setString(6, datadiri.getTanggal());
            ps.setString(7, datadiri.getAlamat());
            ps.setInt(8, datadiri.getNohp());
            ps.setString(9, datadiri.getPendidikan());
            ps.setInt(10, datadiri.getTahunlulus());
            ps.setInt(11, datadiri.getID());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     
    public void deleteData(int ID) {
        try {
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("delete from datadiripeserta where ID_Peserta=?");
            ps.setInt(1,ID);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
}




    


    

