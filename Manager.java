public class Manager extends Employee{

 private int directReports;

 public Manager(int salary, String name, int directReports) {
     this.salary = salary;
     this.name = name;
     this.position = "Manager";
     this.directReports = directReports;
 }

 public Manager(int directReports) {
     this.directReports = directReports;
 }

 public String toString() {
     return this.name + " has " + this.directReports + " people working for them.";
 }

 public static void Main(String[] args) {
     Manager phil = new Manager(200000, "Phil", 5);
     System.out.println(phil);
 }
     
}
