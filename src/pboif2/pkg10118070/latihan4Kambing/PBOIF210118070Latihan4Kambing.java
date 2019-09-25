/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan4Kambing;

/**
 *
 * @author
 * NAMA     : Aufa Ilyasha
 * Kelas    : IF2
 * NIM      : 10118070
 */
public class PBOIF210118070Latihan4Kambing {
    
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        
        System.out.println("Jumlah Kambing setelah ditambah: " +
                         jumlahKambing);
    }

    
    public static void main(String[] args) {
        PBOIF210118070Latihan4Kambing kambingJantan = new PBOIF210118070Latihan4Kambing();
        kambingJantan.tambahKambing();        
    }
    
}
