import java.util.Scanner;

public class if_ornegi {
    public static void main(String[] args)
     {
       // kullanıcı adı girişi
       String kullaniciadi = "Emirhan";
       String sifre = "2023";

       Scanner scan = new Scanner(System.in);

       System.out.print("Kullanıcı adını giriniz: ");
       String kullanici_adi = scan.nextLine();

       System.out.print("Parolayı giriniz: ");
       String parola = scan.nextLine();


       /* string değerlerinin birbirleriyle olan doğruluğunu kontrol etmek
      için equals fonksiyonunu kullanıyoruz. */
       if( !(kullaniciadi.equals(kullanici_adi)) && !(parola.equals(sifre)))
       {
         System.out.println("Kullanıcı adı ve parola yanlış.");
       }
       else if( (kullaniciadi.equals(kullanici_adi)) && !(parola.equals(sifre)))
       {
        System.out.println("Parola yanlış.");
       }
       else if( !(kullaniciadi.equals(kullanici_adi)) && (parola.equals(sifre)))
       {
        System.out.println("Kullanıcı adı yanlış.");
       }
       else
       {
        System.out.println("Giriş başarılı.");
       }
     }
}
