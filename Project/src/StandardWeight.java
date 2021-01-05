import java.util.Scanner;


public class StandardWeight {
	
	int age, male;
	
	public int getInput(String msg) {
	Scanner sc=new Scanner(System.in);
	System.out.print(msg+"=");
	return sc.nextInt();
	}
	
	
	public void swIndex(int weight, double sWeight) {
		double swIndex=(weight/sWeight)*100;
		result(swIndex);
		
	}
	public void start() {
		age=getInput("나이");
		male=getInput("성별(1:남성,2:여성)");
		int height=getInput("키");
		int weight=getInput("현재체중");
		
		double sWeight=getStandrardWeight(height);
		getStandrardWeight(age);
		
		
		System.out.println("표준 체중="+(int)sWeight);
		swIndex(weight, sWeight);
		
	}
	
	public void result(double swIndex) {
		if(swIndex<=85) {
			System.out.printf("당신의 표준 체중 지수는 "+swIndex+"으로 마른형입니다.");
		}
		else if(swIndex>=86&&swIndex<=95) {
			System.out.printf("당신의 표준 체중 지수는 "+swIndex+"으로 조금 마른형입니다.");
		}
		else if(swIndex>=96&&swIndex<=115) {
			System.out.printf("당신의 표준 체중 지수는 "+swIndex+"으로 표준형입니다.");
		}
		else if(swIndex>=116&&swIndex<=125) {
			System.out.printf("당신의 표준 체중 지수는 "+swIndex+"으로 조금 비만형입니다.");
		}
		else {
			System.out.printf("당신의 표준 체중 지수는 "+swIndex+"으로 비만형입니다.");
		}
	}
	
	public double getStandrardWeight(int height) {
		double genderIndex=0.90;
		
		if(age<=35&&male==2) {
			genderIndex=0.85;
		}
		else if(age>=36&&male==1) {
			genderIndex=0.95;
		}
		
		double sWeight=(height-100)*genderIndex;
		return sWeight;
		
	}
	
	public static void main(String args[]) {
		StandardWeight obj=new StandardWeight();
		
		obj.start();
	}
	
}
