package com.example.inversion_control;

public class Iphone implements Mobiles {
	Color color;
	Iphone(Color colorObj)
	{
		this.color=colorObj;
	}


    public void  getModelAndColor() {
		// TODO Auto-generated method stub
		System.out.println("Model :Iphone12 pro");
		color.getIphoneColor();

	}

}
