import java.util.Scanner;

public class do_while_ornegi {
    public static void main(String[] args)
     {
       Scanner scan = new Scanner(System.in);

       int sayi = scan.nextInt();
       int toplam = 0;

       // sayının basamaklarını toplayan kod.
      do{
        toplam += sayi % 10 ; // sayıya 10 ile kalanını ekle
        sayi = sayi / 10;

        System.out.println("Toplam" + toplam + "sayı =" + sayi);
        
      }
      while(sayi > 0);
      System.out.println("Toplam" + toplam);
     }
}
