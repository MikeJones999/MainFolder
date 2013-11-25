class PatientList
{
	
	private Patient nextPatient;
	
	public PatientList()
	{
		this.nextPatient = null;
	}
		
	
	
// this is a member method of class Patient - therefore can use its methods
	public void addPatient(Patient newPatient)
	{
		//if newPatientl object's "next patient" is null - means no one after it 
		if(this.nextPatient == null)
		{
			//nothing after patient so add this one after it. list grows by 1
			this.nextPatient = newPatient;		
		} 
		else //there is something next to patient
		{
			//call this again, moving one and adding our patient
			this.nextPatient.addPatient(newPatient);
		};	
	}
	
	 //enter the first patient - it then prints their details - checks if nextPatient is empty - 
	 //if not call this method again inserting the object found in the nextList.
	 public void printPatient(Patient newPatient) 
	 {
			System.out.println("---------------------------");
			System.out.println("\nNew Patient");
			System.out.println("---------------------------");
			
		System.out.println("Patient Name : " + newPatient.name);
		System.out.println("Age: " + newPatient.age);
		System.out.println("Illness: " + newPatient.illness);
	
		if (newPatient.nextPatient != null)
		{	
		
			nextPatient.printPatient(newPatient.nextPatient); 
		} else 
			{ 
				System.out.println("\n***********************");
				System.out.println("End of list");
			}
		
	 }
	
	
	public String getPatientName(Patient currentPatient)
	{
		return currentPatient.name;	
	}
	
		// this is a member method of class Patient
		// returns true if the patient was found and removed, false otherwise
		public boolean deletePatient(Patient patient)
		{
			if (this.nextPatient == null) 
			{
				// patient to remove was not found
				return false;
			}
			else if (this.nextPatient.name.equals(patient.name)) 
					{
						// We found it! It is the next one!
						// Now link this patient to the one after the next
						this.nextPatient = nextPatient.nextPatient;
						return true;
					} 
					else 
						{
							return this.nextPatient.deletePatient(patient);
						}
		}
}