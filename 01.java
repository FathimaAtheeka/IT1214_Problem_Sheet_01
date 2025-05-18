class Student{
    private int studentId;
    private String name;
    private int daysAttended;

    Student(int studentId, String name, int daysAttended){
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
    public void setName(String Name){
        this.name=name;
    }
    public int getDaysAttended(){
        return daysAttended;
    }
    public void setDaysAttended(int daysAttended){
        this.daysAttended=daysAttended;
    }
    

    public static void main(String[] args){
        
    }
}
