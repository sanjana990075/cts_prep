import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        int binary[] = new int[100];
        int number,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        number=sc.nextInt();
        while(number!=0)
        {
            binary[i]=number%8;
            number/=8;
            i++;
        }
        System.out.println("value is");
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(binary[j]);
        }
    }
}
