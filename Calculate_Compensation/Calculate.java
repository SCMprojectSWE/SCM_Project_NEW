ppackage Project;

import javax.swing.Spring;

public class Calculate {

	private String name;
	private double salary;
	private double sales;
	public Calculate(String name,double salary,double sales){
		this.name=name;
		this.salary=salary;
		this.sales=sales;
	}
	public String getname(){
		return name;
		
	}
	public double getsalaty(){
		return salary;
		
	}
	public double getsales(){
		return sales;	
	}
	public double Calculat_compensation1(){
		double com;
		 com =(salary+(sales *0.03));
		 return com;
	}
	public double Calculat_compensation2(){
		double com;
		 com =(salary+(sales *0.02));
		 return com;
	}
	
	public double Calculat_compensation3(){
		double com;
		 com =(salary+(sales *0.01));
		 return com;
	}
	
	
	

}
