public class eagerBeaver {
    private static eagerBeaver eagerBeaverInstance=new eagerBeaver();
    private eagerBeaver(){}
    public static eagerBeaver getInstance()
    {
        return eagerBeaverInstance;
    }
}
