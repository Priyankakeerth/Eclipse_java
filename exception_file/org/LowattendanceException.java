package exception_file.org;

public class LowattendanceException extends RuntimeException {
	LowattendanceException(String msg)
	{
		System.err.println(msg);
	} 
	public LowattendanceException() {
		// TODO Auto-generated constructor stub
	}
	public void allowForExams(int attendance)
	  {
	    
	    if(attendance>=75)
	    {
	      System.out.println("Permit Students");
	    }
	    else
	    {
	    	//try
	    	//{
	     // LowattendanceException lae= new  LowattendanceException();
	    		throw  new  LowattendanceException("low attn issue"); //ananymous object
	      //throw lae;  //user defined exception
	    	//}
	    	//catch(LowattendanceException ll)
	    	//{
	    		//System.out.println("Check Attandance");
	    	//}
	    }

	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
