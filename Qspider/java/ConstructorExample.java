class Student{
    String name;
    int id;
    Education edu;

    Student(String name,int id,Education edu){
        this.name=name;
        this.id=id;
        this.edu=new Education(edu.uni,edu.contact);  //Deep copy
    }

    Student(Student std){
        this.name=std.name;
        this.id=std.id;
        this.edu=new Education(std.edu.uni, std.edu.contact); // Creating a new Education object
    }

    public void displayStudent(){
        System.out.println("Name : " + name);
        System.out.println("id : " + id);
        edu.displayEdu();
    }
}

class Education{
    String uni;
    long contact;

    Education(String uni,long contact){
        this.uni=uni;
        this.contact=contact;
    }

    public void displayEdu(){
        System.out.println("University : "+ uni);
        System.out.println("Contact : "+contact);
    }
}

class ConstructorExample{
    public static void main(String[] args){

        Education edu=new Education("SPPU" , 722917);
        // edu.displayEdu();
        Student std=new Student("Piyu-puju",122,edu);
        std.displayStudent();
        System.out.println();

        System.out.println("After changes - copy constructor");
        Student copy=new Student(std);
        copy.name="piyu";
        copy.id=233;
        copy.edu.uni="DBATU";
        copy.edu.contact=87676081;
        copy.displayStudent();

        System.out.println();
        System.out.println("After changes - old constructor");
        std.displayStudent();
    }
}