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
		
	String getName(){
		return name;
	}
	int getExam1(){
		return exam1;
	}
	int getExam2(){
		return exam2;
	}
	int getExam3(){
		return exam3;
	}
	
	public static void main(String[] args){
	
		try{
		Student a1=new Student("Jhon",75,11,90);
		System.out.println("the name of the Student is "+ a1.getName()+". The exam score is "+ a1.getExam1());
		System.out.println("the name of the Student is "+ a1.getName()+". The exam score is "+ a1.getExam2());
		System.out.println("the name of the Student is "+ a1.getName()+". The exam score is "+ a1.getExam3());
		Student a2=new Student("Ann",75,80,-55);
		System.out.println("the name of the Student is "+ a2.getName()+". The exam score is "+ a2.getExam1());
		System.out.println("the name of the Student is "+ a2.getName()+". The exam score is "+ a2.getExam2());
		System.out.println("the name of the Student is "+ a2.getName()+". The exam score is "+ a2.getExam3());
		
		}
		catch(Exception e){
			System.out.println("Exception Message:"+e.getMessage());
		}
	
		

	}
	
}