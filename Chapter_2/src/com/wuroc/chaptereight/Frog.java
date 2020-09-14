//: Frog.java

package com.wuroc.chaptereight;

/**
 * @author WuRoc
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年8月20日
 * import static com.wuroc.util.Print.*;
 * 
 */
class Characteristic {
	private String s;
	Characteristic(String s){
		this.s = s;
		System.out.println("Creating Characteristic" + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}
class Description {
	private String s;
	
	Description(String s){
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature(){
		System.out.println("LivingCreature()");
	}
	
	protected void dispose() {
		System.out.println("LivingCreature()");
		t.dispose();
		p.dispose();
		
		
	}
}
class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Anomal not Vegetable");
	
	Animal(){
		System.out.println("Animal()");
	}
	@Override
	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	
	Amphibian(){
		System.out.println("Amphibian()");
	}
	
	@Override
	protected void dispose() {
		System.out.println("Amphibian dispose");
				t.dispose();
				p.dispose();
				super.dispose();
	}
	
}

public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	
	public Frog() {
		System.out.println("Frog()");
	}
	
	@Override
	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}

}

/* Output:
Creating Characteristicis alive
Creating Description Basic Living Creature
LivingCreature()
Createing Characteristichas heart
Creating Description Anomal not Vegetable
Animal()
Createing Characteristiccan live in water
Creating Description Both water and land
Amphibian()
Createing CharacteristicCroaks
Creating Description Eats Bugs
Frog()
Bye!
Frog dispose
disposing description Eats Bugs
disposing Characteristic Croaks
Amphibian dispose
disposing description Both water and land
disposing Characteristic can live in water
Animal dispose
disposing description Anomal not Vegetable
disposing Characteristic has heart
LivingCreature()
disposing description Basic Living Creature
disposing Characteristic is alive
 *///:WuRoc










