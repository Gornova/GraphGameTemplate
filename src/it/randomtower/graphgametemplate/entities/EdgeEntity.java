package it.randomtower.graphgametemplate.entities;

import it.marteEngine.entity.Entity;
import it.randomtower.graphgametemplate.model.Edge;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class EdgeEntity extends Entity {

	private Edge edge;

	public EdgeEntity(Edge edge) {
		super(0, 0);
		this.edge = edge;
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		int m = NodeEntity.NODE_SIZE / 2;
		g.drawLine(edge.getStart().getX() + m, edge.getStart().getY() + m, edge.getEnd().getX() + m, edge.getEnd()
				.getY() + m);
	}

}
