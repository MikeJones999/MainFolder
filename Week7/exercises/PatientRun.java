public class PatientRun
{
	
	private PatientList patientListStart;
	
	public static void main (String[] args)
	{
	
		PatientRun start = new PatientRun();
		
		start.launch();
	
	}
	
	
	public lunch()
	{
		this.patientListStart = new PatientList();
	}
	
	public void launch()
		{	
			Patient firstPatient = new Patient("John", 33, "Tuberculosis");
			this.patientListStart = firstPatient;
			
			Patient yetAnotherPatient = new Patient("Mary", 16, "Meningitis");
			this.patientListStart.addPatient(yetAnotherPatient);
			
			Patient yetAnotherPatient1 = new Patient("Dave", 26, "herpes");
			this.patientListStart.addPatient(yetAnotherPatient1);
			
			Patient yetAnotherPatient2 = new Patient("Paul", 33, "Genital Warts");
			this.patientListStart.addPatient(yetAnotherPatient2);
			
			Patient yetAnotherPatient3 = new Patient("Tom", 96, "Elephantism");
			this.patientListStart.addPatient(yetAnotherPatient3);
			
			Patient yetAnotherPatient4 = new Patient("Claire", 05, "Influenza");
			this.patientListStart.addPatient(yetAnotherPatient4);
			
			Patient yetAnotherPatient5 = new Patient("Susan", 26, "NoAssAtAll Syndrome");
			this.patientListStart.addPatient(yetAnotherPatient5);
			
			Patient yetAnotherPatient6 = new Patient("Pauline", 43, "Meningitis");
			this.patientListStart.addPatient(yetAnotherPatient6);
			
			Patient yetAnotherPatient7 = new Patient("Adrian", 36, "In growing toe nail");
			this.patientListStart.addPatient(yetAnotherPatient7);
			
			Patient yetAnotherPatient8 = new Patient("Dude", 52, "touretts");
			this.patientListStart.addPatient(yetAnotherPatient8);
			
			//iterates from the patient inserted onwards
			patientListStart.printPatient(firstPatient);
			
			boolean complete = patientListStart.deletePatient(yetAnotherPatient4);
			
			
			
			
			if (complete) 
			{
				patientListStart.printPatient(firstPatient);
				System.out.println(yetAnotherPatient4.getPatientName(yetAnotherPatient4) + "Has been removed from the system");
			} else 
					{
						System.out.println("Could not find " + yetAnotherPatient4.getPatientName(yetAnotherPatient4) + " in the System");
						
					};
			
		
	
		}
}