class Roll
{
	int rollno;
	public Roll()
	{
		rollno=0;
	}
	public Roll(int rn)
	{
		rollno=rn;
	}
	public Roll(Roll r1)
	{
		rollno=r1.rollno;
	}
}
class Result extends Roll
{
	int marks;
	public Result()
	{
		marks=0;
	}
	public Result(int rn,int mks)
	{
		super(rn);
		marks=mks;
	}
	public Result(Result rs)
	{
		super(rs);
		marks=rs.marks;
	}
}
class Student extends Result
{
	String name;
	public Student()
	{
		name="unknown";
	}
	public Student(int rn,String nm,int mks)
	{
		super(rn,mks);
		name=nm;
	}
	public Student(Student s)
	{
		super(s);
		name=s.name;
	}
	public void show()
	{
		System.out.println("Rollno:"+rollno+"NAme:"+name+"Marks:"+marks);
	}
}
class RollNoMksResult
{
	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println("First students is");
		s1.show();
		Student s2=new Student(1,"john",90);
			System.out.println("sec students is");
		s2.show();
		
			Student s3=new Student(s2);
				System.out.println("3rd students is");
				s3.show();
	}
}