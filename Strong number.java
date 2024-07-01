class Strongnumber{
public static void main(String[] args){
int num = 145;
if(dectectStrong(num)){
System.out.println(num + " is a strong number");
}
else {
System.out.println(num + is not a Strong number");
}
}

static int digit(int n){
int fact = 1
for(int i = 1;i<=n;i++){
fact = fact * i;
}
return fact;
}
static boolean detectStrong(int num){
    boolean flag = false;
    int temp = num;
    int last = 0;
        int sum = 0;
  while(temp>0){
    last = tmp % 10;
    sum = sum + digit(last);
     temp = temp / 10;
  }
  if(num == sum){
     flag = true;
  }
    else{
  flag = false;
    }
    return flag;
  }
}
