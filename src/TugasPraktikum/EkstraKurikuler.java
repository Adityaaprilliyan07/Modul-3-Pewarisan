/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Asus
 */
public class EkstraKurikuler {
    private String hari = "Senin";
    private String Ekstra = "\n     - Bolla Volly"
                          + "\n     - Basket";
    
    protected void identitas(){
        System.out.println("================================================");
        System.out.println("-----Aditya Aprilliyan Putra / X RPL 5 / 02-----");
        System.out.println("================================================");
    }
    protected void judul(){
        System.out.println("\n<> Jadwal Ekstra Kurikuler SMK Telkom Malang <>");
    }
    public void info (){
        System.out.println(" * Hari "+hari+" : "+Ekstra);
    }
        
    
    
}
