package kodlamaio.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.mernisService.FakeMernisService;

@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(long nationalId, String firstName, String lastName, int yearOfBirth) {

		FakeMernisService client = new FakeMernisService();
		
		boolean result = true;
		try {
			result = client.ValidateByPersonalInfo(nationalId, firstName, lastName, yearOfBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}

	

}
