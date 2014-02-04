import java.lang.reflect.Field;


public class MacdServiceImpl extends MaxServiceBase {

	public MaxServiceImpl() {
		logger.debug("Init MaxImpl");
//		 talib_init("ma","ma", "12", "Ema", "EU0009652759", "open" );
//		 talib_init("macd1","macd", "12", "26","9", "EU0009652759", "close" );
//		 talib_init("rsi1","rsi", "9", "EU0009652759", "open" );
//		 talib_init("bbands1", "bollinger", "9", "1", "EU0009652759", "open" );
		talib_init("lb1", "lookback", "EU0009652759", "1" , "close");
		talib_init("lb2", "lookback", "EU0009652759", "2" , "close");
		talib_init("lb3", "lookback", "EU0009652759", "3" , "close");
	}
	
	
   @Override
	public void onData()
	{
//	   System.out.println(data.get("EU0009652759").close);
//	   double macd1 = talib_data("macd1", "macdhist");
//	   logger.debug(tadata.toString());
//	   logger.debug("rsi1 value="+ talib_data("rsi1"));
//	   logger.debug("macd1 value="+macd1);
	   logger.debug("lookback 1 "+talib_data("lb1"));
	   logger.debug("lookback 2 "+talib_data("lb2"));
	   logger.debug("lookback 3 "+talib_data("lb3") );
//	   logger.debug("bbands1 value="+talib_data("bbands1", "realmiddleband"));
//	   if(macd1>0)
//	   {
//		   
//		   order("EUR.USD", 10);
//	   }
//	   else
//		   order("EUR.USD", -10);
	  
	}
	
   @Override	
	public void initialize()
	{
	   data.put("AAPL", null);
	   data.put("GOOG", null);
	   data.put("YHOO", null);
	   System.out.println("world");
	  
	}
	
}