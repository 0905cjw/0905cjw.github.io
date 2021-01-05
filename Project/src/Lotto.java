import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public Lotto() {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int lottoArray[]=new int[7];
		int count;
		int num;
		
		while(true) {
			num=1;
			System.out.print("게임 수 = ");
			count=sc.nextInt();
			
			// 배열에 랜덤 숫자 저장
			for(int input=0; input<count; input++) {
				for (int i=0; i<lottoArray.length; i++) {
					lottoArray[i]=ran.nextInt(45)+1;
					
					// 중복 제거
					for (int j=0; j<i; j++) {
						if (lottoArray[j]==lottoArray[i]) {
							i--;
							break;
						}
					}
				}

				// 오름차순
				int temp;
				for(int i=0;i<lottoArray.length-2;i++) {
					for(int j=i+1;j<lottoArray.length-1;j++) {
						if(lottoArray[i]>lottoArray[j]) {
							temp=lottoArray[i];
							lottoArray[i]=lottoArray[j];
							lottoArray[j]=temp;
						}
					}
				}
				
				// 로또 번호 출력
				for (int j=0;j<lottoArray.length;j++) {
					if(j==0) {
						System.out.print(num+"게임=["+lottoArray[j]+", ");
						num++;
						}
					if(j>0&&j<=4) {
						System.out.print(lottoArray[j]+", ");
					}
					if(j==5) {
						System.out.print(lottoArray[j]+"]");
					}
					if(j==6) {
						System.out.println(", bouns="+lottoArray[6]);
					}
				}
			}
			
			System.out.print("계속하시겠습니까(1:예,2:아니오)?");
			int yN;
			yN=sc.nextInt();
			if(yN==2)break; // 2:아니오를 입력으로 받으면 while문 탈출
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

	public static void main(String[] args) {
		new Lotto();
	}

}