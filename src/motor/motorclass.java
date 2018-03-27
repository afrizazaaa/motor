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
public class motorclass {
    String merek;
    Integer harga;
    String jenis;
    String tipe;
    String warna;
    
    void cetakInfo(){
        System.out.println("merek motor : "+merek);
        System.out.println("harga motor : "+harga);
        System.out.println("jenis motor : "+jenis);
        System.out.println("tipe motor : "+tipe);
        System.out.println("warna motor : "+warna);
        
    }
}
