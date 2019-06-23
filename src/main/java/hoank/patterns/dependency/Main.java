package hoank.patterns.dependency;

/**
 * Created by hoank92 on Jun, 2019
 */
public class Main {
    public static void main(String[] args) {
        MesageService message = new EmailServiceImpl();
        UserController userController = new UserController(message);
        userController.send();

        MesageService smsMessage = new SmsServiceImpl();
        UserController userController1 = new UserController(smsMessage);
        userController1.send();



    }
}
