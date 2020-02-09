package hoank.patterns.factory.factorymethod;

/**
 * Created by hoank92 on Feb, 2020
 */

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VPBANK);
        System.out.println(bank.getBankName());
    }
}
