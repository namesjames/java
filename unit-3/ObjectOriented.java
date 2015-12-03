// mouse.java
public class Mouse extends Rodentia {

	String name;

	public Mouse(String name) {

		this.name = name;

	}

	public void eat() {

		System.out.println(name + " ate some cheese pizza!");

	}

	public void solveMaze(int minutes) {

		System.out.println(name + " solved the maze in " + minutes + " minutes!");

	}

	public static void main(String[] args) {

		Mouse ratly = new Mouse("Ratly");
		ratly.eat();
		ratly.solveMaze(3);
		ratly.order();

	}

}

// Rodentia.java

public class Rodentia {

	public static void main(String[] args) {

	}

	public void order() {

		System.out.println("This animal belongs to the Rodentia order.");

	}

}

// 3.2

class Dog {

	public static void main(String[] args) {

	}

}

// 3.3 

class Dog {

	public Dog() {

}

// 3.4

class Dog {
	int age;

	public Dog() {
  }
	public static void main(String[] args) {

}

// 3.5

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge;  
  }
}

// 3.6

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 

			public static void main(String[] args) {

		} 
  }
}

// 3.7

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 
  }
			public static void main(String[] args) {

				Dog spike = new Dog(5);
		
      }
}

// 3.8 

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 
  }

	public void bark() {
	System.out.println("Woof!");
	}
			public static void main(String[] args) {

				Dog spike = new Dog(5);
		
      }
}

// 3.9

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 
  }

	public void bark() {
	System.out.println("Woof!");
	}
			public static void main(String[] args) {

				Dog spike = new Dog(5);
				spike.bark();
      }
}

// 3.10

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 
  }

	public void bark() {
	System.out.println("Woof!");
	}

	public void run(int feet) {
	System.out.println("Your dog ran " + feet + " feet!");
	}
			public static void main(String[] args) {

				Dog spike = new Dog(5);
				spike.bark();
				spike.run(17);
      }
}

// 3.11

class Dog {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 
  }

	public void bark() {
	System.out.println("Woof!");
	}

	public void run(int feet) {
	System.out.println("Your dog ran " + feet + " feet!");
	}

	public int getAge() {

    return age;

	}
			public static void main(String[] args) {

				Dog spike = new Dog(5);
				spike.bark();
				spike.run(17);

				int spikeAge =
				spike.getAge();
				System.out.println(spikeAge);
      }
}

// 3.12

class Dog extends Animal {
	int age;

	public Dog(int dogsAge) {
	
  	age = dogsAge; 
  }

	public void bark() {
	System.out.println("Woof!");
	}

	public void run(int feet) {
	System.out.println("Your dog ran " + feet + " feet!");
	}

	public int getAge() {

    return age;

	}
			public static void main(String[] args) {

				Dog spike = new Dog(5);
				spike.bark();
				spike.run(17);
				spike.checkStatus();
				int spikeAge =
				spike.getAge();
				System.out.println(spikeAge);
      }
}

// 3.13

class Coffee extends Beverage{
	
	public Coffee() {

	}
	
	public void addSugar(int cubes) {

		System.out.println("You added " + cubes + " sugar cubes.");

	}

	public static void main(String[] args) {
		
		Coffee myOrder = new Coffee();
		myOrder.addSugar(2);
		myOrder.isFull(); 
	}
}
