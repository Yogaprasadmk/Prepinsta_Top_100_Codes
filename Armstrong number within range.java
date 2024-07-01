class Main{
public static voud main (String args[]){
int l = 1;
int h = 1000;
for(int i = l;i<=h;i++){
int sum = 0,len;
len = length(i);
int temp = i;
int last = 0;
while(temp>0){
	last = temp % 10;
	sum = sum + Math.pow(last,len);
	temp = temp / 10;
}
	if(num == sum){
System.out.println(i+" ");
}
}
public static void length(int i){
    int len = 0;
  while(i>0){
		len++;
		i = i / 10;
}
return len;
}
