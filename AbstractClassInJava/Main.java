package AbstractClassInJava;

// abstract class Animal {

  
// }

 abstract class Animal{
  // It may or may not contain abstract method...
 }

class Dog extends Animal{

}

public class Main {

  public static void main(String[] args) {
    // Animal ref = new Animal();  //Cannot instantiate the type Animal

    // Animal ref = new Animal(); // We can create the object of the normal class...
   
     // We cannot create the Object of the abstract class ,but we can create the reference easily...

    Animal ref = new Dog();

  }
}