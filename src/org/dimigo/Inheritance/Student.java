package org.dimigo.Inheritance;

public class Student extends Person {
    private String studentid;

    public Student(String name, int age, int height, int weight, String studentid) {
        super(name, age, height, weight);
        this.studentid = studentid;
    }

    public void study(){
        System.out.println(getName()+"이 공부를 한다.");
    }

    public void eatSnack(){
        System.out.println(getName()+"이 과자를 먹는다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                super.toString();
    }
}
