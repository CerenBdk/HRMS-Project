package kodlamaio.hrms.core.verification;

public interface VerificationService {
	void sendLink(String email);
	String sendCode();
}
