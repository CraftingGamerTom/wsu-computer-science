package TestEight;

/**
A computer class has a title, time and room
*/
public class ClassSchedule
{  
private String title;
private String days;
private String startTime;
private String endTime;
private String room;

/**
   Constructs a computer class with title, days, time and room
*/
public ClassSchedule(String classTitle, String meetingDays, String aStartTime, String anEndTime, String classRoom)
{   
  // your work here
  title = classTitle;
  days = meetingDays;
  startTime = aStartTime;
  endTime = anEndTime;
  room = classRoom;
}

/**
   Gets the title
   @return the title
*/
public String getTitle()
{   
   return title;
   
}

/**
   Gets the time in the form "days start time-end time"
   @return the time
*/
public String getTime()
{   
   // your work here
   String time = days + " " + startTime + "-" + endTime;
   return time;
}

/**
   Gets the room
   @return the room
*/
public String getRoom()
{   
   return room;

}
}
