import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            int fi=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    fi=1;
                }
            }
            if(fi==0)
            {
                System.out.println(i);
            }
        }
    }
}
