class Animal{
	void sound() {
		System.out.println("Animal makes a sound");
	}
	
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}

public class VidOveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Dog();
		
		a.sound();
	}

}
