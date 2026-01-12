class StudentInfo {
    private String name;
    private int rollnumber;
    private int grade;

    StudentInfo(String name, int rollnumber, int grade) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }
    StudentInfo(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade=23;
    }
    void displaydetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll Number: " + this.rollnumber);
        System.out.println("Grade: " + this.grade);
    }
      
    void isPassed() {
        if(this.grade>=40){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
    }

    void gracemark(){
        this.grade=this.grade;

    }

}

class student {

    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("saquib", 101, 75);
        StudentInfo s2= new StudentInfo("sushant", 102, 33);
        StudentInfo s3 = new StudentInfo("sanya", 22);

        s1.gracemark();
        s1.displaydetails();
        s1.isPassed();
        

        System.out.println("\n");
         s2.gracemark();
         s2.displaydetails();
         s2.isPassed();

          System.out.println("\n");
          s3.displaydetails();
          s3.isPassed();


        
    }
}
