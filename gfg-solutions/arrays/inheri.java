class parent {
  int value;
    parent(int value) {
      this.value = value;
    }
   public static void sample() {
     System.out.println("This is a sample method in parent class");
   }
   public void display() {
     System.out.println("This is a display method in parent class");
   } 
}
class child extends parent {
  int val2;
  child(int val1, int val2) {
    super(val1);
    this.val2 = val2;
  }
  public static void sample1() {
    System.out.println("This is a sample method in child class");
  }
  public void sleep() {
    System.out.println("This is a sleep method in child class");
  }
}
public class inheri {
  public static void main(String[] args) {
    child c = new child(10, 20);
    System.out.println(c.value);
    System.out.println(c.val2);
    parent p1=new child(20,30);
    System.out.println(p1.value);
    parent pa=new child(30,40);
    child c1=(child)pa;
    c1.sleep();


    
  }
}