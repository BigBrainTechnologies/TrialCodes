package basicPrograms;


class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
        System.out.println(this);
    }
    
    void wagTail() {
    	  System.out.println("Wagging tail");
    }
}

public class DownCastingDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        System.out.println("I am printing an object");
        System.out.println( myAnimal);
     
     
        if (myAnimal instanceof Dog) {
          // Downcasting
        	Dog myDog = (Dog) myAnimal;
            myDog.eat(); // Accessing the eat() method of Dog (subclass)
            myDog.wagTail();
            myDog.bark(); // Accessing the bark() method specific to Dog
        }
        //TODO
        //Handle for another type of animal 
        //say Birds chirp
        
        
    }
}
