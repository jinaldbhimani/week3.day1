package studentinfo;

public class StudentInfo {
	
	public void getStudentInfo(int id)
	{
		System.out.println("stident id is" + id);
	
	}
public void getStudentInfo(int id,String name)
{
	System.out.println("stident id is" + id);
	System.out.println("student name is" + name);
}
public void getStudentInfo(String email,long phone)
{
System.out.println("student email id is " +email);	
System.out.println("student phone number is" + phone);
}

public static void main(String[] args) {
	StudentInfo info=new StudentInfo();
	info.getStudentInfo(11042);
	info.getStudentInfo(11042, "jinal");
	info.getStudentInfo("jinal93bhimani@gmail.com",2049515923);
	
}
}
