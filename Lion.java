public class Lion extends Animal {

  public static void lionIntro() {
    System.out.println("Welcome to the lion exhibit! Of course we do have rules, so please do follow them. We want to be respectful to the animals!");
  }
  
  public Lion(String name, int age, String habitat, boolean hungry) {
    this.name = name;
    this.age = age;
    this.species = "Lion";
    this.habitat = habitat;
    this.hungry = hungry;
  }

  public Lion() {
    this.name = "Simba";
    this.age = 4;
    this.habitat = "Savanna";
    this.hungry = true;
  }

  public String makeNoise() {
    return "Roar";
  }

  public static void Main(String[] args) {
    Lion simba = new Lion();
    System.out.println(simba);
    simba.makeNoise();
  }
  
}
