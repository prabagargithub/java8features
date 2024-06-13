package com.eightfeature;

public class FeatureEight {

	public static void main(String[] args) {
		
		AnnonyamsInnerParent snnonyamsInnerParent=new AnnonyamsInnerParent() {
			
			public void color() {
				System.out.println("color of child");

			}
		};
		snnonyamsInnerParent.behaivor();
		snnonyamsInnerParent.characters();
	}

}
