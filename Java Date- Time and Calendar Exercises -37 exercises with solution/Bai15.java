package javaDateTimeandCalendarExercises;

import java.time.LocalTime;

public class Bai15 {
	  public static void main(String[] args)
	    {
	      LocalTime time = LocalTime.now(); 
	      // adding four hours
	      LocalTime newTime = time.plusHours(4);
	      System.out.println();
	      System.out.println("Time after 2 hours : " + newTime);
	      System.out.println();
	    }
}
