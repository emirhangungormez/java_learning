public class do_while_dongusu {
    public static void main(String[] args)
     {
      int i = 10;

      // do'nun while'dan tek farkı en az bir kere giriş yapıyor.
      // true ya da false olmasına dikkat etmiyor (ilk seferde)
      do{
        System.out.println("i = " + i);
        i--; // sonsuz olmaması için i'yi artırmalıyız.
      }
      while(i > 0);
     }
}
