//: P11AllTheColorsOfTheRainbow.java

package com.wuroc.chaptertwo;

/**
 * @author HepengWu
 * @GitHub www.github.com/WuRoc
 * @version 1.0
 * @2020年6月4日
 *
 * 
 */
public class P11AllTheColorsOfTheRainbow {
	
	static int anIntegerRepresentingColors;
	
	void changeTheHueOfTheColor(int newHue) {
	
		anIntegerRepresentingColors = newHue;
	}
	
	public static void main(String[] args) {
		
		P11AllTheColorsOfTheRainbow p = new P11AllTheColorsOfTheRainbow();
		
		p.changeTheHueOfTheColor(1010);
		
		System.out.println(anIntegerRepresentingColors);
		
		
		
		
	}
	
}/*Output :
1010
*///:~

	

