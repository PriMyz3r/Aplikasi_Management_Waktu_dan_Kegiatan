import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class AksiJadwal implements Jadwal{
    @Override
    public void tambah(LinkedList<String> list) {
        Scanner in = new Scanner(System.in);
        String a1, a2, a3;
        System.out.println("MASUKKAN NAMA KEGIATAN");
        a1 = in.nextLine();
        System.out.println("MASUKKAN TANGGAL KEGIATAN ");
        a2 = in.nextLine();
        System.out.println("MASUKKAN PRIORITAS KEGIATAN ");
        a3 = in.nextLine();

        while (true) {
            System.out.println("APAKAH ANDA INGIN MENAMBAHKAN KE JADWAL ANDA (y/n)");
            System.out.println("KEGIATAN : " + a1);
            System.out.println("TANGGAL : " + a2);
            System.out.println("PRIORITAS : " + a3);
            String pilih2 = in.nextLine();
            if (pilih2.equals("y")) {
                System.out.println("MASUKKAN BERHASIL");
                list.add(a1);
                list.add(a2);
                list.add(a3);
                break;
            } else if (pilih2.equals("n")) {
                System.out.println("MASUKKAN DIBATALKAN");
                break;
            } else {
                System.out.println("INPUT ANDA SALAH, COBA LAGI");
            }
        }
    }

    @Override
    public void tampil(LinkedList<String> list) {
        if (list.size() != 0) {
            System.out.println("JADWAL ANDA : ");
            int j = 0;
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 - j + ".");
                System.out.println("KEGIATAN : " + list.get(i));
                System.out.println("TANGGAL : " + list.get(i + 1));
                System.out.println("PRIORITAS : " + list.get(i + 2));
                i += 2;
                j += 2;
            }
        } else {
            System.out.println("JADWAL ANDA KOSONG");
        }
    }

    @Override
    public void update(LinkedList<String> list) {
        Scanner in = new Scanner(System.in);
        int pilih3;
        if (list.size() != 0) {
            System.out.println("JADWAL ANDA : ");
            int j = 0;
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 - j + ".");
                System.out.println("KEGIATAN : " + list.get(i));
                System.out.println("TANGGAL : " + list.get(i + 1));
                System.out.println("PRIORITAS : " + list.get(i + 2));
                i += 2;
                j += 2;
            }

            System.out.println("KEGIATAN NOMOR BERAPA YANG INGIN ANDA UPDATE?");
            System.out.println("INPUT : ");
            pilih3 = in.nextInt();
            j = -1;
            for (int i = 1; i < list.size(); i++) {
                if (i == pilih3) {
                    String a1, a2, a3;
                    System.out.println("MASUKKAN NAMA KEGIATAN");
                    a1 = in.nextLine();
                    a1 = in.nextLine();
                    System.out.println("MASUKKAN TANGGAL KEGIATAN ");
                    a2 = in.nextLine();
                    System.out.println("MASUKKAN PRIORITAS KEGIATAN ");
                    a3 = in.nextLine();
                    while (true) {
                        System.out.println("APAKAH INPUT ANDA SUDAH BENAR? (y/n)");
                        System.out.println("KEGIATAN : " + a1);
                        System.out.println("TANGGAL : " + a2);
                        System.out.println("PRIORITAS : " + a3);
                        String pilih2 = in.nextLine();
                        if (pilih2.equals("y")) {
                            System.out.println("UPDATE BERHASIL");
                            list.set(i + j, a1);
                            list.set(i + j + 1, a2);
                            list.set(i + j + 2, a3);
                            break;
                        } else if (pilih2.equals("n")) {
                            System.out.println("UPDATE DIBATALKAN");
                            break;
                        } else {
                            System.out.println("INPUT ANDA SALAH, COBA LAGI");
                        }
                    }
                }
                j += 2;
            }
        } else {
            System.out.println("JADWAL ANDA KOSONG");
        }
    }

    @Override
    public void hapus(LinkedList<String> list) {
        Scanner in = new Scanner(System.in);
        int pilih3;
        if (list.size() != 0) {
            System.out.println("JADWAL ANDA : ");
            int j = 0;
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 - j + ".");
                System.out.println("KEGIATAN : " + list.get(i));
                System.out.println("TANGGAL : " + list.get(i + 1));
                System.out.println("PRIORITAS : " + list.get(i + 2));
                i += 2;
                j += 2;
            }

            System.out.println("KEGIATAN NOMOR BERAPA YANG INGIN ANDA HAPUS?");
            System.out.println("INPUT : ");
            pilih3 = in.nextInt();
            String pilih2 = in.nextLine();
            j = -1;
            for (int i = 1; i < list.size(); i++) {
                if (i == pilih3) {
                    while (true) {
                        System.out.println("APAKAH ANDA INGIN MENGHAPUS? (y/n)");
                        System.out.println("KEGIATAN : " + list.get(i+j));
                        System.out.println("TANGGAL : " + list.get(i+j+1));
                        System.out.println("PRIORITAS : " + list.get(i+j+2));
                        pilih2 = in.nextLine();
                        if (pilih2.equals("y")) {
                            System.out.println("HAPUS BERHASIL");
                            list.remove(i + j);
                            list.remove(i + j);
                            list.remove(i + j);
                            break;
                        } else if (pilih2.equals("n")) {
                            System.out.println("HAPUS DIBATALKAN");
                            break;
                        } else {
                            System.out.println("INPUT ANDA SALAH, COBA LAGI");
                        }
                    }
                }
                j += 2;
            }
        } else {
            System.out.println("JADWAL ANDA KOSONG");
        }
    }

    @Override
    public void keluar(LinkedList<String> list) {
        try {
            File file = new File("JadwalFile.txt");
            if (file.createNewFile()) {
                System.out.println("SAVE FILE: " + file.getName());
            } else {
                System.out.println("FILE SUDAH ADA");
                System.out.println("OVERWRITE FILE");
            }
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("JadwalFile.txt");
            for (int i = 0; i < list.size(); i++) {
                myWriter.write(list.get(i) + "\n");
                myWriter.write(list.get(i + 1) + "\n");
                myWriter.write(list.get(i + 2) + "\n");
                i += 2;
            }
            myWriter.close();
            System.out.println("SAVE BERHASIL");
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
        System.out.println("KELUAR APLIKASI...");
    }
}
