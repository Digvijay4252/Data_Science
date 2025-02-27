import java.util.*;
public class divisableby {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("divisable by 3 and 5");
        }
        else if(num%3==0)
        {
            System.out.println("divisible by 3");
        }
        else if(num%5==0)
        {
            System.out.println("divisible by 5");
        }
    }
}
