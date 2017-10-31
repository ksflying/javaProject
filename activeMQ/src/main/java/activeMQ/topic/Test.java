package activeMQ.topic;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		//先订阅后发布
		//订阅者1
		JMSConsumer.consumerInit();
		//订阅者2
		JMSConsumer2.consumerInit();
		//发布
		JMSProducer.produceInit();
		
	}

}
