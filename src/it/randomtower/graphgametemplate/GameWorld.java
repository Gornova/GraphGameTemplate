package it.randomtower.graphgametemplate;

import it.marteEngine.World;
import it.randomtower.graphgametemplate.entities.EdgeEntity;
import it.randomtower.graphgametemplate.entities.NodeEntity;
import it.randomtower.graphgametemplate.model.ConcreteEdge;
import it.randomtower.graphgametemplate.model.ConcreteNode;
import it.randomtower.graphgametemplate.model.Edge;
import it.randomtower.graphgametemplate.model.Node;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GameWorld extends World {

	public GameWorld(int id, GameContainer container) {
		super(id, container);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		// create nodes
		Node start = new ConcreteNode("1", 1, 100, 100);
		NodeEntity nodeEntity = new NodeEntity(start);
		add(nodeEntity);

		Node end = new ConcreteNode("2", 1, 400, 100);
		nodeEntity = new NodeEntity(end);
		add(nodeEntity);

		Node second = new ConcreteNode("3", 1, 200, 300);
		nodeEntity = new NodeEntity(second);
		add(nodeEntity);

		Node third = new ConcreteNode("4", 1, 500, 500);
		nodeEntity = new NodeEntity(third);
		add(nodeEntity);

		Node fourth = new ConcreteNode("5", 1, 100, 500);
		nodeEntity = new NodeEntity(fourth);
		add(nodeEntity);

		// create edges
		Edge edge = new ConcreteEdge(start, end, 0);
		EdgeEntity edgeEntity = new EdgeEntity(edge);
		add(edgeEntity);

		edge = new ConcreteEdge(end, second, 0);
		edgeEntity = new EdgeEntity(edge);
		add(edgeEntity);

		edge = new ConcreteEdge(second, fourth, 0);
		edgeEntity = new EdgeEntity(edge);
		add(edgeEntity);

		edge = new ConcreteEdge(end, second, 0);
		edgeEntity = new EdgeEntity(edge);
		add(edgeEntity);

		edge = new ConcreteEdge(second, third, 0);
		edgeEntity = new EdgeEntity(edge);
		add(edgeEntity);

	}

}
