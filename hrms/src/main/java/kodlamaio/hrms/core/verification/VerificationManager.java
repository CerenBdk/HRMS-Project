package kodlamaio.hrms.core.verification;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.dataAccess.abstracts.VerificationCodeDao;
import kodlamaio.hrms.entities.concretes.VerificationCode;
@Service
public class VerificationManager implements VerificationService{

	private VerificationCodeDao verificationCodeDao;
	
	@Autowired
	public VerificationManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Verification link has been sent to " + email );
		System.out.println("Please click on the link to verify your account:  " + verificationLink );
	}

	@Override
	public void sendCode(String email, int id) {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		VerificationCode code = new VerificationCode(id, verificationCode, false, LocalDate.now());
		this.verificationCodeDao.save(code);
		System.out.println("Verification link has been sent to " + email );
		System.out.println("Your activation code:  " + verificationCode );
	}
}
