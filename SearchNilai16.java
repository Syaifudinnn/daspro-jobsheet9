import java.util.Scanner;

public class SearchNilai16 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int hasil = 0;

        //input jumlah nilai yg akan diinput
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlahNilai = input.nextInt();

        //deklarasi array berdasarkan jumlah yg diinput
        int[] arrNilai = new int[jumlahNilai];

        //perulangan untuk menginput nilai
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + "\t : ");
            arrNilai[i] = input.nextInt();
        } 
        
        //input nilai yg ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = input.nextInt();

        //logic untuk mencari nilai
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }

        //output
        System.out.println("");
        if (hasil != 0) {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        } 
        else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }

    }

}
