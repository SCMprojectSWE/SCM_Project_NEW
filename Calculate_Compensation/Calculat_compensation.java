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
     if(cal.getsalaty()>=100001){
    	 if(cal.Calculat_compensation1()<18000){
    		 System.out.println("Name Employee is "+cal.getname()+"   compensation is : 18000 " ); 
         }else{
   	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_compensation1()); 
         }
     } else if (cal.getsales()>=50001){
    	 if(cal.Calculat_compensation2()<18000){
    		 System.out.println("Name Employee is "+cal.getname()+"   compensation is : 18000 " ); 
         }else{
   	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_compensation2()); 
         }
     
     }else{
    	 if(cal.Calculat_compensation3()<18000){
    		 System.out.println("Name Employee is "+cal.getname()+"   compensation is : 18000 " ); 
         }else{
   	  System.out.println("Name Employee is "+cal.getname()+"   compensation is : " + cal.Calculat_compensation3()); 
         }
     }
     
    

}
}

