package com;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class project {
		@Id
	    private int uid;
	    private String name;
	    private String design;
	    private int salary;
	    private int Age;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesign() {
			return design;
		}
		public void setDesign(String design) {
			this.design = design;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
	}
	    
	    
	    
	

