public class Main
{
	public static void main(String[] args) {
		int number = 1221;
		int dup = 0;
		int lastdigit = 0;
		int temp = number;
		while(temp > 0){
		    lastdigit = temp % 10;
		    dup = (dup * 10) + lastdigit;
		    temp = temp / 10;
		}
		if(number == dup){
		    System.out.println(dup + " is Palindrome");
		}
		else{
		    System.out.println(dup + "Is not Palindrome");
		}
	}
}
