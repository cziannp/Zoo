public class Feeder extends Employee{

 private boolean hasFood;
 private String animal;

 public Feeder(int salary, String name, int directReports, boolean hasFood, String animal) {
     this.salary = salary;
     this.name = name;
     this.position = "Feeder";
     this.hasFood = hasFood;
     this.animal = animal;
 }

 public Feeder(boolean hasFood) {
     this.hasFood = hasFood;
 }

 public String toString() {
     return this.name + " is a " + this.position + " for " + this.animal + ".";
 }


}
