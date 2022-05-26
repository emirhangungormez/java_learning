import java.util.ArrayList;

public class dizilistesi {
    public static void main(String[] args){
     
      ArrayList<String> groups = new ArrayList<String>();

      groups.add("Metallica");
      groups.add("Iron Maiden");
      groups.add("Guns'n Roses");
      groups.add("Black Sabbath");

      // System.out.println("0. indeks: " + groups.get(0));
      // System.out.println("2. indeks: " + groups.get(2));

      // groups.remove("Iron Maiden");
    
      System.out.println(groups.indexOf("Metallica"));
      
      for (int i = 0; i<groups.size(); i++) {
        System.out.println("Eleman: " + groups.get(i));
      }
    }
}
