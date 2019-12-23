package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee saurabh;
		saurabh = new Employee();
		saurabh.salary = 80000;
		saurabh.bonus = 9000;
		saurabh.calculatesalary();
		System.out.println(".....................");
		
		Employee padmini = new Employee();
		padmini.salary = 100000;
		padmini.bonus = 1000;
		padmini.calculatesalary();
		System.out.println(".....................");

		Employee aron = new Employee();
		aron.salary = 19999;
		aron.bonus = 222;
		int aronslary= aron.calculatesalary1();
		System.out.println("Aron Salary= " + aronslary);
		
	Employee varun = new Employee();
//		int varunsalary = varun.calculatesalary2(60000, 100);
//		System.out.println("varun salary is " + varunsalary);

	varun.salary = 1000;
	varun.bonus = 111000;
	
		int varunsalary = varun.calculatesalary3(1111, 1);
		System.out.println("salary of varun is: " + varunsalary);
	}

}
