package com.jnit.training.inheritance;

class Electronics {
	void getDeviceInformation() {
		System.out.println("Device Information="+"supports 5G"+"bluetooth connection");
	}

	void ramSize() {
		System.out.println("Device ramsize=" + "2GB");
	}
}

class Mobile extends Electronics {
	void camerafeatures() {
		System.out.println("Features of camera=" + "ultrawidecamera");
	}

	void display() {
		System.out.println("mobile display=" + "expansive display");
	}
}

class Oneplus extends Mobile {
	void price() {
		System.out.println("price of oneplus=" + 30000);
	}

	void model() {
		System.out.println("model of device=" + "oneplus 7t");
	}

	void color() {
		System.out.println("color of mobile=" + "mirror blue");
	}

}

public class MultiLevelInheritance2 {
	public static void main(String[] args) {
		Oneplus op = new Oneplus();
	    op.color();
	    op.model();
	    op.price();
	    op.display();
	    op.camerafeatures();
	    op.ramSize();
	    op.getDeviceInformation();
		

	}

}
