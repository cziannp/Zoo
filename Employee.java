public class Employee {
  //TODO: create employee class variables
  protected String name;
  protected String position;
  protected int age;
  protected boolean sleeping;
  protected boolean hungry;
  protected int salary;


  //TODO: create constructors
  public Employee(String name, String position, int age, int salary, boolean sleeping, boolean hungry) {
    this.name = name;
    this.position = position;
    this.age = age;
    this.salary = salary;
    this.sleeping = sleeping;
    this.hungry = hungry;
  }

  public Employee() {
    this.name = "Bobby";
    this.position = "Manager";
    this.age = 56;
    this.sleeping = false;
    this.hungry = true;
  }

  //TODO: create getters and setters
  public String getName() {
    return name;
  }
  public String getPosition() {
    return position;
  }
  public int getAge() {
    return age;
  }


  //TODO: any other methods?
  public void setSleeping(boolean sleeping) {
    this.sleeping = sleeping;
  }
  public void printData() {
    
  }
  public String breakTime() {
    if (hungry) {
      return "I'm hungry, time for a break.";
    } 
    else {
      return "It's not time for a break just yet.";
    }
  }


  //TODO: create main method test
  public static void Main(String[] args) {
    Employee bob = new Employee();
    bob.printData();
    bob.setSleeping(true);
    System.out.println(bob.breakTime());
  }


}

//EOC: get out development logs, what did you learn? what did you build? what needs to be done?
//Day two will be building basic functionality of a zoo
