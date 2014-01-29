import datetime
import pytz
macd = ta.MACD()
signal = ta.SMA(timeperiod=9)
def initialize(context):
    pass

# Will be called on every trade event for the securities you specify. 
def handle_data(context, data):
    # Implement your algorithm logic here.
    
    # data[sid(X)] holds the trade event data for that security.
    # data.portfolio holds the current portfolio state.

    # Place orders with the order(SID, amount) method.

    # TODO: implement your own logic here.
    context.aapl = sid(14848)
   
    vwap = data[context.aapl].vwap(30)
    price = data[context.aapl].price
    qty = data[context.aapl].volume
    ma = macd(data)
    sig = signal(ma)
    record(Macd=ma , Signal=sig)
    if qty > 100:
        qty = 100
    if vwap < price :
       order( context.aapl, qty)
    else :
      order( context.aapl, -qty)