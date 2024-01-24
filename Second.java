abstract class Main{
public String name = "John";
public int age = 25;
public abstract void run();
}

class Student extends Main
{
   public int salary = 50000;
public void run()
{
   System.out.println("Thid is Abstract Method.");
}
}

class Second{
public static void main(String[]args){
Student myObj = new Student();
System.out.println("My Name is "+ myObj.name +"  "+ "Age is " + myObj.age);
System.out.println("Salary is  " + myObj.salary);
myObj.run();
}
}