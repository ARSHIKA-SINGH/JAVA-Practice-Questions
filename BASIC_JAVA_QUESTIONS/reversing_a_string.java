import java.util.Scanner;
public class reversing_a_string{
    public static void revString(String str , int index){
        if(index == 0){
            System.out.println(str.charAt(index));
        }
        else if (index > 0){
            System.out.print(str.charAt(index));
            revString(str,index-1);
        }
        
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        revString(str,str.length()-1);
    }
}