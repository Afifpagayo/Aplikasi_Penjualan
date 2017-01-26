package CONTROLLER;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import KONEKSI.koneksi;
import MODEL.TransaksiModel;

public class TransaksiController 
{
    koneksi conn = new koneksi();
    
    public void simpanNota(TransaksiModel TM)
    {
        conn.koneksiDataBase();
        String sql ="insert into tabel_nota(NoNota,KodePembeli,NamaPembeli,TanggalPembeli)"
                   + "values ('"+TM.getNoNota()+"',"
                   + "'"+TM.getKodePemebeli()+"',"
                   + "'"+TM.getNamaPembeli()+"',"
                   + "'"+TM.getTanggalPembeli()+"')";
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
    
    public void updateNota (TransaksiModel TM)
    {
        conn.koneksiDataBase();
        
        try 
        {
            String NoNota = TM.getNoNota();
            String KodePembeli = TM.getKodePemebeli();
            String NamaPembeli = TM.getNamaPembeli();
            String Tanggal = TM.getTanggalPembeli();
            
            String sql = "update tabel_nota "
                    + "set NoNota = ('" + NoNota + "'),"
                    + "KodePembeli = ('" + KodePembeli + "'),"
                    + "NamaPembeli = ('" + NamaPembeli + "'),"
                    + "TanggalPembeli = ('"+ Tanggal +"')"
                    + "where NoNota = ('" + NoNota + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void hapusNota (TransaksiModel TM)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from tabel_nota where NoNot a= ('"+TM.getNoNota()+"')"; 
           conn.st.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terhapus");
        }
    }

    public void simpan(TransaksiModel tm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //////////////////////////////////////////////////////////////////////////////
    
    public void simpanPembelian(TransaksiModel TM)
    {
        conn.koneksiDataBase();
        String sql ="insert into table_pembelian(NoNota,KodeMotor,TipeMotor,NamaMotor,MerkMotor,HargaMotor)"
                   + "values ('"+TM.getNoNota()+"',"
                   + "'"+TM.getKodeMotor()+"',"
                   + "'"+TM.getTipeMotor()+"',"
                   + "'"+TM.getNamaMotor()+"',"
                   + "'"+TM.getMerkMotor()+"',"
                   + "'"+TM.getHargaMotor()+"')";
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
    
    public void updatePembelian (TransaksiModel TM)
    {
        conn.koneksiDataBase();
        
        try 
        {
            String NoNota = TM.getNoNota();
            String KodeMotor = TM.getKodeMotor();
            String TipeMotor = TM.getTipeMotor();
            String NamaMotor = TM.getNamaMotor();
            String MerkMotor = TM.getMerkMotor();
            int HargaMotor = TM.getHargaMotor();
            
            String sql = "update table_pembelian "
                    + "set NoNota = ('" + NoNota + "'),"
                    + "KodeMotor = ('" + KodeMotor + "'),"
                    + "TipeMotor = ('" + TipeMotor + "'),"
                    + "NamaMotor = ('" + NamaMotor + "'),"
                    + "MerkMotor = ('" + MerkMotor + "'),"
                    + "HargaMotor = ('"+ HargaMotor +"')"
                    + "where NoNota = ('" + NoNota + "')";
            
            conn.st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } 
        catch (SQLException e) 
        {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data tidak terupdate");
        }
    }
    
    public void hapusPembelian (TransaksiModel TM)
    {
        conn.koneksiDataBase();
        
        try 
        {
           String sql = "delete from table_pembelian where NoNota = ('"+TM.getNoNota()+"')"; 
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
