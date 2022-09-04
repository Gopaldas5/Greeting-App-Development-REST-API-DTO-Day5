package com.bridgelabz.greetingappdevelopmentdto_day4.model;

import com.bridgelabz.greetingappdevelopmentdto_day4.dto.GreetingDTO;

import javax.persistence.*;

@Entity
public class GreetingData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private int id;
    private String firstName;
    private String lastName;
    private String message;
    private String address;

    public GreetingData(int id, String firstName, String lastName, String message, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
        this.address = address;
    }
    public GreetingData() {

    }
//    public GreetingData(GreetingDTO greetingDTO) {
//
//    }

    public GreetingData(GreetingDTO greetingDTO) {
        this.firstName = greetingDTO.getFirstName();
        this.lastName = greetingDTO.getLastName();
        this.message = greetingDTO.getMessage();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "GreetingData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", message='" + message + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
