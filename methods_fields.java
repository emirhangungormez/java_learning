
public class Car {
  //fields (properties)
  private String color;
  public String model;
  public double engine;
  public int doors;
  public String getColor;

  //methods
  public void setColor (String color) {
    this.color = color; //fields objemizin color özelliğine color atıyoruz.
  }
  public String getColor(){
    return this.color;
  }

  public void start(){
    System.out.println("Araba Çalıştı...");
  }
  public void stop(){
    System.out.println("Araba Durdu...");
  }
}

/* yukarıdaki class ayrı bir dosyada tanımlanmalıdır, konunun anlaşılması için aynı dosya içerisinde
yer verilmiştir.*/



public class methods_fields {
  public static void main(String[] args) {
    Car car1 = new Car();

    car1.setColor("Gümüş"); //dolaylı yoldan erişim

    /* car1.model = "Peugeut 208";
    car1.engine = 1.0;
    car1.doors = 4; */

    System.out.println("Arabanın rengi: " + car1.getColor);

    /* System. out.println("Arabanın modeli: " + car1.model);
    System.out.println("Arabanın motor hacmi: " + car1.engine);
    System.out.println("Arabanın kapı sayısı: " + car1.doors); */

    car1.start();
    car1.stop();
  }
}
