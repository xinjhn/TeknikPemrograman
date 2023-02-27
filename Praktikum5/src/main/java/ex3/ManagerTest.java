package ex3;

public class ManagerTest {
	public static void main (String[] args){ 
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
		staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
		Sortable.shell_sort(staff);
		int i;
		for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();
		
		System.out.println("");
		Employee[] staff2 = new Employee[4];
		staff2[0] = new Manager("Dadang Cimol", 3000000, 5, 12, 2000);
		staff2[1] = new Employee("Ujang Molen", 4500000, 2, 7, 1998);
		staff2[2] = new Manager("Asep Batagor", 5600000, 3, 3, 1996);
		staff2[3] = new Employee("Udin Seblak", 3700000, 5, 6, 2000);
		Sortable.shell_sort(staff2);
		for(i = 0; i < 4; i++) staff2[i].raiseSalary(5);
		for(i = 0; i < 4; i++) staff2[i].print();
	}
}
