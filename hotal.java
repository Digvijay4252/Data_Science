import java.util.*;

class hotal
{
    int totalampunt(int price,int count)
    {
        return count*price;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int price=sc.nextInt();
        hotal obj=new hotal();
        System.out.println("total amount"+obj.totalampunt(price,count));
    }
}