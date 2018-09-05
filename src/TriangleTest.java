import java.util.Scanner;

public class TriangleTest {
	
	public static double triangle(double r, double h) {
		return ((r*h)/2);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double r;//밑변 변수
		double h;//높이 변수
		double area;//삼각형 넓이 변수
		System.out.printf("밑변을 입력하시오: ");//밑변 입력
		r=scan.nextDouble();
		System.out.printf("높이를 입력하시오: ");//높이 입력
		h=scan.nextDouble();//입력 받기 위한 함수
		area = triangle(r, h);//삼각형 넓이 구하는 함수를 넓이 변수에 대입
		System.out.printf("삼각형의 면적은 %.3f입니다.", area);//삼각형 넓이 출력

	}

}
