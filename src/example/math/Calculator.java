package math;

public class Calculator {
  
 public double add(double a, double b) {
  return a + b;
 }
  
 public double subtract(double a, double b) {
  return a - b;
 }
  
 public double multiply(double a, double b) {
  return a * b;
 }
  
 public double divide(double a, double b) { 
  if(b == 0) {
   throw new ArithmeticException();
  }
  return a / b;
 }
  
}

/* The code below will print the words Hello World
to the screen, and it is amazing 19 June 2021*/
