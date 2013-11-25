public class PatientRun
{

//create an object patient named patient list - to place holder for the list to  begin
	private Patient patientListStart = null;
	
	public static void main (String[] args)
	{
	
		PatientRun start = new PatientRun();
		
		start.launch();
	
	}
	
	public void addPatient(Patient p)
	{
		if (patientListStart == null)
			{
			 //john becomes the head of the list. everything else get run on john 			 
			  patientListStart  = p;
			  return;
			}
		
		// johnObject.addpatient(MaryObject); 		
		patientListStart.addPatient(p);
		
	}
	
	
	public void launch()
		{	
			

			addPatient (Patient Pat1 = new Patient("John", 33, "Tuberculosis"));
			addPatient (Patient Pat2 = new Patient("Mary", 16, "Meningitis"));
			addPatient (Patient Pat3 = new Patient("Dave", 26, "herpes"));
			addPatient (Patient Pat4 = new Patient("Paul", 33, "Genital Warts"));
			addPatient (Patient Pat5 = new Patient("Tom", 96, "Elephantism"));
			addPatient (Patient Pat6 = new Patient("Claire", 05, "Influenza"));
			addPatient (Patient Pat7 = new Patient("Claire", 05, "Influenza"));
			addPatient (Patient Pat8 = new Patient("Susan", 26, "NoAssAtAll Syndrome"));
			addPatient (Patient Pat9 = new Patient("Pauline", 43, "Meningitis"));
			addPatient (Patient Pat10 = new Patient("Adrian", 36, "In growing toe nail"));			
			addPatient (Patient Pat11 = new Patient("Dude", 52, "touretts"));
			

			//iterates from the patient inserted onwards
			patientListStart.printPatient(patientListStart);
			
			
			boolean complete = patientListStart.deletePatient(Pat6);
			
			
			
			
			if (complete) 
			{
				 patientListStart.printPatient(patientListStart);
				 System.out.println(Pat6.getPatientName(Pat6) + "Has been removed from the system");
			} else 
					{
						System.out.println("Could not find " + Pat6.getPatientName(Pat6) + " in the System");
						
					 };
			
		
	
		}
}