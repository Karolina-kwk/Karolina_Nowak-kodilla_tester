package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(170);
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        Given("I have deposited $0 in my wallet", () -> {
            wallet.deposit(0);
        });

        When("I request $30", () -> {
            teller.withdraw(wallet, 30);
        });

        When("I request $200", () -> {
            teller.withdraw(wallet, 200);
        });

        When("I request $201", () -> {
            teller.withdraw(wallet, 201);
        });

        When("I request $0", () -> {
            teller.withdraw(wallet, 0);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170, wallet.getBalance());
        });

        Then("The requested {int} should be dispensed", (Integer int1) -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });


    }
}

