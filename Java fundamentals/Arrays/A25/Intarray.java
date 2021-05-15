public class Intarray{
  public static void main(String[] args) {

    int[] num = {1, 4, 34, 56, 7};
    int toFind = 34;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " -1");
  }
}