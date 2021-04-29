package demo.spring.tightcoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication

class People{
    private Integer id;
    private String name;

    Student stu = new Student();
    public void start(){
        stu.show();
    }

}

class Student{
    private Integer grade = 12;

    public void show(){
        System.out.println("Lop: "+grade);
    }

}
public class TightcouplingApplication {


    public static void main(String[] args) {
//        SpringApplication.run(TightcouplingApplication.class, args);
        People p = new People();
        p.start();
    }

}
