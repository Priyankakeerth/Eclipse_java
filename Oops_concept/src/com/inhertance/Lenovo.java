package com.inhertance;

public class Lenovo extends Laptop { //lenovo is chiled class for laptop
void watchingmovie()
{
	System.out.println("Ps2");

}
void touchscreen()
{
	System.out.println("OLED SCREEN");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenovo lp=new Lenovo();
		lp.browse();
		lp.playgames();
		lp.doprograms();
		lp.watchingmovie();
		lp.touchscreen();
		System.out.println(lp.hardisk);

	}

}
