/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author john
 */
public class Assistance implements java.io.Serializable {

    final Date date;
    private LinkedList<Student> students = new LinkedList<>();

    public Assistance(Date date) {
        this.date = date;
    }

    //GETTES SETTERS
    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudent(Student student) {
        students.add(student);
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

}
