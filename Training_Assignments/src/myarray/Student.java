package myarray;

public class Student {
	
	  int id;
	  String name; 
	  String hobbies[];
	  
	public Student(int id,String name,String[] hobbies)
	{
		this.id=id;
		this.name=name;
		this.hobbies=hobbies;
	}
	
	public void getStud()
	{
		System.out.println("StudId:"+id);
		System.out.println("StudName:"+name);
		System.out.println("hobbies:");
		for(int i=0;i<hobbies.length;i++)
		{
			System.out.println(hobbies[i]+" ");
		}
	}

	public static void main(String[] args) {
		Student[] s=new Student[2];
		
		String[] hobby1= {"Reading","Drawing"};
		String[] hobby2= {"Cooking","Singing"};
		
		s[0]=new Student(123,"Charan",hobby1);
		s[1]=new Student(122,"Shaan",hobby2);
		
		s[0].getStud();
		
		s[1].getStud();
		
	}

}
