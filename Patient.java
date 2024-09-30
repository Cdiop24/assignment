package classwork;

	public class Patient {
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String streetAddress;
	    private String city;
	    private String state;
	    private String zip;
	    private String phoneNumber;
	    private String emergencyContactName;
	    private String emergencyContactPhone;

	    // No-arg constructor
	    public Patient() {
	    }

	    // Constructor with first, middle, and last name
	    public Patient(String firstName, String middleName, String lastName) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	    }

	    // Constructor with all attributes
	    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String zip, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.streetAddress = streetAddress;
	        this.city = city;
	        this.state = state;
	        this.zip = zip;
	        this.phoneNumber = phoneNumber;
	        this.emergencyContactName = emergencyContactName;
	        this.emergencyContactPhone = emergencyContactPhone;
	    }

	    // Accessors (getters)
	    public String getFirstName() { return firstName; }
	    public String getMiddleName() { return middleName; }
	    public String getLastName() { return lastName; }
	    public String getStreetAddress() { return streetAddress; }
	    public String getCity() { return city; }
	    public String getState() { return state; }
	    public String getZip() { return zip; }
	    public String getPhoneNumber() { return phoneNumber; }
	    public String getEmergencyContactName() { return emergencyContactName; }
	    public String getEmergencyContactPhone() { return emergencyContactPhone; }

	    // Mutators (setters)
	    public void setFirstName(String firstName) { this.firstName = firstName; }
	    public void setMiddleName(String middleName) { this.middleName = middleName; }
	    public void setLastName(String lastName) { this.lastName = lastName; }
	    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }
	    public void setCity(String city) { this.city = city; }
	    public void setState(String state) { this.state = state; }
	    public void setZip(String zip) { this.zip = zip; }
	    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
	    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }
	    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }

	    public String buildFullName() {
	        return firstName + " " + middleName + " " + lastName;
	    }

	    public String buildAddress() {
	        return streetAddress + " " + city + " " + state + " " + zip;
	    }

	    public String buildEmergencyContact() {
	        return emergencyContactName + " " + emergencyContactPhone;
	    }

	    public String toString() {
	        return "Name: " + buildFullName() + "\nAddress: " + buildAddress() + "\nPhone: " + phoneNumber + "\nEmergency Contact: " + buildEmergencyContact();
	    }
	}



