public class RecursiveIsPalindrome{

    public static void main(String args[]){ 
        String str = "geeg"; 
  
        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
    
     public boolean isPalindrome(String str) {
             if (str.length() <= 1) {
                 return true;
             }
             else{

                 if (str.charAt(0) != str.charAt(str.length() - 1)){
                     return false;
                 } 
                 else{
                     
                     return isPalindrome(str.substring(1, str.length() - 1));
                }
            }
        }
    }
}