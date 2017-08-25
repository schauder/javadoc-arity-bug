package client;

import org.springframework.util.ConcurrentReferenceHashMap;

public class Client {

	ConcurrentReferenceHashMap usingDemo() {
		ConcurrentReferenceHashMap map = new ConcurrentReferenceHashMap();
		map.replace("key", "value");
		return map;
	}
}
