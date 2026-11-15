// Write a program to identify Class and Object

//class: blueprint object: actual thing created using that blueprint

class Student{
    String name;
    int age;

    void displayDetails(){
        name = "Lavanya";
        age = 19;

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
    public static void main(String[] args){
        Student s1 = new Student();

        s1.displayDetails();
    }
}