public class DoublePatientRun
{
	private DoublePatient patientListStart;
	
	public static void main (String[] args)
	{
		DoublePatient patientListStart = new DoublePatient();
	
		DoublePatientRun start = new DoublePatientRun();
		
		start.launch();
	
	}
	
	public void launch()
		{	
			DoublePatient firstPatient = new DoublePatient("John", 33, "Tuberculosis");
			patientListStart = firstPatient;
			
			DoublePatient yetAnotherPatient = new DoublePatient("Mary", 16, "Meningitis");
			patientListStart.addPatient(yetAnotherPatient);
			
			DoublePatient yetAnotherPatient1 = new DoublePatient("Dave", 26, "herpes");
			patientListStart.addPatient(yetAnotherPatient1);
			
			DoublePatient yetAnotherPatient2 = new DoublePatient("Paul", 33, "Genital Warts");
			patientListStart.addPatient(yetAnotherPatient2);
			
			DoublePatient yetAnotherPatient3 = new DoublePatient("Tom", 96, "Elephantism");
			patientListStart.addPatient(yetAnotherPatient3);
			
			DoublePatient yetAnotherPatient4 = new DoublePatient("Claire", 05, "Influenza");
			patientListStart.addPatient(yetAnotherPatient4);
			
			DoublePatient yetAnotherPatient5 = new DoublePatient("Susan", 26, "NoAssAtAll Syndrome");
			patientListStart.addPatient(yetAnotherPatient5);
			
			DoublePatient yetAnotherPatient6 = new DoublePatient("Pauline", 43, "Meningitis");
			patientListStart.addPatient(yetAnotherPatient6);
			
			DoublePatient yetAnotherPatient7 = new DoublePatient("Adrian", 36, "In growing toe nail");
			patientListStart.addPatient(yetAnotherPatient7);
			
			DoublePatient yetAnotherPatient8 = new DoublePatient("Dude", 52, "touretts");
			patientListStart.addPatient(yetAnotherPatient8);
			
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