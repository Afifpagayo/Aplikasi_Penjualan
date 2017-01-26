package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import KONEKSI.koneksi;
import MODEL.MotorModel;

public class MotorController 
{
    koneksi conn = new koneksi();
    
    public void simpan(MotorModel MM)
    {
        conn.koneksiDataBase();
        String sql ="insert into tabel_motor(KodeMotor,JenisMotor,NamaMotor,MerkMotor,HargaMotor,Stock)"
                   + "values ('"+MM.getKodeMotor()+"',"
                   + "'"+MM.getJenisMotor()+"',"
                   + "'"+MM.getNamaMotor()+"',"
                   + "'"+MM.getMerkMotor()+"',"
                   + "'"+MM.getHargaMotor()+"',"
                   + "'"+MM.getStock()+"')";
        try 
        {
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }
    }
    
    public void update (MotorModel MM)
    {
        conn.koneksiDataBase();
        
        try 
        {
            int id = MM.getIdMotor();
            String kode = MM.getKodeMotor();
            String jenis = MM.getJenisMotor();
            String nama = MM.getNamaMotor();
            String merk = MM.getMerkMotor();
            int harga = MM.getHargaMotor();
            int stock = MM.getStock();
            
            String sql = "update tabel_motor "
                    + "set KodeMotor=('" + kode + "'),"
                    + "JenisMotor=('" + jenis + "'),"
                    + "NamaMotor=('" + nama + "'),"
                    + "MerkMotor=('"+ merk +"'),"
                    + "HargaMotor=('"+ harga +"'),"
                    + "Stock=('"+ stock +"')"
                    + "where idMotor=('" + id + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void hapus(MotorModel MM)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tabel_motor where idMotor=('"+MM.getIdMotor()+"')"; 
           conn.st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terhapus");
        }
    }
}
