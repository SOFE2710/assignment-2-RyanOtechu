package com.company;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Vector;


public class Department {
    private String name; // the name of school Dept of Computing and Info Science
    private String id; // short name for courses SOFE, ELEE, STAT, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.


    public Department(String name, String id) {

        this.name = name;

        this.id = id;

        registerList = new Vector<Student>();

        courseList = new Vector<Course>();

    }

    public void offerCourse(Course course){

        courseList.add(course);

    }

    public void printCoursesOffered(){

        for(int i = 0; i < courseList.size(); i++) {

            System.out.println(courseList.get(i).toString());

        }
    }

    public boolean isStudentRegistered(Student student){

        return registerList.contains(student);

    }

    public void registerStudentCourseInDepartment(Student student, Course course) {

        if(!registerList.contains(student)) {

            registerList.add(student);

        }
    }


    public void printStudentsByName(){

        for(int i = 0; i < registerList.size(); i++) {

            System.out.println(registerList.get(i).toString());

        }

    }

    public String getName() {

        return (name);

    }

    public String getId() {

        return(id);

    }

    public Vector studentsRegisteredInCourse(int code){

        //Vector<Student> StudentsReg = new Vector<Student>();

        for(int i = 0; i<courseList.size(); i++){

            if(courseList.get(i).getNumber() == code) {

                return courseList.get(i).getClassList();


            }
        }

        return null;

    }


    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students


        return ("\n" + id + ": " + courseList.size() + " courses, " + registerList.size() + " students");

    }




    public Course largestCourse() {

        Course returnCourse = courseList.get(0);

        for(int i = 1; i < courseList.size(); i++){

                if(returnCourse.numberOfStudents() < courseList.get(i).numberOfStudents())     {

                    returnCourse = courseList.get(i);

                }

        }

        return returnCourse;

    }

    public void printStudentsRegisteredInCourse(int code) {

        if(!(studentsRegisteredInCourse(code) == null)) {
            for (int i = 1; i < studentsRegisteredInCourse(code).size(); i++) {


                System.out.println(studentsRegisteredInCourse(code).get(i).toString() + "\n");


            }
        }else{

            System.out.println("No Students Registered");

        }

    }
}
