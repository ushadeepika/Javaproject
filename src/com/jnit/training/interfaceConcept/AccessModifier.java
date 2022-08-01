package com.jnit.training.interfaceConcept;
class Operators{
	private String name;
    private int a =10,b =20;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void add() {
		System.out.println("addition="+(a+b));
	}
	protected void sub() {
		System.out.println("subtraction="+(a-b));
	}
	void multiply() {
		System.out.println("Multiply="+(a*b));
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		Operators op = new Operators();
		op.setName("usha");
		System.out.println(op.getName());
		op.add();
        op.sub();
        op.multiply();
	}

}
