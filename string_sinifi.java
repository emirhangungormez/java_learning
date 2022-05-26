public class string_sinifi {
    public static void main(String[] args)
     {

      // 2 farklı string tanımlama metodu:

      // s0 ve s1 bellekte aynı yeri göstermektedir.
      String s0 = "Emirhan";
      String s1 = "Emirhan";

      // s2 ise bellekte her daim ayrı bir yer oluşturacaktır.
      String s2 = new String("Emirhan");

      System.out.println(s2.length());

      System.out.println("0. indeks: " + s2.charAt(0)); // 'E' karakterini yazdırır.
      System.out.println("0. indeks: " + s2.charAt(5));
      System.out.println("0. indeks: " + s2.charAt(s2.length()-1)); // son karakteri yazdırır.

      System.out.println(s2.startsWith("Em")); // 'Em' ile başlıyorsa eğer; True

      System.out.println(s2.endsWith("an")); // 'an' ile bitiyorsa; True

       
     }
}
