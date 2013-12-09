
public class PatientManager 
{

	public static void main (String[] args)
	{
		
		new PatientManager().start();
		
		
	}
	
	public void start()
	{
		PatientList list1 = new PatientList();
		
		Patient p1 = new Patient();
		p1.setName("Mike");
		
		Patient p2 = new Patient();
		p2.setName("Leah");
		
		Patient p3 = new Patient();
		p3.setName("Dave");
		
		
		Patient p4 = new Patient();
		p4.setName("Martin");
		
		Patient p5 = new Patient();
		p5.setName("John");
		
		list1.addPatient(p1);
		list1.addPatient(p2);
		list1.addPatient(p3);
		list1.addPatient(p4);
		list1.addPatient(p5);
		
		list1.printList();
		
		list1.removePatient("Leah");
		
		System.out.println();
		list1.printList();
		
		list1.removePatient("Mike");
		
		System.out.println();
		list1.printList();
		
		
		list1.removePatient("John");
		
		System.out.println();
		list1.printList();
		
		
		//generics
		
		ListTypeChange<Patient> list2 = new PatientList<Patient>();
		
		
	}
	
	
}
