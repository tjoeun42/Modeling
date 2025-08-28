package _07_dip;

class Pet {
	PetInterface petInter;
	void setPetInter(PetInterface petInter) {
		this.petInter = petInter;
	}
	void play() {
		System.out.println(petInter);
	}
}

class Dog implements PetInterface {
	@Override
	public String toString() {
		return "강아지";
	}
}

class Cat implements PetInterface {
	@Override
	public String toString() {
		return "고양이";
	}
}

// 나중에 확장해도 아무것도 수정하지 않아도됨
class Hamster implements PetInterface {
	@Override
	public String toString() {
		return "햄스터";
	}
}

public class PetRun {
	public static void main(String[] args) {
		Pet pet = new Pet();
		
		pet.setPetInter(new Dog());
		pet.play();
		
		pet.setPetInter(new Cat());
		pet.play();
		
		pet.setPetInter(new Hamster());
		pet.play();
	}
}
