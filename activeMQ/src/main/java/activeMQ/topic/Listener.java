package activeMQ.topic;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 消息监听  - 订阅者一
 * @author acer
 *
 */
public class Listener implements MessageListener{

	@Override
	public void onMessage(Message message) {
		
		try {
			System.out.println("订阅者一收到的消息:" + ((TextMessage)message).getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
