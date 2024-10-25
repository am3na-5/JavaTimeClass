//Time class.  
 public class Time {

	private int hour;
	private int minute;
	private int second;
	
	//Time eocnstructor that intializes each instance variable to 0.
	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	//constructor sets instance varaibles using three integer parameters.

	public Time(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) { 
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.err.println("Invalid time input. Exiting."); 
            System.exit(0); 
        }
    }
	
	
	//Accessor methods to get each instance variable 
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}

	//Mutator methods to set hours variable appropriately (between 0-24) with error handling. 
	public void setHour(int hour) {
		if (hour>= 0 && hour <24){
			this.hour=hour; 
		}else{ 
			System.err.println("Error. Invalid input. Exiting.");
			System.exit(0); 

		}
	}

	//Mutator methods to set mintutes variable appropriately (between 0-60) with error handling.
	public void setMinute(int minute) {
		if (minute>=0 && minute<60){ 
			this.minute= minute; 
		}else{ 
			System.err.println("Error. Invalid input. Exiting.");
			System.exit(0); 

	}}
	
	
	//Mutator methods to set seconds variable appropriately (between 0-60) with error handling.
	public void setSecond(int second) {
		if (second>=0 && second<60){ 
			this.second= second; 
		}else{ 
			System.err.println("Error. Invalid input. Exiting.");
			System.exit(0); 
		}
	}
	//Method returns string with the time giving two digits for each variable.  
	public String toUniversalString(){ 
		return String. format(" %02d:%02d:%02d", hour, minute, second);
	}
	
	//Method returns string in standard time format.   
	public String toString(){
	int standHour= (hour%12==0)? 12 : hour % 12;  
	String aM_pM= (hour<12)? "AM" :"PM"; 
	return String.format("%d: %02d:%02d %s", standHour, minute, second, aM_pM);	
}

	//Method increments seconds variable by 1 and carries-over any value >= 60. 
	public void tick(){ 
	second++; 
	if (second>=60){   
		second= 0; 
		incrementMinute();
	}
	}
	
	//Method increments minutes variable by 1 and carries-over any value >= 60. 
	public void incrementMinute(){ 
	minute++; 
	if(minute>=60) {  
		minute=0; 
		incrementHour();

}
}	

//Method increments hours variable by 1 and carries-over any value >=24. 
public void incrementHour(){
	hour++; 
	if(hour>=24){ 
		hour=0; 
	}
}	

//Method takes another time object and compare it to current time object to see if they are equal.
public boolean isEqual(Time  other){ 
 return (this.hour == other.hour && this.minute == other.minute && this.second == other.second); 
 
}

//Method within the class checks if the time is valid (wihtin the correct ranges).  
private boolean isValidTime (int hour,int minute, int second){
	return (hour>=0 && hour <24) && (minute >=0 && minute<60) && (second>=0 && second<60); 
}
	}
 
