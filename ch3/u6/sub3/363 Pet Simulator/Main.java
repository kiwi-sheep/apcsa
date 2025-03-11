// Assignment Name: 'Activity 3.6.3 - Pet Simulator'

public class Main {
    public static void main(String[] args) {
        // Create pet array
        Pet[] pets = new Pet[10];
        
        // 2 cats and 2 dogs
        pets[0] = new Pet("Jorge", Pet.CAT);
        pets[1] = new Pet("Choki", Pet.CAT);
        pets[2] = new Pet("Juan", Pet.DOG);
        pets[3] = new Pet("Max", Pet.DOG);
        
        // Feed all pets
        for (int i = 0; i < 4; i++) {
            pets[i].feed();
        }
        
        // Set myself as owner
        String myName = "A. Villa"; // literally me
        for (int i = 0; i < 4; i++) {
            pets[i].setOwner(myName);
        }
        
        // Dog make noise and walk (real)
        for (int i = 0; i < 4; i++) {
            if (pets[i].getType() == Pet.DOG) {
                pets[i].makeNoise();
                pets[i].walk();
            }
        }
        
        // Cats make noise (meow moment)
        for (int i = 0; i < 4; i++) {
            if (pets[i].getType() == Pet.CAT) {
                pets[i].makeNoise();
            }
        }
        
        // Give treats to all pets (yum)
        for (int i = 0; i < 4; i++) {
            pets[i].giveTreat();
        }
        
        // Groom cats
        for (int i = 0; i < 4; i++) {
            if (pets[i].getType() == Pet.CAT) {
                pets[i].groom();
            }
        }
        
        // Play with all pets (oh boy, oh boy!)
        for (int i = 0; i < 4; i++) {
            pets[i].play();
        }
        
        // All pets nap and get fed (best bit right here)
        for (int i = 0; i < 4; i++) {
            pets[i].sleep();
            pets[i].feed();
        }
        
        // Display all pets' status
        System.out.println("--- MY PETS ---");
        for (int i = 0; i < 4; i++) {
            System.out.println(pets[i]);
        }
        
        // Create pets for friend
        String friendName = "Sigma"; // Don't judge me
        pets[4] = new Pet("Alpha", Pet.CAT);
        pets[5] = new Pet("Rocko", Pet.DOG);
        pets[4].setOwner(friendName);
        pets[5].setOwner(friendName);
        
        // Display all pets' status again
        System.out.println("--- MY PETS ---");
        for (int i = 0; i < 6; i++) {
            System.out.println(pets[i]);
        }
    }
}
class Pet{
  public static final int CAT = 1;
  public static final int DOG = 2;
  
  private String name;
  private int type;
  private String owner;
  
  private int energy;
  private int happy;
  
  /*---------- constructors ----------*/
  public Pet(String name, int type)
  {
    this.name = name;
    this.type = type;

    energy = 25;
    happy = 20;
  }
  
  /*---------- accessors ----------*/
  public String getName()
  {
    return name;
  }
  
  public int getType()
  {
    return type;
  }
  
  public String getOwner()
  {
    return owner;
  }
  
  public String toString()
  {
    String state = name + ", " + owner + "'s ";
    if (type == CAT)
      state += "cat: ";
    else if (type == DOG)
      state += "dog: ";
    state += "Happiness is " + happy + " and energy is " + energy;
    return state;
  }
  
  /*---------- mutators ----------*/
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setOwner(String owner)
  {
    this.owner = owner;
  }
  /*---------- value changing methods: mutators ----------*/
  /*----------    that change happy or energy   ----------*/
  public void feed()
  {
    energy += 10;
    happy += 5;
    System.out.println(name + " says: Mealtime!");
  }

  public void makeNoise()
  {
    energy--;
    happy -= 5;
    if (type == CAT)
      System.out.println(name + " says: Meow!");
    else
      System.out.println(name + " says: Arf arf!");
  }
  
  public void walk()
  {
    if (type == DOG) 
    {
      happy += 10;
      energy -= 15;
      System.out.println(name + " says: Hooray! A walk!");
    }
  }
  
  public void giveTreat()
  {
    energy += 3;
    happy += 5;
    System.out.println(name + " says: Yum, a treat!");
  }

  public void groom()
  {
    energy -= 2;
    if (type == CAT)
    {
      happy += 5;
      System.out.println(name + " says: Purrrrrrrrrrrr!");
    }
    else if (type == DOG)
    {
      happy -= 2;
    }
  }
  public void play()
  {
    energy -= 5;
    happy += 5;
    System.out.println(name + " says: Oh boy! I get to play!");
  }
  public void sleep()
  {
    energy += 5;
    System.out.println(name + " says: zzzzzzzzzzzzzzzzzzz");
  }  
}