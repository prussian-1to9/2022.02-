package day07.ex;
/*
	문제 1. 'A'~'J'의 문자 100개를 랜덤하게 만들고
			각 문자의 출현 횟수를 기억할 배열을 만들어,
			횟수만큼 '*'을 출력해주는 프로그램을 작성하시오.
			
			출력 예)
				A [5] : *****
				B [20] : ********************
				...
				J [7] : *******
 */
public class Ex01 {
	public static void main(String[] args) {
		// 배열 변수 생성
		char[] ch=new char[100];
		
		// 출현 횟수 배열변수 만들기
		int[] show= new int[10];
		
		// 랜덤 문자 출력
		for (int i=0; i<ch.length; i++) {
			int ran=(int)(Math.random()*(9-0+1)+0);
			ch[i]=(char)('A'+ran);
			
			// 카운트
			show[ran]++;
		}
		
		// 결과출력
		for (int i=0; i<show.length; i++) {
			System.out.print((char)('A'+i)+" ["+show[i]+"]\t: ");
			
			for (int j=0; j<show[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
