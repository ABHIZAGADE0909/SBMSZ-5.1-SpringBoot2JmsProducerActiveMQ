package com.abhay.sb.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerSevice {
	
	@Autowired
	private JmsTemplate jt;
	
	public void send (String sQueuqName , String sMsg) {
		
		jt.send(sQueuqName, (ses)->ses.createTextMessage(sMsg));
		
		
	}

}
