package core;

public class StudentIdNotFoundation  extends Exception
{
	int sid;
	 StudentIdNotFoundation()
	{
}
public  StudentIdNotFoundation(int sid)
{
	this.sid = sid;
	
}
@Override
public String getMessage() {
	return "student with id "+sid+" Not found";
	
}
@Override
public String toString() {
	return "Student id not Found";
	
}

}



