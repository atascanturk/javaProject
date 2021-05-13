package gameMaster.ServiceAdapters;

import gameMaster.Abstract.UserCheckService;
import gameMaster.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	
	@Override
	public boolean IfUserRealPerson(User user) {
		KPSPublicSoapProxy proxy =new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()), user.getFirstName().toUpperCase() , user.getLastName().toUpperCase(),user.getDateOfBirth().getYear());
			
		} catch (Exception e) {
			System.out.println("Not a valid user");
		}
		
		return result;
	}
	
	
	
}
