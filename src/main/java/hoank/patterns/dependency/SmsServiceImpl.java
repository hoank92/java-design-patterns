package hoank.patterns.dependency;

/**
 * Created by hoank92 on Jun, 2019
 */
public class SmsServiceImpl implements MesageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms message: " + message);
    }
}
