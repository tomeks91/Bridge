public abstract class Account {
    private final Logger logger;


    protected Account(Logger logger) {
        this.logger = logger;
    }

    protected void markOperation(String message, String result){
        logger.log(message+" "+result);
    }

    public abstract void blockAccount();
}
