import java.util.Scanner;

public class switch_case {
    public static void main(String[] args)
     {
      System.out.println("Bir sayı giriniz: ");
       Scanner scan = new Scanner(System.in);
       int sayi = scan.nextInt();

       // yalnızca sağladığı koşula (satıra) girer ve berea komutuyla
       // döngüden çıkar.
       switch(sayi)
       {
         case 1:
             System.out.println("Bir");
             break;
         case 2:
             System.out.println("İki");
             break;
         case 3:
             System.out.println("Üç");
             break;
         case 4:
             System.out.println("Dört");
             break;
         default:
             System.out.println("Geçersiz sayı.");
       }
     }
}
