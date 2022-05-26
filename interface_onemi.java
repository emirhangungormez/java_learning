public interface IDatabase {
  void add();
  void delete();
  void get();
  void update();
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

public class MysqlDatabase implements IDatabase {

  @Override
  public void add() {
    System.out.println("Mysql Ekleme");  
  }

  @Override
  public void delete() {
    System.out.println("Mysql Silme");  
  }

  @Override
  public void get() {
    System.out.println("Mysql Elde Etme");
  }

  @Override
  public void update() {
    System.out.println("Mysql Güncelleme");
  }
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

public class MongoDatabase implements IDatabase {
  @Override
  public void add() {
    System.out.println("MongoDb Ekleme");
  }

  @Override
  public void delete() {
    System.out.println("MongoDb Silme");
  }

  @Override
  public void get() {
    System.out.println("MongoDb Elde Etme");
  }

  @Override
  public void update() {
    System.out.println("MongoDb Güncelleme");
  }
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

class DatabaseManager {
  public void AddDatabase(IDatabase database) {
    database.add();
  }
  public void UpdateDatabase(IDatabase database) {
    database.update();
  }
  public void GetDatabase(IDatabase database) {
    database.get();
  }
  public void DeleteDatabase(IDatabase database) {
    database.delete();
  }
}

public class interface_onemi { 
  public static void main(String[] args){
      DatabaseManager manager = new DatabaseManager();

      manager.AddDatabase(new MongoDatabase());
  }
}
