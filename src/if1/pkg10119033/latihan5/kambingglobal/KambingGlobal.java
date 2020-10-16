/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan5.kambingglobal;


/**
 *
 * @author 
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi jenis variabel instance yang dideklarasikan dalam class 
 * atau secara global, namun diluar method / blok.
 */
public class KambingGlobal {
    int jumlahKambing = 88;
    /**
     * @param args the command line arguments
     */
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing += 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada pada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
