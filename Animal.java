public class Animal {

    //what information an animal needs
    protected String species;
    protected String name;
    protected boolean hungry;
    protected String habitat;
    protected int age;

    //question: do you need to fill in all instance variables for a class to work? can you only fill one?

    public Animal(String species, String name, int age, String habitat, boolean hungry){
        this.species = species;
        this.name = name;
        this.hungry = hungry;
        this.habitat = habitat;
        this.age = age;
    }

    public Animal(){ //class question: how can I be as lazy as possible right no
        this.species = "giraffe";
        this.name = "geoffrey";
        this.hungry = true; //maybe this leads to future gameification?
        this.age = 12;
    }

    //if you wanted to research an animal, what would you want to be able to look up?

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }

    //added after the fact - why isHungry instead of getHungry? (quick note about naming conventions)
    public boolean isHungry() {
        return hungry;
    }

    public String toString() {
        return "This is a " + species + " named " + name + " who is "+ age + " years old";
    }

    //what are aspects of this animal that should/could be changeable?
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String makeNoise(){
        if (hungry){
            return "*stomach growls*";
        } else {
            return "*snores*";
        }
    }


    //discussion question: where are we putting our main method?
    //can put here just for now for testing, or is there time to make a zoo?
    //going forward, you will have classes that control the flow of the entire program. Often
    //these contain the primary main method, but it's a good idea to have a main in all of your
    //classes to more easily/immediately test local behaviors.

    public static void main(String[] args) {
        Animal geoff = new Animal();
        System.out.println(geoff);
        System.out.println("hi");

    }

}
//at end: give out code
