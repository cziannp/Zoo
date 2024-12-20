public class Horse extends Animal {
  boolean rideable;

  public static void horseIntro() {
    System.out.println("Welcome to the horse exhibit! In this special exhibit we allow guests to ride the horses. Of course we do have rules, so please do follow them!");
  }
  
  public Horse(String name, int age, String habitat, boolean hungry,  boolean rideable) {
    this.name = name;
    this.age = age;
    this.species = "Horse";
    this.habitat = habitat;
    this.hungry = hungry;
    this.rideable = rideable;
  }

  public Horse() {
    this.name = "Spirit";
    this.age = 2;
    this.habitat = "Arizona";
    this.hungry = false;
    this.rideable = true;
  }

  public String makeNoise() {
    return "Neigh";
  }

  public void setRideable(boolean rideable) {
    this.rideable = rideable;
  }
  
  public void rideHorse() {
    if (this.age < 2 || this.age >= 25) {
      setRideable(false);
    }
    
    if (this.rideable == true) {
      System.out.println("You are riding the horse!");
    }
    else if (this.age > 18 && this.age < 25) {
      System.out.println("You can only walk with the horse.");
    }
    else {
      System.out.println("You can't ride the horse!");
    }
  }

  public static void Main(String[] args) {
    horseIntro();
    Horse spirit = new Horse();
    System.out.println(spirit);
    spirit.makeNoise();
  }

}
