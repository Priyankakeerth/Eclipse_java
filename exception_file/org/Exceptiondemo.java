package exception_file.org;




import java.util.Scanner;

public class Exceptiondemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Exceptiondemo ed = new Exceptiondemo();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Numbers: ");
      int no1 = sc.nextInt();
      int no2 = sc.nextInt(); 
    ed.divide(no1,no2);
    ed.subtract(no1,no2);

  }

  private void subtract(int no1, int no2) {
    // TODO Auto-generated method stub
      System.out.println(no1-no2);
    
  }

  private void divide(int no1, int no2) {
    // TODO Auto-generated method stub
    try {
          System.out.println(no1/no2);
        }
       catch(ArithmeticException praveen)
        {
          System.out.println("Check no2");
        }  
    catch (Exception e) {
      System.out.println(" Something went wrong");
    }
  }

}