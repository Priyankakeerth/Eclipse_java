package exception_file.org;

public class InsufficientBalanceException extends Exception {  //every userdefined exception extends the base exception class
double amt;  //global variable
	
InsufficientBalanceException (double amount)

	{
	amt=amount;
	//local variable
	}
}
