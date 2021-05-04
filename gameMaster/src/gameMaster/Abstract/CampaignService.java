package gameMaster.Abstract;

import gameMaster.Entities.Campaign;

public interface CampaignService {

	public void add(Campaign[] campaign);
	public void delete(Campaign campaign);
	public void update(Campaign campaign);

}
