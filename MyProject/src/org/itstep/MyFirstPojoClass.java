package org.itstep;

public class MyFirstPojoClass {

 String name = "kzjedbfhjsf";
 int someNumber = 245452142;
 double someDouble = 123.25;
 char someChar = '@';
 boolean someBoolean = true; // false;
 String email;
 
 
 void printFields() {
  System.out.println("Hi!");
 }
 
 String getEmail(String name, String domain) {
  String email = name + "@" + domain;
  return email;
 }
}