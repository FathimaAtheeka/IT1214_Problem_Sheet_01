class Student{
    private int studentId;
    private String name;
    private int daysAttended;

    public Student(int studentId, String name, int daysAttended){
        this.studentId=studentId;
        this.name=name;
        this.daysAttended=daysAttended;
    }

    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getDaysAttended(){
        return daysAttended;
    }
    public void setDaysAttended(int daysAttended){
        this.daysAttended=daysAttended;
    }
    public String displayDetails(){
        return "Student Id: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended;
    }
}

class Classroom{
    private Student[] students;
    private int studentCount;

    public Classroom(){
        students = new Student[10];
        studentCount = 0;
    }

    public void addStudent(Student student){
        if(studentCount < students.length){
            students[studentCount] = student;
            studentCount++;
        }
        else{
            System.out.println("Classroom is full.Cannot add more students.");
        }
    }
    public void updateDaysAttended(int studentId, int newDaysAttended){
        for (int i =0; i < studentCount; i++){
            if (students[i].getStudentId() == studentId){
                students[i].setDaysAttended(newDaysAttended);
                return;//stop further execution of the method
            }
            
        }
        System.out.println("Student with ID "+ studentId + "does not exist.");
    }
    public void displayAllStudents(){
        for (int i=0; i < studentCount; i++){
            System.out.println(students[i].displayDetails());
        }
    }

}

class StudentAttendenceManagement{
    public static void main(String[] args){
        Classroom classroom = new Classroom();

        Student student1 = new Student(101, "Alice Smith", 12);
        Student student2 = new Student(102, "Bob Jones", 15);
        Student student3 = new Student(103, "Carol Lee", 10);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);


        classroom.updateDaysAttended(102,16);
        classroom.updateDaysAttended(104,8);
        classroom.displayAllStudents();
    }
}