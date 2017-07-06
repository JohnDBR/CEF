/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.LinkedList;
import validations.Validation;

/**
 *
 * @author john
 */
public class Manager extends Validation {

    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Assistance> assistances = new LinkedList<>();
    private LinkedList<Invoice> invoices = new LinkedList<>();

    private int studentCode;
    private int invoiceCode;

    public Manager() {
        setStudentCode();
    }

    //CREATE
    public boolean createStudent(String name, String phone, String address) {
        if (validateName(name) && validateCellphone(phone) && !address.isEmpty()) {
            students.add(new Student(studentCode, name, phone, address));
            studentCode++;
            return false;
        }
        return false;
    }

    public boolean createAssistance(String date) {
        if (validateDateFormat(date)) {
            assistances.add(new Assistance(date))
        }
        return true;
    }

    //READ
    //UPDATE 
    //DELETE
    //OTHER MANAGER OPERATIONS
    private void setStudentCode() {
        int maxCode = -9999;
        for (Student student : students) {
            if (maxCode < student.getCode()) {
                maxCode = student.getCode();
            }
        }
        if (maxCode == -9999) {
            maxCode = 0;
        } else {
            maxCode++;
        }
        studentCode = maxCode;
    }
}
