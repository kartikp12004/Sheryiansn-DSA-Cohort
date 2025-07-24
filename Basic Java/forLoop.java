import java.util.*;
public class loop{
    public static void main(String[] args) {
        // for(int a = 1; a<=5 ; a++){
        //     System.out.print(a+ " ");
        // }

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // for(int b = 1 ; b<=a ; b++){
        //     System.out.println(b);
        // }

        // int num = sc.nextInt();
        // for(int i = 1; i<=num ; i++){
        //     System.out.println("Hello worold");
        // }


        // int num=sc.nextInt();
        // for(int i = 1 ; i<=num ; i++){
        //     System.out.print(i+" ");
        // }

        // int num = sc.nextInt();
        // for (int i = num; i >= 1; i--) {
        // System.out.println(i);
        //         }



        // int i = sc.nextInt();
        // for(int j = i ; j>=1 ; j--){
        //     System.out.println(j);
        // }


        // int i = sc.nextInt();
        // for(int j = 1 ; j<=10;j++){
        //     System.out.println(i*j);
        // }


        // int i = sc.nextInt();
        // for(int n = 1; n<=i;n++){
        //     System.out.print(n+" ");
        // }

        // int num = sc.nextInt();
        // int i = 0;
        // for(i=num; num>=1 ; num--){
        //     System.out.print(num);
        // }


        // int num = sc.nextInt();
        // for(int i = 1; i<=10; i++){
        //     System.out.println(num + " * "+i+" = " +(num*i));
        // }

        //Factorial Problem:

        // int numOfSum = sc.nextInt();
        // int sum = 1;
        // for(int i = 1 ; i<=numOfSum ; i++){
        //     sum = sum*i;
        // }
        // System.out.println(sum);


        //even odd addition:

        // int input = sc.nextInt();
        // int even = 0;
        // int odd = 0;
        // for(int start = 1; start<=input; start++){
        //     if(start%2==0) even+=start;
        //     else odd+=start;
        // }
        // System.out.println(even);
        // System.out.println(odd);


        //factor of a number

        // int a = sc.nextInt();
        // for(int i = 1; i<=a/2;i++){
        //     if(a%i == 0){ 
        //         System.out.print(i+" ");
        // }
         
        // }
        // System.out.println(a);

        //Print the sum of all factors of a number (Ex: 50 -> 1 + 2 + 5 + 10 + 25 = 43)
        // int input = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i<=input/2;i++){
        //     if(input%i==0) sum=sum+i;
        // }
        // System.out.println(sum);

        //prime or not
        //1 is not a prime number...    
        // int input = sc.nextInt();
        // int count = 0;
        // for(int i = 2 ; i<=input/2;i++){
        //     if(input%i==0) count++;
        // }
        // if (count==0) {
        //     System.out.println("prime");
        // }
        // else{
        //     System.out.println("Not prime");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int pow = 1;
        // for(int i = 1; i<=b ; i++){
        //     pow = pow*a;
        // }
        // System.out.println(pow);

        //Prime or not:

        int num = sc.nextInt();

        int count = 0;
        for(int i = 2; i<=num/2;i++){
            if(num%i==0) count++;
        }
        if (count==0) System.out.println("Prime");
        else System.out.println("Not Prime");
              
    }
}
