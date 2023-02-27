package ex3;

public class EmployeeTest {
	public static void main (String[] args){ 
		 Employee[] staff = new Employee[3];
		 staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		 staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		 staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		 Sortable.shell_sort(staff);
		 int i;
		 for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		 for (i = 0; i < 3; i++) staff[i].print();
		 
		 System.out.println("");
		 
		 Employee[] staff2 = new Employee[3];
		 staff2[0] = new Employee("Rahmat Kopling", 5000000, 6, 9, 2005);
		 staff2[1] = new Employee("Jajang Knalpot", 4000000, 9, 11, 2004);
		 staff2[2] = new Employee("Ahmad Spakbor", 6500000, 20, 4, 2007);
		 Sortable.shell_sort(staff2);
		 for (i = 0; i < 3; i++) staff2[i].raiseSalary(5);
		 for (i = 0; i < 3; i++) staff2[i].print();
		 
	}
}
