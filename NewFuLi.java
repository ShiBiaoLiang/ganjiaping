 import java.util.*; 
  
  
 public class FuLi { 
  
  
 public static void main(String[] args) { 
  
 float b,l,sum1,sum2,sum; 
 int n; 
  
 Scanner scanner=new Scanner(System.in); 
  
 System.out.println("���������ı���: "); 
 b=scanner.nextFloat(); 
  
 System.out.println("��������Ҫ�洢������: "); 
 n=scanner.nextInt(); 
  
 System.out.println("������������: "); 
 l=scanner.nextFloat(); 
  
 sum1=(float) (b*Math.pow(1+l, n)); 
 System.out.println("���ĸ�����Ϣ��Ϊ�� "+sum1); 
 
 sum2=b*(1+l*n);
 System.out.println("���ĵ�����Ϣ��Ϊ�� "+sum2);
 
 System.out.println("���������ı�Ϣ��: ");  
 sum=scanner.nextFloat(); 
 
 System.out.println("��������Ҫ�洢������: "); 
 n=scanner.nextInt(); 
 
 System.out.println("������������: "); 
 l=scanner.nextFloat(); 
 
 b=(float)(sum*1/Math.pow(1+l, n));
 System.out.println("���ı���Ϊ�� "+b); 
  
  
 } 
  
 } 
