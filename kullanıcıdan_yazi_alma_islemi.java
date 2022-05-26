import java.util.Scanner; //scanner'ı (yazdırma işlemini) kullanabilmek için.
public class kullanıcıdan_yazi_alma_islemi {
    public static void main(String[] args)
     {
       Scanner scan = new Scanner(System.in);
       System.out.println("Bir sayı giriniz: ");

       int a = scan.nextInt();

       System.out.println("a değişkeninin değeri: " + a);
     }
}
