
// 최정원
import java.util.Scanner;

public class Diamond {
	Scanner sc=new Scanner(System.in);
	public Diamond() {
		
	}

	public void start() {
        int i,j,l;
        char alpha='A';
        int num;
        
        while(true) {
        	System.out.print("임의의 홀수 입력(1~49):");
            num=sc.nextInt();
            
            if((num>=1&&num<=49)&&num%2==1)
            {
            	break;
            }
        }
        
        for(i=1;i<=num;i=i+2)
        {
        	for (j=num;j>=i;j=j-2)
        	{
        		System.out.print(" ");
        	}
        	for(l=1;l<=i;l++)
        	{
        		System.out.print(alpha++);
        		if(alpha>'Z') {
        			alpha='A';
        		}
        	}
        	System.out.println();
        }
        
        for(i=1;i<=num-2;i=i+2)
        {
        	for (j=1;j<=i;j=j+2)
        	{
        		System.out.print(" ");
        	}
        	System.out.print(" ");
        	for(l=num-2;l>=i;l--)
        	{
        		System.out.print(alpha++);
        		if(alpha>'Z') {
        			alpha='A';
        		}
        	}
        	System.out.println();
        }
        
	}
	public static void main(String[] args) {
		new Diamond().start();

	}

}