public class Ushtrimi2 {
  static void printName(String name) {
    System.out.println("Emri: " + name);
  }

  public void printAge(int age) {
    System.out.println("Mosha: " + age + " vjeç");
  }

  public static void main(String[] args) {
    printName("Era");

    Main obj = new Main();
    obj.printAge(21);
  }
}
