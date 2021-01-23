


import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpMessage;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.handler.codec.http.HttpObjectAggregator;

public class AggreHandler extends HttpObjectAggregator {

	public AggreHandler(int maxContentLength) {
		super(maxContentLength);
	}
	
	@Override 
	protected void finishAggregation(FullHttpMessage aggregated) {
		System.out.println("여기 지나감!!");
	}
	
	@Override 
	protected void handleOversizedMessage(ChannelHandlerContext ctx, HttpMessage oversized) {
		System.out.println("너무 커서 안!");
	}

}
