package patikaProject;
 

public class Employee {
	
	private String name; // Çalışanın adı ve soyadı
	private double salary; //maaşı
	private double workHours;//Haftalık çalışma saati
	private int hireYear;// İşe başlangıç yılı
	public Employee(String name, double salary, double workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	//Maaşa uygulanan vergiyi hesaplayacaktır.
	public double tax(double salary) {
		double tax=0;
		if(salary>1000) {
			tax = salary*3/100;
		}
		return tax;
	}
	
	public double bonus(double workHours) {
		double bonus=0;
		if(workHours > 40) {
			bonus = 30*(workHours-40);
		}
		return bonus;
		
	}
	
	public double raiseSalary(double salary,double workHours, int hireYear) {
		double increase = 0;
		int year=0;
		year = 2021-hireYear;
		salary-=tax(salary);
		salary+=bonus(workHours);
		if(year<10) {
			increase=salary*5/100;
		}
		else if(year > 9 && year<20) {
			increase=salary*10/100;
		}
		else if(year > 19) {
			increase=salary*15/100;
		}
		return increase;
	}
	public void toString(Employee employee){
		System.out.println("Adı : " + employee.getName());
		System.out.println("maaşı : " + employee.getSalary());
		System.out.println("çalışma saati : " + employee.getWorkHours());
		System.out.println("başlangıç yılı : " + employee.getHireYear());
		System.out.println("vergi : " + employee.tax(employee.getSalary()));
		System.out.println("bonus : " + employee.bonus(employee.getWorkHours()));
		System.out.println("maaş artışı : " + employee.raiseSalary(employee.getSalary(),employee.getWorkHours(),employee.getHireYear()));
		System.out.println("vergi ve bonuslarla birlikte maaş : " + (employee.getSalary()-employee.tax(employee.getSalary())+employee.bonus(employee.getWorkHours())));
		System.out.println("toplam maaş : " + (employee.getSalary()-employee.tax(employee.getSalary())+employee.bonus(employee.getWorkHours())+employee.raiseSalary(employee.getSalary(),employee.getWorkHours(),employee.getHireYear())));
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	 
	
}
