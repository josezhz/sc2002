package lab4p1;

public class SalePerson implements Comparable<SalePerson> {
	private String firstName;
	private String lastName;
	private int totalSales;

	public SalePerson(String fn, String ln, int ts) {
		firstName = fn;
		lastName = ln;
		totalSales = ts;
	}

	public String toString() {
		return lastName + " , " + firstName + " : " + totalSales;
	}

	public boolean equals(SalePerson o) {
		return o.getFirstName() == firstName;
	}

	public int compareTo(SalePerson o) {
		return totalSales - o.getTotalSales();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getTotalSales() {
		return totalSales;
	}
}
