import java.util.Scanner;
class Main{
public static void main(String args){
Scanner S = new Scanner (System.in);
System.out.println("Enter Number:");
int harshad  = S.nextInt();
int last = 0;
int dup = harshad;
int sum = 0;
while(harshad!=0){
last = harshad % 10;
sum = sum + last;
harshad = harshad / 10;
}
if(harshad%sum==0){
System.out.println("Harshaad Number");
}
else{
System.out.println("Not a Harshaad Number");
}
}
