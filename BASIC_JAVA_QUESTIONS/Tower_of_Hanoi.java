import java.util.Scanner;
public class Tower_of_Hanoi {
    public static void towerOfHanoi(int n , String src, String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+ src + " to"+ dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk " + n + " from "+ src + " to " + dest);
        towerOfHanoi(n-1,helper,src,dest);
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n,"S","H","D");
    }
}