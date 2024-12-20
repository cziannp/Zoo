public class Elephant extends Animal {
  double trunkLength;

  public static void elephantIntro() {
    System.out.println("Welcome to the elephant exhibit! In this special exhibit we allow guests to take photos with the elephants. Of course we do have rules, so please do follow them!");
  }

  public Elephant(String name, int age, String habitat, boolean hungry, double trunkLength) {
    this.name = name;
    this.age = age;
    this.species = "Elephant";
    this.habitat = habitat;
    this.hungry = hungry;
    this.trunkLength = trunkLength;
  }

  public String makeNoise() {
    return "Bvaroooomf";
  }

  public static void main(String[] args) {
    Elephant trunky = new Elephant("Trunky", 30, "Savanna", true, 9.6);
    System.out.println(trunky);
    trunky.makeNoise();
  }

}
