package gameMaster.ServiceAdapters;

import gameMaster.Abstract.UserCheckService;
import gameMaster.Entities.User;

public class MernisServiceFakeAdapter implements UserCheckService {

	public boolean IfUserRealPerson(User user) {
		
		return false;
		
	}

	
}
