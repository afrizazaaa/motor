/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

/**
 *
 * @author Mamed
 */
public class motoraksi {
    public static void main (String[]   args)   {
        
        
        motorclass alfa = new motorclass();
        System.out.println("motor alfa");
        alfa.merek="honda";
        alfa.harga=13000000;
        alfa.jenis="old";
        alfa.tipe="S";
        alfa.warna="merah muda";
        alfa.cetakInfo();
        
        motorclass astrea = new motorclass();
        System.out.println("motor astrea");
        astrea.merek="suzuki";
        astrea.harga=1000000;
        astrea.jenis="old";
        astrea.tipe="R";
        astrea.warna="kuning";
        astrea.cetakInfo();
        
        motorclass cbr = new motorclass();
        System.out.println("motor cbr");
        cbr.merek="honda";
        cbr.harga=20000000;
        cbr.jenis="new";
        cbr.tipe="R";
        cbr.warna="hitam";
        cbr.cetakInfo();
        
                
                
                
    }
}
