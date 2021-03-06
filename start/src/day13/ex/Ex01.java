package day13.ex;
/*
	문제 1. String[] arr= {"123", "456", "789" ....}
			가 있는 경우
			
			이 배열이 기억하는 숫자 형태의 문자열을
			정수로 바꾼 데이터들의 합과 평균을 구하는 프로그램을
			작성하시오!@
			
			단, 발생할 수 있는 예외를 가정하여 모두 처리하시오.
			1. 배열의 범위를 벗어나서 사용하는 경우	IndexOutOfBoundsException
			2. 숫자로 변환이 불가능한 경우	
			3. 평균을 계산하는데 0으로 나누는 경우. ArithmeticException
			4. 그 외의 예외인 경우.	고냥 Exception
 */
public class Ex01 {
	String[] arr= {"802","323","423","606","813","1122","205"};
	int[] num=new int[arr.length];
	int sum=0;
	int ave=0;

	public Ex01() {
		try {
			getNum();
			getSum(num);
		} catch(Exception e) {
			e.printStackTrace();
		}
		toPrint();
	}
	
	// 문자열 -> 정수
	public void getNum() throws Exception {
		try {
			for(int i=0; i<arr.length; i++) {
			num[i]=Integer.parseInt(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("숫자로 변환이 불가능합니다.");
		}
		
		if (num.length!=arr.length) {
			throw new WrongIndex();
		}		
	}
	
	// 합 구하기
	public void getSum(int[] num) throws Exception {
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
		}
		if (num.length!=arr.length) {
			throw new WrongIndex();
		}else {getAve();}
	}
	
	// 평균 구하기
	public void getAve() throws Exception {
		ave=sum/arr.length;
		
		if (arr.length==0) {
			throw new DividedZero();
		}
	}
	
	// 출력 함수
	public void toPrint() {
		System.out.print("입력된 숫자들 :");
		for (int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n합 : "+sum);
		System.out.println("평균 : "+ave);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
