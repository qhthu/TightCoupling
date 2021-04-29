package demo.spring.tightcoupling;


interface People{
    public void show();
}

class Student implements People{
    public void show(){
        System.out.println("This is a Student!!");
    }
}

class Employee implements People{
    public void show(){
        System.out.println("This is a Employee!!");
    }
}
public class LooseCoupling {

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }

}
