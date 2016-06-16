

public class Test1 {
	
	 int age=7;
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Test1()
	{
		this.age=1;
	}
	public Test1(int age)
	{
		
		this.age=age;
		System.out.println(age);
		
	}
	
	public static void main(String []args)
	{
		Test1 t=new Test1(8);
		Test1 t1=new Test1();
		System.out.println(t.getAge());
		System.out.println(t1.getAge());
		System.out.println("hi");
		
	}
}