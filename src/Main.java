import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static Antrian antrian = new Antrian();
    static QueueTeller queueTeller = new QueueTeller();
    static QueueCs queueCs = new QueueCs();

    static String menu1 = "Buka Rekening Baru";
    static String menu2 = "Penutupan Rekening";
    static String menu3 = "Setor Tunai";
    static String menu4 = "Transfer";
    static String menu5 = "Pembayaran tagihan";
    static String menu6 = "Ubah PIN";

    static int noCs = 1;
    static int noTeller = 1;

    public static void main(String[] args) {

        System.out.println("SELAMAT DATANG \nPilih Layanan: ");
        System.out.println("1. " + menu1 + " \n" +
                "2. " +menu2+ " \n" +
                "3. " +menu3+ " \n" +
                "4. " +menu4+ " \n" +
                "5. "+menu5+" \n" +
                "6. " + menu6 +" \n" +
                "7. Admin CS \n" +
                "8. Admin Teller");

        menu();
    }

    private static String getDate(){
        DateFormat newDate = new SimpleDateFormat("dd/MM/yyy H:mm:ss");
        Date date = new Date();
        return newDate.format(date);
    }

    private static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("---> ");

        int menu = scanner.nextInt();

        if (menu == 1 || menu == 2){
            switch (menu){
                case 1:
                    queueCs.enqueueCs(menu1, getDate(), noCs);
                    antrian.printTicketCs(menu1);
                    break;

                case 2:
                    queueCs.enqueueCs(menu2, getDate(), noCs);
                    antrian.printTicketCs(menu2);
                    break;
            }

            noCs++;

        }else if (menu >= 3 && menu <= 6){
            switch (menu){
                case 3:
                    queueTeller.enqueueTeller(menu3, getDate(), noTeller);
                    antrian.printTicketTeller(menu3);
                    break;

                case 4:
                    queueTeller.enqueueTeller(menu4, getDate(), noTeller);
                    antrian.printTicketTeller(menu4);
                    break;

                case 5:
                    queueTeller.enqueueTeller(menu5, getDate(), noTeller);
                    antrian.printTicketTeller(menu5);
                    break;

                case 6:
                    queueTeller.enqueueTeller(menu6, getDate(), noTeller);
                    antrian.printTicketTeller(menu6);
                    break;
            }
            noTeller++;

        }else if(menu == 7 || menu == 8){
            switch (menu){
                case 7:
                    queueCs.displayCs();
                    queueCs.dequeueCs();
                    break;

                case 8:
                    queueTeller.displayTeller();
                    queueTeller.dequeueTeller();
                    break;
            }
        }else {
            System.out.println("Menu tidak ditemukan!!");
        }

        Main.main(null);
    }
}
