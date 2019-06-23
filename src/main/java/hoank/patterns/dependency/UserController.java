package hoank.patterns.dependency;

/**
 * Created by hoank92 on Jun, 2019
 */

public class UserController {
    private MesageService message;

    public UserController(MesageService message) {
        this.message = message;
    }

    public void send() {
        message.sendMessage("Hello");
    }
}
