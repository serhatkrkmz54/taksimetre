import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double km;
        double kmBaslangic = 10, toplam, perKm=2.20;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yapılan KM'yi yazınız: ");
        km=girdi.nextDouble();
        toplam= (perKm*km);
        toplam+=kmBaslangic;
        if(toplam<=20){
            System.out.print("Ödeyeceğiniz tutar " +toplam+ " Tl ama 20 TL altı olduğu için minimum 20 Tl ödemelisiniz.");
        }
        else {
            System.out.print("Toplam Ödeyeceğiniz Tutar: "+toplam);
        }
    }
}
