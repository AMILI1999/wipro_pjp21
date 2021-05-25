import java.util.Scanner;

public class Concatenation {
	
	static String appendThemTogether(String str1, String str2) {
		String outStr = "";
		if (str1.charAt(str1.length()-1) == str2.charAt(0))
			outStr = str1.substring(0, str1.length()-1) + str2;
		else
			outStr = str1 +" " + str2;
		
		return outStr.toLowerCase();
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the 1st string: ");
		String str1 = scan.nextLine();
		System.out.print("Enter the 2nd string: ");
		String str2 = scan.nextLine();
	
		System.out.println(appendThemTogether(str1, str2));
	}

}