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
public class Kamis extends Rabu {
    private String hari = "Kamis";
    private String Ekstra = "\n     -Futsal"
                          + "\n     -Metic";
    
    protected void Kamis(){
        super.Rabu();
        System.out.println(" * Hari "+hari+" : "+Ekstra);
}

}