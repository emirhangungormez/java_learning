import java.util.Scanner;

public class break_kullanimi{
    public static void main(String[] args){
      // break = döngüyü sonlandırır.
      // continue = altındaki işlemleri yapmadan döngünün en başına geri döner.


      // break kullanımı
      while(true){
        Scanner scan = new Scanner(System.in);
        String s;
        int i = 0;

        System.out.println("Bir karakter girinz.");
        s = scan.nextLine();

        if (s.equals("q")) // s'nin q'ya eşit olup olmadığını kontrol ediyo
        {
          System.out.println("Programdan çıkılıyor...");
          break;
        }
      }
    }  
      
}
