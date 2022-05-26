public abstract class AbstractDatabase {
  public void add() {
    System.out.println("Eklendi...");
  }

  public void delete(){
    System.out.println("Silindi...");
  }

  abstract void update();
  abstract void get();
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

public class MongoDatabase extends AbstractDatabase {

  @Override
  void update() {
    System.out.println("Mongo güncellendi...");
   
  }

  @Override
  void get() {
    System.out.println("Mongo verileri aldı...");
   
  }
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

public class MysqlDatabase extends AbstractDatabase {

  @Override
  void update() {
    System.out.println("Mysql güncellendi..."); 
  }

  @Override
  void get() {
    System.out.println("Mysql verileri aldı...");
  }
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.


public class abstract_class {
    public static void main(String[] args){
      AbstractDatabase abstractDatabase = new MysqlDatabase();
      AbstractDatabase abstractDatabase2 = new MongoDatabase();

      abstractDatabase.add();
      abstractDatabase2.add();
    }
}
