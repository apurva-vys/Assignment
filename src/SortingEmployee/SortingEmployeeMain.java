package SortingEmployee;

import java.util.Arrays;
import java.util.List;

public class SortingEmployeeMain {

	public static void main(String args[]) {

		List<Employe> empList = loadListofEmployee();
		String sortArr[] = { "firstname", "lastname", "country" };
		sortListByInput(empList, sortArr);

	}

	private static void sortListByInput(List<Employe> empList, String[] sortArr) {
		for (int i = 0; i < sortArr.length; i++) {
			if (sortArr[i].equals("firstname")) {
				empList.sort((Employe e1, Employe e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
				empList.forEach(j -> {
					System.out.println("compare by first name : ------"+j.getFirstName());
				});
				
			}
			
			if (sortArr[i].equals("lastname")) {

				empList.sort((Employe e1, Employe e2) -> e1.getLastName().compareTo(e2.getLastName()));
				empList.forEach(j -> {
					System.out.println("compare by lastname----"+j.getLastName());
				});

			}
			if (sortArr[i].equals("country")) {

				empList.sort((Employe e1, Employe e2) -> e1.getCountry().compareTo(e2.getCountry()));
				empList.forEach(j -> {
					System.out.println("compare by country-"+j.getCountry());
				});

			}
			if (sortArr[i].equals("DOB")) {
				empList.sort((Employe e1, Employe e2) -> e1.getDOB().compareTo(e2.getDOB()));
				empList.forEach(j -> {
					System.out.println("compare by DOB-"+j.getDOB());
				});
			}

		}

	}

	private static List<Employe> loadListofEmployee() {

		Employe e1 = new Employe("apurva", "vyas", "07/04/1987", "india");
		Employe e2 = new Employe("pankaj", "shukla", "09/03/1983", "usa");
		Employe e3 = new Employe("bharat", "mathur", "11/04/1984", "uae");
		Employe e4 = new Employe("ishita", "bhat", "01/05/1989", "india");
		Employe e5 = new Employe("yasmin", "ojha", "09/06/1981", "germany");

		List<Employe> empList = Arrays.asList(e1, e2, e3, e4, e5);

		return empList;

	}

}
