package gameMaster.Concrete;

import gameMaster.Abstract.GameService;
import gameMaster.Abstract.UserCheckService;
import gameMaster.Entities.Campaign;
import gameMaster.Entities.Game;
import gameMaster.Entities.Gamer;
import gameMaster.ServiceAdapters.MernisServiceFakeAdapter;


public class GameManager implements GameService {

	UserCheckService userCheckService;

	
public GameManager(UserCheckService userCheckService ) {
		this.userCheckService=userCheckService;
	}
	
	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli oyun eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " isimli oyun silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyun güncellendi.");
		
	}

	@Override
	public void sell(Game game, Gamer gamer) {
		
		
		double restOfMoney = gamer.getMoney() - game.getCost();
		
		if(userCheckService.IfUserRealPerson(gamer)) {
			
			if (restOfMoney<0) {
				System.out.println("Bakiye Yetersiz!");
			}
			
			else {
				gamer.setMoney(restOfMoney);	 
					
				System.out.println(game.getName() + " isimli oyunun satışı " + gamer.getFirstName() + " adlı kullanıcıya gerçekleşti. Kalan bakiye: " + restOfMoney);
			}
		}
		
		else {
			System.out.println("Satış işlemi başarısız, böyle bir kullanıcı bulunamadı.");
		}
		
		
		
		
		
	}

	@Override
	public void discount(Game game, Campaign campaign) {
		game.setCost(game.getCost() - (game.getCost()*campaign.getDiscount()/100)); 
		System.out.println(game.getName()+" isimli oyuna %" + campaign.getDiscount()+ " indirim uygulandı. Yeni fiyat: " +game.getCost());
		
	}

}
