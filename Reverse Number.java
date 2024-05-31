public class ReverseNumber
{
	public static void main(String[] args) {
	    
	    int a = 6789;
	    int dup = 0;  // duplicate
	    int lastdigit = 0;
	    while(a>0){
	        lastdigit = a % 10;
	        dup = (dup * 10) + lastdigit;
	        a = a / 10;
      }
	    if(dup != a){
	        System.out.println("Reverse Number: "+ dup);
	    }
	    else{
	        System.out.println("Not a Reverse Number: "+ dup);
	    }
	}
}
