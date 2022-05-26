import java.util.Scanner;

public class fonksiyonlar {
    public static void faktoriyel(){
      Scanner scan = new Scanner(System.in);

      System.out.println("Sayı: ");

      int sayi = scan. nextInt();
      int faktoriyel = 1;

      while (sayi > 0 ) {
        faktoriyel *= faktoriyel;
        sayi--;
      }

      System.out.println("Faktoriyel: " + faktoriyel);
    }
    public static void main(String[] args)
     {
       faktoriyel(); // fonksiyon çağrısı.
     }
}
