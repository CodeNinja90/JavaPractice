import java.io.*;




public class Employee {


    String name;
    int age;
    String designation;
    double salary;

    public void setName(String name){

        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDesignation(String designation){

        this.designation = designation;
    }

    public void setSalary(double salary){

        this.salary = salary;
    }

    public void printEmployeeInfo() {

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:" + designation);
        System.out.println("Salary:" + salary);

    }



    }


