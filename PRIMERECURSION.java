import java.util.*;
public class PRIMERECURSION
{
    static int cOUNT=2;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int y=in.nextInt();
        if(y==1)
        System.out.println("NOT PRIME NUMBER");
        if(y==2||1==PRIME(y))
        System.out.println("PRIME NUMBER");
        else 
        System.out.println("NOT PRIME NUMBER");
    }
    public static int PRIME(int y)
    {
        if(cOUNT<y/2)
        cOUNT=cOUNT+1;
        else
        return 1;
        if(y%cOUNT==0)
        return 0;
        return PRIME(y) ;
    }
}
