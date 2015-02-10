package it.randomtower.graphgametemplate.model;

public class ConcreteEdge implements Edge {

	private Node start;
	private Node end;
	private int weight;

	public ConcreteEdge(Node start, Node end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public Node getStart() {
		return start;
	}

	@Override
	public Node getEnd() {
		return end;
	}

}
