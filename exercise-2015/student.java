public class student {
    private String name, address;
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private final int MAX_COUNT = 30;

    public student(String name, String address){
        this.name = name;
        this.address = address;
        this.numCourses = 0;
        courses = new String[MAX_COUNT];
        grades = new int[MAX_COUNT];
    }
    
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return name+"("+address+")";
    }

    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;        
    }

    public void printGrades(){
        System.out.println("Name: "+name);
        for( int i = 0; i < numCourses; i++){
            System.out.printf("%s: %2d%n",courses[i],grades[i]);
        }
    }

    public double getAverageGrade(){
        double results = 0;
        for(int i = 0; i < numCourses ; i++){
            results += grades[i];
        }
        return results/numCourses;
    }

    public static void main(String[] args) {
        student natalie = new student("CHL", "Desapark City");
        student chester = new student("CMK", "Mont Kiara");

        natalie.addCourseGrade("Math", 100);
        chester.addCourseGrade("Math", 100);
        natalie.addCourseGrade("Physic", 98);
        chester.addCourseGrade("History", 99);
        // edit from here

        chester.setAddress("London");
        natalie.addCourseGrade("English", 100);


        // edit ends here
        System.out.println(natalie);
        natalie.printGrades();
        chester.printGrades();
        System.out.printf("%.2f%n",natalie.getAverageGrade());
        System.out.printf("%.2f%n",chester.getAverageGrade());
        System.out.println(chester);
        

    }
    
}
