import java.util.*;

class Employee{
	String emp_name;
	int emp_id;
	int emp_age;
	String emp_gender;
	String emp_designation;
	int emp_salary;
	String emp_address;
	private static ArrayList<Employee> emp_list = new ArrayList<Employee>(); 
	Employee(String emp_name,int emp_id,int emp_age,String emp_gender,String emp_designation,int emp_salary,String emp_address){
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.emp_age = emp_age;
		this.emp_gender = emp_gender;
		this.emp_designation = emp_designation;
		this.emp_salary = emp_salary;
		this.emp_address = emp_address;
	}
	
	public static void addobj(Employee emp){
		emp_list.add(emp);
	}
	
	public static ArrayList<Employee> getobj(){
		return emp_list;
	}
}

class Emp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of customers ");
		int size = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++){
			int val = i+1;
			System.out.println("enter the details of " +  + " employee");
			System.out.println("enter the emp_name ");
			String emp_name = sc.nextLine();
			System.out.println("enter the emp_id ");
			int emp_id = sc.nextInt();
			System.out.println("enter the emp_age ");
			int emp_age = sc.nextInt();
			sc.nextLine();
			System.out.println("enter the emp_gender ");
			String emp_gender = sc.nextLine();
			System.out.println("enter the emp_designation ");
			String emp_designation = sc.nextLine();
			System.out.println("enter the emp_salary ");
			int emp_salary = sc.nextInt();
			sc.nextLine();
			System.out.println("enter the emp_address ");
			String emp_address = sc.nextLine();
			Employee emp = new Employee(emp_name,emp_id,emp_age,emp_gender,emp_designation,emp_salary,emp_address);
			Employee.addobj(emp);
		}
		System.out.println("enter the emp_id ");
		int emp_id_x = sc.nextInt();
		ArrayList<Employee> emp_list = Employee.getobj();
		for(Employee x : emp_list){
			if(x.emp_id == emp_id_x){
				System.out.println(x.emp_id +" "+ x.emp_name +" "+ x.emp_age +" "+ x.emp_gender +" "+ x.emp_designation +" "+ x.emp_salary);
				break;
			}
		}
	}
}
