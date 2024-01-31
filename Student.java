package pkg1;

public class Student {

		private int id;

		private String name;

		private int age;

		public Student(int id, String name, int age) {

		this.id = id;

		this.name = name;

		this.age = age;

		}

		public void display() {

		System.out.println("ID: " + id);

		System.out.println("Name: " + name);

		System.out.println("Age: " + age);

		}

		}

		//pkg1.Undergraduate.java

		//package pkg1;

		 class Undergraduate extends Student {

		private String major;

		public Undergraduate(int id, String name, int age, String major) {

		super(id, name, age);

		this.major = major;

		}

		public void displayMajor() {

		System.out.println("Major: " + major);

		}

		}

		//pkg1.Graduate.java

		//package pkg1;

		 class Graduate extends Student {

		private String advisor;

		public Graduate(int id, String name, int age, String advisor) {

		super(id, name, age);

		this.advisor = advisor;

		}

		public void displayAdvisor() {

		System.out.println("Advisor: " + advisor);

		}

		}




