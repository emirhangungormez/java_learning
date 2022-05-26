import java.util.Scanner;

public class diziler {
    public static void main(String[] args){
      //                0  1  2  3  4
      // int [] arr = {10,20,30,40,50};

      int [] arr = new int [5];
      arr[0] = 1;
      arr[1] = 2;
      arr[2] = 3;
      arr[3] = 4;
      arr[4] = 5;
      System.out.println("Arr'nin birinci elemanı: " + arr[0]);

      int [] arr1 = {10,20,30,40,50};
      for (int i = 0; i < arr1.length; i++){ //length ile dizinin boyutunu alıyoruz.
        System.out.println("Eleman: " + arr1[i]);
      }

      System.out.println("Dizi elemanlarını giriniz: ");
      Scanner scanner = new Scanner(System.in);
      int[] arr2 = new int[5];

      for(int i = 0; i < arr2.length; i++){
        arr2[i] = scanner.nextInt();
      }

      System.out.println("Dizi elemanları:");
      for (int i = 0; i < arr2.length; i++){
        System.out.println("Eleman: " + arr2[i]);
      }
      


     }
}
