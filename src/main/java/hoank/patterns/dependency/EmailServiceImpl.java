package hoank.patterns.dependency;

/**
 * Created by hoank92 on Jun, 2019
 */
public class EmailServiceImpl implements MesageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email message: " + message);
    }
}
