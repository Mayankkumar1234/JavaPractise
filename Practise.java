class Practise{
// Uses of this keyword in java...
   int a;

   Practise(int a){
    // a=a;  -> The assignment to variable a has no effectJava
    // this.a = a;
   }

  void show(){
    // System.out.println(this);
    System.out.println(a);
  }
  public static void main(String[] args) {
    Practise ref = new Practise(21);
    // System.out.println(ref);

    ref.show();
  }
}