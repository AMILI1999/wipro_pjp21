public class SumOfArray{
   public static void main(String args[]){
      int[] array = {7,1,2,3,6};
      int sum = 0;
     
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}