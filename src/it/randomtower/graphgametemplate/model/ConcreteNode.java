package it.randomtower.graphgametemplate.model;

public class ConcreteNode implements Node {

	private String name;
	private int x;
	private int y;
	private int weight;

	public ConcreteNode(String name, int weight, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.weight = weight;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

}
