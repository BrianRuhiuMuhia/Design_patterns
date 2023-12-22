public class lazyDays {
    private static lazyDays lazyDaysInstance=null;
    private lazyDays(){};
    public static lazyDays getInstance()
    {
        if(lazyDaysInstance==null)
        {
            lazyDaysInstance=new lazyDays();
        }
return lazyDaysInstance;
    }
}
