/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinjam.ruangan;

import javax.swing.JOptionPane;

/**
 *
 * @author LUTFIA FIA
 */
public class ruang
{
   
    public String namaRuang;
    public int harga;
    
    
    public ruang(String namaRuang, int harga)
    {
       
        this.namaRuang = namaRuang;
        this.harga = harga;    
    }
    
    //method setter getter
    
    public String getNamaRuang()
    {
        return namaRuang;
    }
    public void setNamaRuang(String namaRuang)
    {
        namaRuang = namaRuang;
    }
    
    public int getHarga()
    {
        return harga;
    }
    public void setHarga(int harga)
    {
        harga = harga;
    }

    private String getnamaRuangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Overloading
    public void berhasil()
    {
        JOptionPane.showMessageDialog(null, "Penyewaan berhasil, silahkan melakukan pembayaran");
    }
    
    //@Overload
    public void berhasil(String kata)
    {
        System.out.println(kata);
    }
    
     ruang(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}