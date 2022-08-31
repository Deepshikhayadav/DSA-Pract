public class BasicPrograms {
    public static void main(String[] args) throws Exception {
         
       fibonacci();
       palinString();
       palinInteger();
       armStrong();
       System.out.println(factorial(7));
       primeNo();
    }

       // Fibonacci Series
    public static void fibonacci() {
          int no=10;
          int a=0,b=1;
          System.out.print(a+" "+b+" ");
          for(int i=2;i<no;i++){
              int c=a+b;
              System.out.print(c+" ");
              a=b;
              b=c;
          }
          System.out.println();
    }
     //Palindrome of String
    public static void palinString() {
         String str="abcdefg",str2="gfedcba";
         if(str.length()==str2.length()){
             for(int i=0;i<str.length()-1;i++){
                 if(!(str.charAt(i)==str2.charAt(str.length()-1-i))){
                     System.out.println("Not palindrome");
                     return;
                 }
             }
             System.out.println(" palindrome");
         }
 
    }
     //Palindrome of Integer
    public static void palinInteger() {
         int no1=1234, no2=4321,last=0;
          int sum=0;
         while(no1>0){
            last=no1%10;
            no1/=10;
            sum=(sum*10)+last;
         }
         if(sum==no2)
         System.out.println(" palindrome");
         else
         System.out.println("not palindrome");
    }

      // Armstrong no
    public static void armStrong() {
       int armNo=153, temp=armNo, sum2=0;
       while(armNo>0){
        int k=armNo%10;
        sum2+=k*k*k;
        armNo/=10;
       }
       if(sum2==temp)
         System.out.println(" arm");
         else
         System.out.println(" not arm");
    }

    //Factorial
    public static int factorial(int fact){
        if(fact>1){
            return fact*factorial(fact-1);
        }
        else
        return fact;
    }

// Prime no
public static void primeNo() {
    int no=8;
    for(int i=2;i<no;i++){
        if(no%i==0){
            System.out.println("Not prime");
            return;
        }
    }
    System.out.println("Prime");
}

}
