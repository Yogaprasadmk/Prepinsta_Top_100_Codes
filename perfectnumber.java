
class Main{
    public static void main (String[] args) {
        int n = 6;
        int sum = 0;
        
// if we give zero in i value then it will become arithmetic exception because anything divided by 0 is infinite so we need to give value 1; 
	int  i= 1;
	while(i<=n/2){ // why here n/2 means we required value is 6 it will add the value the divided value 1+2+3  
            if(n%i==0){ // if we use for loop set condition as n/2 in initialization
                sum = sum + i;
            }
            i++;
        }
        if(n == sum) System.out.println("perfect number");
        else System.out.println("not perfect number");
        
    }
}
