public class Car {
  //fields (properties)
  private String color;
  public String model;
  public double engine;
  public int doors;

  //constructor
  public Car(String color, String model, double engine, int doors){
    this.color = color;
    this.model = model;
    this.engine = engine;
    this.doors = doors;
  }

  //method
  public void showInfos() {
    System.out.println("Arabanın kapı sayısı: " + this.doors);
    System. out.println("Arabanın modeli: " + this.color);
    System.out.println("Arabanın motor hacmi: " + this.model);
    System.out.println("Arabanın kapı sayısı: " + this.engine);
  }
}

/* yukarıdaki class ayrı bir dosyada tanımlanmalıdır, konunun anlaşılması için aynı dosya içerisinde
yer verilmiştir.*/

public class constructor {
  public static void main(String[] args) {
    Car car1 = new Car("Siyah","Peugeut 208", 1.0 , 4);

    car1.showInfos();
  }
}
