public class armstrong{
    public static void main (String[] args){
        for(int i = 100 ; i<1000 ; i ++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }

    }
    public static boolean isArmstrong(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            sum=sum+ rem*rem*rem;
        }
        return sum == original;

    }
}    
        