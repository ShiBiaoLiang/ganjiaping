import java.util.*;

public class FuLiLast{
     public static double b,l,n,h;
     
   //���㱾Ϣ��
     public static void Benxihe(){
          double sum1,sum2;
           Scanner scanner=new Scanner(System.in);
           System.out.println("�����뱾��: ");
           b=scanner.nextDouble();
           System.out.println("������������: ");
           l=scanner.nextDouble();
           System.out.println("����������: ");
           n=scanner.nextInt();
           sum1=(float) (b*Math.pow(1+l, n));
           sum2=b*(1+l*n);
           System.out.println("�����ı�Ϣ��Ϊ�� "+(double)(Math.round(sum1*100)/100.0));
           System.out.println("�����ı�Ϣ��Ϊ�� "+(double)(Math.round(sum2*100)/100.0));
     }
     
     //���㱾��
    public static void Benjin(){
         Scanner scanner=new Scanner(System.in);
         System.out.println("������������: ");
          l=scanner.nextDouble();
          System.out.println("����������: ");
          n=scanner.nextInt();
          System.out.println("�����뱾Ϣ��: ");
          h=scanner.nextDouble();
          b=(float) (h*1/Math.pow(1+l, n));
          System.out.println("����Ϊ�� "+(double)(Math.round(b*100)/100.0));
    }
    
  //��������
    public static class Logarithm {
    	 public static double log(double value, double base){
 			return Math.log(value)/Math.log(base);		 
 		 }
    }

    public static void Nianshu(){
          Scanner scanner=new Scanner(System.in);
          System.out.println("�����뱾��: ");
          b=scanner.nextDouble();
          System.out.println("������������: ");
          l=scanner.nextDouble();
          System.out.println("�����뱾Ϣ��: ");
          h=scanner.nextDouble();
          n=Logarithm.log(h/b,1+l);
          n=Math.ceil(n);
          System.out.println("��Ҫ�������Ϊ: "+Math.ceil(n));     
    }
    
    //����������
    public static void Lilu(){
         Scanner scanner=new Scanner(System.in);
          System.out.println("�����뱾��: ");
          b=scanner.nextDouble();
          System.out.println("����������: ");
          n=scanner.nextInt();
          System.out.println("�����뱾Ϣ��: ");
          h=scanner.nextDouble();
          l=Math.pow(h/b, 1.0/n)-1;
          System.out.println("�걨����Ϊ�� "+(double)(Math.round(l*1000)/1000.0));
    }
    
    //���㱾��֮����ͬ���Ͷ�ʺ�����ʲ�ֵ
    public static void Nianzongzhi(){
         int k=1;
         h=0;
         Scanner scanner=new Scanner(System.in);
          System.out.println("�����뱾��: ");
          b=scanner.nextDouble();
          System.out.println("������������: ");
          l=scanner.nextDouble();
          System.out.println("����������: ");
          n=scanner.nextInt();
          while(k<=n){
              b=b+h;
              h=b*(1+l);
              k++;
          }
         System.out.println("���ʲ���ֵΪ��"+(int)h);
    }
    
     public static void main(String[] args) {
         int choice;
         while(true){
         System.out.println("\t\t|------------------|");
         System.out.println("\t\t|  1.��Ϣ��                               |");
         System.out.println("\t\t|  2.�󱾽�                                   |");
         System.out.println("\t\t|  3.������                                   |");
        System.out.println("\t\t|  4.��������                               |");
        System.out.println("\t\t|  5.�����ʲ���ֵ                       |");
         System.out.println("\t\t|  6.�˳�                                       |");
         System.out.println("\t\t|------------------|");
         Scanner scanner=new Scanner(System.in);
         System.out.println("���������ѡ��(1~6):  ");
         choice=scanner.nextInt();
         switch(choice){
         case 1:
             Benjin();
             break;
         case 2:
             Benxihe();
             break;
         case 3:
             Nianshu();
             break;
         case 4:
             Lilu();
             break;
         case 5:
             Nianzongzhi();
             break;
         case 6:
             System.exit(0);
             break;
             default:
             {
                 System.out.println("������!");
                 break;
             }
         }
             }        
         }
     }