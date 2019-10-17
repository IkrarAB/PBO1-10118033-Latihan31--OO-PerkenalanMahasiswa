
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan perkenalan
 *                     Diri
 *  
 */

package pbo1.pkg10118033.latihan31;

public class PBO110118033Latihan31 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        mahasiswa1.nim = "10110269";
        mahasiswa1.perkenalkanDiri();
        System.out.println();
        mahasiswa2.nama = "Indra Tiola";
        mahasiswa2.nim = "10110270";
        mahasiswa2.perkenalkanDiri();
        System.out.println();
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.nim = "10110271";
        mahasiswa3.perkenalkanDiri();
        System.out.println();
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        mahasiswa4.nim = "10110269";
        mahasiswa4.perkenalkanDiri();
        System.out.println();
        System.out.println("(Developed By : Ikrar AB)");
    }
}
