package Project;

import java.util.Scanner;

public class Calculat_compensation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 System.out.print("Input name: ");
	      String name = input.nextLine();
	      System.out.print("Input Salary: ");
	     double salary = input.nextDouble();
	      System.out.print("Input Monthly sales: ");
	      double sales = input.nextDouble();
		   Calculate cal = new Calculate(name,salary,sales);
	      if(cal.getsales()>=100001){
	    	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_compensation1()); 
	      }
	      else if (cal.getsales()>=50001){
	    	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_compensation2()); 
	      }
	      else{
	    	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_compensation3()); 
	      }
	}
    

}

