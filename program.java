import java.io.*;
import java.util.*; 
import java.lang.*;
class kom
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in); 
        int i;
        String str=sc.nextLine();
        String str1="",str2="";
        for(i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
            if(str.charAt(i)==' ' || i==0)
            {
                if(i==0)
                str2=str1+" "+str2;
                else
                str2=str1+str2;
                str1="";
            }
        }
        System.out.println(str2);
    }
}