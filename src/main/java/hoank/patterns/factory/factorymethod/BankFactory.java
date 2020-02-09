package hoank.patterns.factory.factorymethod;

/**
 * Created by hoank92 on Feb, 2020
 */
public class BankFactory {
    private BankFactory() {

    }
    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case VPBANK:
                return new VPBank();
            case TCBANK:
                return new TCBank();
            default:
                throw new IllegalArgumentException("This bank type unsupported");
        }
    }
}
