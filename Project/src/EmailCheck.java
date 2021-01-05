import java.util.Scanner;

public class EmailCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("이메일 입력=");
			String email=sc.next();
			
			char[] array = new char[email.length()];
			
			for(int i=0;i<array.length;i++){ 
				array[i]=(email.charAt(i));	// 배열에 문자열을 한 글자씩 저장
			//	System.out.print(array[i]);
			}
			
			int index=email.indexOf("@");
		//	System.out.println("index="+index);
			
			int index1=email.indexOf(".");
		//	System.out.println("index1="+index1);
			
			if(index1==-1||index>index1||!email.contains("@")) {
				System.out.println(email+"는 잘못입력된 이메일입니다....");
			}else {
				String id=email.substring(0,index);
				String domain=email.substring(index+1);
				System.out.print("아이디 = "+id+"\n도메인 = "+domain+"\n");
			}
		}
		
	}

}
