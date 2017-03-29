import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				Flower flo = new Flower();
				Location floL = new Location(x, y);
				Color color = new Color(x*10,y*10,0);
				flo.setColor(color);
				world.add(floL, flo);
			}
		}
		Bug bug = new Bug();
		Location bugL = new Location(2, 2);
		world.add(bugL, bug);
		Bug bug2 = new Bug();
		Location bugL2 = new Location(7, 7);
		bug2.setColor(Color.blue);
		world.add(bugL2, bug2);
		bug2.turn();
		bug2.turn();
	}
}
