import java.util.Scanner;

public class TriangleTest {
	
	public static double triangle(double r, double h) {
		return ((r*h)/2);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double r;//�غ� ����
		double h;//���� ����
		double area;//�ﰢ�� ���� ����
		System.out.printf("�غ��� �Է��Ͻÿ�: ");//�غ� �Է�
		r=scan.nextDouble();
		System.out.printf("���̸� �Է��Ͻÿ�: ");//���� �Է�
		h=scan.nextDouble();//�Է� �ޱ� ���� �Լ�
		area = triangle(r, h);//�ﰢ�� ���� ���ϴ� �Լ��� ���� ������ ����
		System.out.printf("�ﰢ���� ������ %.3f�Դϴ�.", area);//�ﰢ�� ���� ���

	}

}
