public class employee {
    private String name;
    private String department;
    private int salary;

    public employee (String name, String department, int id){

        super();
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void getName(String name) {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getDepartment(String separtment) {
        return department;
    }
    public void setDepartment(String separtment) {
        this.department = department;
    }

    public void getSalary(int Salary) {
        return salary;
    }
    public void setSalary(int Salary) {
        this.salary = salary;
    }

    public void showInfos(){
        System.out.println("Bilgiler...");
        System.out.println("İsim: " + this.name);
        System.out.println("Depertman: " + this.department);
        System.out.println("Maaş: " + this.salary);
    }
}

/* yukarıdaki class ayrı bir dosyada tanımlanmalıdır, konunun anlaşılması için aynı dosya içerisinde
yer verilmiştir.*/

public class manager extends employee { //employee class'ının özelliklerini içerir.
    private int um_of_employees;


    public manager(String name, String department, int salary, int num_of_employees) {
        super(name, department, salary);
        this.num_of_employees = num_of_employees;
    }  
    public void raiseSalary(int amount) {
        System.out.println("Çalışanlara " + amount + "tl zam yapıldı.");
    }

    @Override // fonksiyonu yeniden şekillendirmemize yardımcı olur.
    public void showInfos() {
        super.showInfos();
        System.out.println("Srumlu Kişi Sayısı: " + this.num_of_employees);
    }

    @Override
    public String toString() {
        return "Manager objesi";
    }

}

/* yukarıdaki extends class ayrı bir dosyada tanımlanmalıdır, konunun anlaşılması için aynı dosya içerisinde
yer verilmiştir.*/


public class inheritance {
    public static void main(String[] args)
    {
       /* employee employee = new employee("Emir", "Bilişim", 4250);
       employee.showInfos(); */

       manager manager = new manager("Emir", "Bilişim", 4250, 10);
       manager.showInfos();
       manager.raiseSalary(100);

       // System.out.println(manager); //java otomatik olarak toString metodunu çağrırır.
    }
}
