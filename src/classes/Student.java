/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author john
 */
public class Student implements java.io.Serializable {

    private final int code;

    private String name;
    private String phone;
    private String address;

    public Student(int code, String name, String phone, String address) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    //GETTERS SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCode() {
        return code;
    }

}
