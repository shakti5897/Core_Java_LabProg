package lab9;

import java.util.*;

class Person{
	int uID;
	String name;
	int age;
	char gender;
	String city;

	Person(){

	}

	Person(int uID, String name, int age, char gender, String city){
		this.uID = uID;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [uID=" + uID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", city=" + city + "]";
	}

	//Age Getter
	public int getAge() {
		return age;
	}

	//Age Setter
	public void setAge(int age) {
		this.age = age;
	}

	//City Getter
	public String getCity() {
		return city;
	}

	//City Setter
	public void setCity(String city) {
		this.city = city;
	}

}

@FunctionalInterface
interface intf4{
	Person createPerson(int uID, String name, int age, char gender, String city);
}

@FunctionalInterface
interface intf{
	void ageSetter(int age);
}

@FunctionalInterface
interface intft{
	void citySetter(String city);
}
public class Exercise4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		intf4 f = Person::new;

		Person p1 = f.createPerson(100, "Palak", 23, 'M', "Varanasi");
		Person p2 = f.createPerson(101, "Shalini", 23, 'M', "Delhi");
		Person p3 = f.createPerson(102, "Aditya", 17, 'F', "Bangalore");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		intf f1 = p1::setAge;
		f1.ageSetter(21);

		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		intft f2 = p3::setCity;
		f2.citySetter("Mirzapur");

		System.out.println();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
} 