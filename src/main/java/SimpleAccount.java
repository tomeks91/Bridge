public class SimpleAccount extends Account{
    SimpleAccount() {
        super(Logger.warn());
    }


    @Override
    public void blockAccount() {
        markOperation("Zablokowane", "1");
    }
}
