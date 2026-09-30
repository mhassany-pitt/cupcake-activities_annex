import java.util.Scanner;

public class BinarySearch {

   public static int binarySearch(int arr[], int first, int last, int lotNumber){

      int mid = (first + last)/2;

      while( first <= last ){

         if ( arr[mid] < lotNumber ){

            first = mid + 1;
         }

         else if ( arr[mid] == lotNumber ){  
            return mid;
         }

         else{

            last = mid - 1;
         }

         mid = (first + last)/2;
      }

      return -1;                    
   }
               
   public static void main(String a[]) {

      Scanner luckyNumber = new Scanner(System.in);

      int[] array = { 10, 20, 30, 40, 50, 60 };

      System.out.println("Enter your two digit lottery number: ");

      int lotNumber = luckyNumber.nextInt();

      int last=array.length-1;
      
      int index = binarySearch(array,0,last,lotNumber);
      
      if (index != -1) {
         
         index = index + 1;
         
         System.out.println(lotNumber + " is present at rank: " + index + " and the highest prize pull starts from '1' and then 2, 3 and so on.");
      
      } else {

         System.out.println("Sorry, Please Try Again!!!");
      }
   }
}