import java.text.SimpleDateFormat;
import java.util.Date;

class MenuTampilan extends Tampilan{

    @Override
    public void menu() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String datenow = formatter.format(date);
        System.out.println("\n==============================================================");
        System.out.println("TANGGAL HARI INI : " + datenow);

        System.out.println("SELAMAT DATANG DI APLIKASI MANAGEMENT WAKTU DAN KEGIATAN\n");
        System.out.println("KEGIATAN ANDA HARI INI : ");//Akan menampilkan list kegiatan yang dimiliki untuk tanggal dijalankan applikasi
        System.out.println("1. TAMBAH KEGIATAN");
        System.out.println("2. TAMPILKAN SEMUA KEGIATAN");
        System.out.println("3. UPDATE KEGIATAN");
        System.out.println("4. HAPUS KEGIATAN");
        System.out.println("0. SAVE DAN KELUAR APLIKASI");
    }
}
