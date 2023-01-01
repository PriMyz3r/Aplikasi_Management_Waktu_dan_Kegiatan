import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;   // Import the FileWriter class

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String datenow = formatter.format(date);
        System.out.println("TANGGAL : "+datenow);

        System.out.println("SELAMAT DATANG DI APLIKASI MANAGEMENT WAKTU DAN KEGIATAN\n");
        System.out.println("KEGIATAN ANDA HARI INI : ");//Akan menampilkan list kegiatan yang dimiliki untuk tanggal dijalankan applikasi
        System.out.println("1. TAMBAH KEGIATAN");
        System.out.println("2. TAMPILKAN SEMUA KEGIATAN");
        System.out.println("3. UPDATE KEGIATAN");
        System.out.println("4. HAPUS KEGIATAN");
        System.out.println("0. KELUAR APLIKASI");

        System.out.println("MASUKKAN INPUT ANDA : ");
//        System.out.println("Hello world!");
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
//        String str = formatter.format(date);
//        System.out.println("Current date: "+str);
//        try {
//            File myObj = new File("filename.txt");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        try {
//            FileWriter myWriter = new FileWriter("filename.txt");
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.write("\nCurrent date: "+str);
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
    }
}