import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MenuTampilan menu = new MenuTampilan();
        AksiJadwal aksi = new AksiJadwal();
        Scanner in = new Scanner(System.in);
        int pilih1 = 10;
        LinkedList<String> list = new LinkedList<>();
        try {
            File filein = new File("JadwalFile.txt");
            Scanner myReader = new Scanner(filein);
            System.out.println("LOADING...");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("DATA BELUM TERSIMPAN");
        }
        while (pilih1 != 0) {
            menu.menu();

            try{
                System.out.println("MASUKKAN INPUT ANDA : ");
                pilih1 = in.nextInt();
            } catch (Exception ignored){
                System.out.println("INPUT SALAH");
            }

            System.out.println();
            if (pilih1 == 1) {
                aksi.tambah(list);
            } else if (pilih1 == 2) {
                aksi.tampil(list);
            } else if (pilih1 == 3) {
                aksi.update(list);
            } else if (pilih1 == 4) {
                aksi.hapus(list);
            } else if (pilih1 == 0) {
               aksi.keluar(list);
            } else {
                System.out.println("INPUT ANDA SALAH");
            }
        }
    }
}