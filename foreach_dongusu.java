import java.util.Scanner;
import java.util.ArrayList;

public class foreach_dongusu {
    public static void main(String[] args){
   
      ArrayList<String> groups = new ArrayList<String>();

      groups.add("Metallica");
      groups.add("Iron Maiden");
      groups.add("Guns'n Roses");
      groups.add("Black Sabbath");

      int[] arr = {10,20,30,40,50,60};

      // foreach döngüsü
      for(String s:groups){
        System.out.println("Eleman: " + s);
      }

      for(int i:arr){
        System.out.println("Eleman: " + i);
      }

    }     
}
