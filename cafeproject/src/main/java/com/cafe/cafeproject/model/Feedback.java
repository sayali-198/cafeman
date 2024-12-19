package com.cafe.cafeproject.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Feedback {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int regid;
private String emailid,message;
public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}
public Feedback(String emailid,String message) {
	super();
	this.emailid = emailid;
	this.message = message;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getmessage() {
	return message;
}
public void setPassword(String password) {
	this.message = message;
}
@Override
public String toString() {
	return "Registration [regid=" + regid + ", emailid=" + emailid + ", message=" + message + "]";
}
}

