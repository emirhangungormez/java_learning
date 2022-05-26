import java.util.Scanner;

public class kosullu_durumlar {
    public static void main(String[] args)
     {
      /* 
       arşılaştırma operatörleri:
       a == b (eşit mi?)
       a != b (eşit değil mi?)
       a > b (a, b'den büyük mü?)
       a < b (a, b'den küçük mü?)
       a >= b (a, b'den büyük veya eşit mi?)
       a <= b (a, b'den küçük veya eşit mi?)

       && = ve anlamına gelmektedir.
       || = veya anlamına gelmektedir.
       ! = değil anlamına gelmektedir.
      */ 

      // true veya false olarak çıktı verecektir.
       System.out.println("a değişkeninin değeri: " + (4 == 5)); // false
       System.out.println("a değişkeninin değeri: " + (4 != 4)); // false
       System.out.println("a değişkeninin değeri: " + (4 < 5)); // true

       Scanner scan = new Scanner(System.in);
       System.out.print("Notu girin: ");
       int not = scan.nextInt();

       if (not>50 && not<100) // koşul sağlanırsa (true) if bloğunun içerisine girer.
       {
         System.out.println("Dersten geçtiniz.");
       }
       else if (not<50 && not>0) //
       {
        System.out.println("Kaldınız.");
       }
       else
       {
        System.out.println("Geçerli bir not giriniz.");
       }
     }
}
