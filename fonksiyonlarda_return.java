public class fonksiyonlarda_return {
  // fonksiyon içerisinde return kullandığımız için void ibaresini
  // kaldırıp int ibaresini ekliyoruz.
    public static int ucilecarp(int a){
      return a*3;
    }
    public static int ikiiletopla(int a){
      return a+3;
    }
    public static int dortilecıkart(int a){
      return a-4;
    }
    public static void main(String[] args)
     {
      dortilecıkart(dortilecıkart(ucilecarp(4)));
     }
}
