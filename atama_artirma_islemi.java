public class atama_artirma_islemi {
    public static void main(String[] args)
     {
       int a = 10;
       int b = 20;

       a = a + 3;
       a += 3; // a = a + 3; ile aynıdır.
       a++; // a = a + 3; ile aynıdır. fakat önce atama yapar, sonra artırır.
       ++a; // a = a + 3; ile aynıdır. fakat önce artırır, sonra atama yapar.
       // farkı anlamak için b'nin çıktılarını inceleyiniz.

       System.out.println("a değişkeninin değeri: " + a);

       System.out.println("b değişkeninin değeri: " + b++);
       System.out.println("b değişkeninin değeri: " + ++b);
     }
}
