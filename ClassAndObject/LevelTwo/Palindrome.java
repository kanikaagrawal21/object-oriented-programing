package LevelTwo;
 class palindromeChecker{
     private String text;

     public void palindromeChecker(){
          this.text=text;
     }
     public boolean isPalindrome(){
           int start =0;
           int end = text.length();
           boolean isPalindrome = true;
           while(start<end){
               if(text.charAt(start)!=text.charAt(end)){
                   return false;

               }
               start++;
               end--;
           }

           return isPalindrome;
     }
     public void display(){
         System.out.println(isPalindrome());
     }
 }
public class Palindrome {
    public static void main(String[] args) {
        palindromeChecker p = new palindromeChecker();
        p.isPalindrome();
        p.display();
    }
}
