package com.inhertance;
//Multilevel inheriance
public class Lenovo_India extends Lenovo {//lenovo_india/lenovo/Laptop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lenovo_India obj=new Lenovo_India();
		obj.browse();
		obj.playgames();
		obj.doprograms();
		obj.touchscreen();
		obj.watchingmovie();
	
		System.out.println(obj.hardisk);

	}

}
