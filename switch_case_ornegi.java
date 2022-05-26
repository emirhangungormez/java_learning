import java.util.Scanner;

public class switch_case_ornegi {
    public static void main(String[] args)
     {
      System.out.println("Bir sayı giriniz: ");
       Scanner scan = new Scanner(System.in);

       int sayi = scan.nextInt();
       int bakiye = 1000;
       int islem;

       System.out.println("1: Bakiye Görüntüle");
       System.out.println("2: Para Yatırma");
       System.out.println("3: Para Çekme");
       System.out.println("4: Sistemden Çıkış");

       islem = scan.nextInt();

       switch(sayi)
       {
         case 1:
             System.out.println("Bakiyeniz" + bakiye + "TL'dir.");
             break;
         case 2:
             System.out.println("Ne kadar yatıracaksınız?");
             int miktar = scan.nextInt();
             bakiye = bakiye + miktar;
             System.out.println("Bakiyeniz" + bakiye + "TL'dir.");
             break;
         case 3:
         System.out.println("Ne kadar çekeceksiniz?");
             int miktar2 = scan.nextInt();
             bakiye = bakiye - miktar2;
         System.out.println("Bakiyeniz" + bakiye + "TL'dir.");
             break;
         case 4:
             System.out.println("Sistemden Çıkılıyor...");
             break;
         default:
             System.out.println("Geçersiz işlem.");
             break;
       }
     }
}
