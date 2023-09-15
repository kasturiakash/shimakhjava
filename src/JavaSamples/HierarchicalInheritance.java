package JavaSamples;

public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat(); // Inherited from Animal class
        dog.bark(); // Specific to Dog class

        cat.eat(); // Inherited from Animal class
        cat.meow(); // Specific to Cat class

	}

}


class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

