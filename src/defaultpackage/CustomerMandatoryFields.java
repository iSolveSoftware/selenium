package defaultpackage;

public class CustomerMandatoryFields {
	// customer1
	void submitmethod(String name, String adress) {
		System.out.println("From First Method:"+ name + "," + adress );
	}

	// customer2 {
	void submitmethod(String name, String adress, int mobno, int age, int pincod) {
		System.out.println("From Second Method:"+ name + "," + adress + "," + mobno + "," + age + ","+ pincod );
	}

	//Testing
	public static void main(String args[]) {
		CustomerMandatoryFields obj1 = new CustomerMandatoryFields();
		obj1.submitmethod("Madhuri", "Dallas");
		obj1.submitmethod("Madhuri", "Dal", 4534, 0, 34233);
	}
}