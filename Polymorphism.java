public class Polymorphism {
  // Polymorphism : Same object having different behaviour..
  // Compile-time polymorphism : Example : Method Overloading...
   
  void add(){
    int a =21, b=22, c;
     c= a+b;
     System.out.println(c);
  }
  void add(int x , int y){
    int c = x+y;
    System.out.println(c);
  }

  void add(double x , double y){
    double c = x+y;
    System.out.println(c);
  }
  public static void main(String[] args) {
    
  }
}
