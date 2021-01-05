import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	public ExceptionEx() {}
	public void start() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("첫 번째 수:");
			//	int num1=sc.nextInt(); // InputMismatchException
				// 콘솔의 문자열 1줄을 입력받는다
				int num1=Integer.parseInt(sc.nextLine()); // 엔터의 입력까지 받아 문자열을 정수형으로 변환
				System.out.print("두 번째 수:");
			//	int num2=sc.nextInt(); // InputMismatchException
				int num2=Integer.parseInt(sc.nextLine()); // 문자가 입력되면
				
				int result=num1*num2;
				int result2=num1/num2; // 0으로 나눌 때 ArithmeticException
				
				System.out.println(num1+"*"+num2+"="+result);
				System.out.println(num1+"/"+num2+"="+result2);
				
				String names[]= {"세종대왕","이순신"};
				for(int i=0;i<=names.length;i++) { 
					System.out.println("names["+i+"]="+names[i]); // index 범위 ArrayIndexOutOfBoundsException
				}
		//	}catch(InputMismatchException ime) {
		//		System.out.println("숫자만 입력하세요");
			}catch(ArithmeticException ae) {
				System.out.println("두 번째 값은 0외의 값을 입력해야 합니다");
			}catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println("배열의 index를 잘못 사용하였습니다"+ai.getMessage());
			}catch(NumberFormatException nfe) {
				System.out.println("숫자만 입력하세요");
			}
		}
	}
	public static void main(String args[]) {
		new ExceptionEx().start();
	}
}
