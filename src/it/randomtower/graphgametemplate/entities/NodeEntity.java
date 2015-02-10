package it.randomtower.graphgametemplate.entities;

import it.marteEngine.entity.Entity;
import it.randomtower.graphgametemplate.model.Node;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class NodeEntity extends Entity {

	private Node node;
	public static final int NODE_SIZE = 32;

	public NodeEntity(Node node) {
		super(node.getX(), node.getY());
		this.node = node;
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		int m = NodeEntity.NODE_SIZE / 4;
		g.drawRoundRect(node.getX(), node.getY(), NODE_SIZE, NODE_SIZE, 4);
		g.drawString(node.getName(), node.getX() + m, node.getY() + m);
	}

}
