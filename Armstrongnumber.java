import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    System.out.println("Enter a:");
		int a = S.nextInt();
		int dup = a;
		int sum = 0;
		int lastdigit = 0;
		while (a>0){
		    lastdigit = a % 10;
		    sum = sum + (lastdigit* lastdigit * lastdigit);
		    a = a / 10;
		}
		if(sum == dup){
		    System.out.println("Armstrong nUmber");
		}
		else{
		    System.out.println("NOt Armstrong number");
		}
	}
}
