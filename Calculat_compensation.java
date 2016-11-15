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
	      Calculat cal = new Calculat(name,salary,sales);
	      if(cal.getsales()>=50001){
	    	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_com1()); 
	      }
	      else if (cal.getsales()>=25001){
	    	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_com2()); 
	      }
	      else{
	    	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_com3()); 
	      }
	}
}

