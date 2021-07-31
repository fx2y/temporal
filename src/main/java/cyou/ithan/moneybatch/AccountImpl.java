package cyou.ithan.moneybatch;

public class AccountImpl implements Account {
    @Override
    public void deposit(String accountId, String referenceId, int amountCents) {
        System.out.printf("Deposit to %s of %d cents requested. ReferenceId=%s\n", accountId, amountCents, referenceId);
    }

    @Override
    public void withdraw(String accountId, String referenceId, int amountCents) {
        System.out.printf("Withdraw to %s of %d cents requested. ReferenceId=%s\n", accountId, amountCents, referenceId);
    }
}
