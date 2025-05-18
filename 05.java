class Student{
	private String name;
	private int exam1 ;
	private int exam2 ;
	private int exam3 ;
	
	boolean validateMarks(int marks){
		if(marks<=100 && marks>=0){
			return true;
		}
		else{
			return false;
		}
	}
	
	Student(String name,int e1,int e2,int e3)throws Exception{
		this.name=name;
		
		if(validateMarks(e1)&&validateMarks(e2)&&validateMarks(e3)){
			exam1=e1;
			exam2=e2;
			exam3=e3;
		}
		else{
			System.out.println("Setting the marks value to 0");
			throw new Exception("Invalid Marks!");
		}
	}
	Student(){}
		
	public String getName(){
		return name;
	}
	public int getExam1(){
		return exam1;
	}
	public int getExam2(){
		return exam2;
	}
	public int getExam3(){
		return exam3;
	}

	public double calculateAverage(){
		return (exam1+exam2+exam3)/3.0;
	}
	
}

class StudentGradeCalculator{
	public static void main(String[] args){
	
		try{
		Student s1=new Student("Jhon",75,110,90);
		System.out.println("Student name is"+s1.getName()+". Student Average score is:"+s1.calculateAverage());
		
		}
		catch(Exception e){
			System.out.println("Exception Message:"+e.getMessage());
		}
	
		

	}
}