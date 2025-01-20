import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,count=0;
        System.out.println("enter the the number ");
        a =sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
    if(count==2){
        System.out.println("prime number");
    }
else{
    System.out.println("not prime number");
}

    }
    
}
