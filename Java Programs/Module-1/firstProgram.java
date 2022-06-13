//Write a program in Java to store user inputed social security numbers in a single dimensional array.
import java.io.*;
public class firstProgram
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(br.readLine());
        int ssn[] = new int[n];
        int i;
        System.out.println("Enter the SSN of the people: ");
        for(i=0;i<n;i++)
        {
            ssn[i] = Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
        {
            System.out.printf("The SSN of Person %d is: %d \n",i+1,ssn[i]);
        }
    }
}