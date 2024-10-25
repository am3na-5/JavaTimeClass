public class TimeTest {
    public static void main(String[] args){ 
    /*Two time objects created; one that calls constructor with zero arguments (t1)
     and the other that calls the three parameter constructor(t2) */    
    Time t1= new Time(); 
    Time t2= new Time (12, 50, 8); 

    //Prints t1 and t2 in Universaland Standard Format. 
    System.out.println ("T1 in Universal Format: " +t1.toUniversalString());
    System.out.println ("T1 in Standard Format: " +t1.toString());

    System.out.println ("T2 in Universal Format: " +t2.toUniversalString());
    System.out.println ("T2 in Standard Format: " +t2.toString());


    //Set t1 to random time. 
    t1.setHour(12);
    t1.setMinute(17);
    t1.setSecond(49); 

    //Seconds tick method test: prints t1 before and after tick is applied. 
    System.out.println("T1 before seconds increment tick" +t1.toUniversalString());
    t1.tick(); //should increment by one second  
    System.out.println("T1 after seconds increment tick" +t1.toUniversalString());
    
    //Minues Tick method test: prints t2 before and after tick is applied.
    System.out.println("T2 before minutes increment tick" +t2.toUniversalString());
    t2.incrementMinute(); 
    System.out.println("T2 After minutes increment tick"+t2.toUniversalString());

    //Hours Tick method test: prints t2 before and after tick is applied.
    System.out.println("T2 before hours increment tick" +t2.toUniversalString());
    t2.incrementHour(); 
    System.out.println("T2 after hours increment tick:"+t2.toUniversalString()); 

//Method checks if t1 and t2 are equal. 
System.out.println(" T1 is equal to T2:" +t1. isEqual(t2)); 
    }
    
}
