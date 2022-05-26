import org.omg.PortableServer.IdAssignmentPolicy;

public interface IDatabase {

  void Log();

}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

public class Student implements IDatabase {

  @Override
  public void Log() {
    System.out.println("Öğrenci eklendi...");
  }
}
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.

public class Customer implements IDatabase {

  @Override
  public void Log() {
    System.out.println("Müşteri eklendi...");
  }
  }
// ayrı bir kod dosyasında yer almalıdır, konunun anlaşılması için aynı dosya
// içerisinde yer almaktadır.


public class interfaces { 
    public static void main(String[] args){
       // IDatabase database = new IDatabase(); // interface'lerde obje oluşturamayız.

       IDatabase database1 = new Customer();
       IDatabase database2 = new Student();

       database1.Log();
       database2.Log();;

       /* Customer customer = new Customer();
       Student student = new Student();
       student.Log();
       customer.Log(); */

    }
}
