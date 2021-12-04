package com.company;
import java.util.Vector;
public class Student extends Person{
    private String id;
    private String name;
    private Vector<Course> courses; // contains all courses the student is registered in
    public int num = 0;

    public Student(String stdId, String stdName) {

        this.id = stdId;

        this.name = stdName;

        courses = new Vector<Course>();

    }

    public void registerFor(Course course){

        if(!courses.contains(course)) {

            courses.add(course);
        }else{

            System.out.println("Already Registered for that course");

        }
    }

    public boolean isRegisteredInCourse(Course course){

        return courses.contains(course);

    }


    public String getName() {

        return(name);

    }

    public String getId() {

        return(id);

    }




    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        String regCourse = "";

        for(int i = 0; i < courses.size(); i++){

            regCourse = regCourse + courses.get(i).getCode() + " " + courses.get(i).getNumber() + ", ";

        }

        return (id + " " + name + "\n" + "Registered courses: " + regCourse);
    }


}
