
import java.util.*;


public class FuLi {


	public static void main(String[] args) {
		
		float b,l,sum;
		int n;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("���������ı���: ");
		b=scanner.nextFloat();
		
		System.out.println("��������Ҫ�洢������: ");
		n=scanner.nextInt();
		
		System.out.println("������������: ");
		l=scanner.nextFloat();
		
		sum=(float) (b*Math.pow(1+l, n));
		System.out.println("���ı�����Ϊ�� "+sum);
		

	}

}
