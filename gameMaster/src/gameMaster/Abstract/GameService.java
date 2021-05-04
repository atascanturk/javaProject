package gameMaster.Abstract;

import gameMaster.Entities.Campaign;
import gameMaster.Entities.Game;
import gameMaster.Entities.Gamer;


public interface GameService {

	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);
	public void sell(Game game,Gamer gamer);
	public void discount (Game game,Campaign campaign);
}
