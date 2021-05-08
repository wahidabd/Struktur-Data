import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Antrian {
    private int cs1 = 0;
    private int cs2 = 0;

    private int teller1 = 0;
    private int teller2 = 0;

    private String getDate(){
        DateFormat newDate = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
        Date date = new Date();
        return newDate.format(date);
    }

    public void printTicketTeller(String keperluan){
        int nomor;
        int teller;

        if (teller1 <= teller2){
            teller1++;
            nomor = teller1;
            teller = 1;
        }else{
            teller2++;
            nomor = teller2;
            teller = 2;
        }

        System.out.println("=====================================");
        System.out.println("| Selamat Datang \n| Nomor Antrian Anda: " + nomor);
        System.out.println("| Teller No. " + teller);
        System.out.println("| keperluan: " + keperluan);
        System.out.println("| Tanggal: " + getDate());
        System.out.println("=====================================");
        System.out.println();
    }

    public void printTicketCs(String keperluan){
        int nomor;
        int meja;

        if (cs1 <= cs2){
            cs1++;
            nomor = cs1;
            meja = 1;
        }else{
            cs2++;
            nomor = cs2;
            meja = 2;
        }

        System.out.println("=====================================");
        System.out.println("| Selamat Datang \n| Nomor Antrian Anda: " + nomor);
        System.out.println("| Meja No. " + meja);
        System.out.println("| Keperluan: " + keperluan);
        System.out.println("| Tanggal: " + getDate());
        System.out.println("=====================================");
        System.out.println();
    }
}
