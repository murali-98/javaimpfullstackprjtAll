package com.example.inversion_control;

public class Oneplus implements Mobiles {
	
	Color color;//new Color();
	Oneplus()
	{
		System.out.println("one plus costructor triggered");
	}
	
	Oneplus(Color colorObj)
	{
		this.color=colorObj;
	}

	public void getModelAndColor() {
		// TODO Auto-generated method stub
		System.out.println("Model :oneplus nord ce2");
		color.getOneplusColor();
	}

}
