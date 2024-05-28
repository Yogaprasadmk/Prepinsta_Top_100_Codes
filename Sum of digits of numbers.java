public class Main{
    public static void main (String[] args) {
         int a = 123;
         int count = 0;
         int lastdigit = 0;
        while(a>0){
             
            lastdigit = a % 10;
            
            count = lastdigit + count;
            
            a = a/ 10;
        }
        System.out.println(count);
         
    }
}
