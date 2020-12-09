
abstract class Student 
{
	Student()
	{
		System.out.println("hello");
	}
	abstract void show();
}

class Sample extends Student
{
	void show()
	{
		System.out.println("Sadashiv Ingale")
	}
}
public class Abstract_class {
public static void main(String[] args) {
	

	Student s=new Sample();
	s.show();
}
}