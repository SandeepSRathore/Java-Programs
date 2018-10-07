import java.util.*;
class School
{
	public static void main(String args[])
	{
	HashMap map=new HashMap();
	Student s1=new Student("raju","9887644");
	map.put("102",s1);
	Student s2=new Student("raj","98644");
	map.put("104",s2);
	Student s3=new Student("rju","87644");
	map.put("109",s3);
	Student x;
	x=(Student)map.get("104");
	x.show();
	x=(Student)map.get("102");
	x.show();
	}
}