public class AlDiSc
{
public static void main(String[] args)
{
      Scanner scanner=new Scanner(System.in);
      String char1 = String.valueOf(scanner.next().charAt(0));

      if(char1.matches("[0-9]") || char1.matches("-[0-9]"))
      {
        System.out.print("char is Digit");

      }
      else if(char1.matches("[a-zA-Z]"))
      {
        System.out.print("char is Alphabet");
      }
      else
      {
        System.out.print("char is special character");
          }
      }
    }