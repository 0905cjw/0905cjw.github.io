import java.util.Scanner;

public class MoneyCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money;
		
		System.out.print("실행");
		System.out.print("금액을 입력하세요?=");
		money=sc.nextInt();
		
		int w50000=money/50000;
		System.out.println("50000원="+w50000+"장");
		int w1000=(money%50000)/1000;
		System.out.println("1000원="+w1000+"장");
		int w500=(money%1000)/500;
		System.out.println("500원="+w500+"개");
		int w100=(money%500)/100;
		System.out.println("100원="+w100+"개");
		int w10=(money%100)/10;
		System.out.println("10원="+w10+"개");
		int w1=(money%10)/1;
		System.out.println("1원="+w1+"개");
	}

}
