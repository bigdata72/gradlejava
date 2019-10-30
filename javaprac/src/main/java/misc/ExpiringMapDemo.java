package misc;

import net.jodah.expiringmap.ExpirationListener;
import net.jodah.expiringmap.ExpiringMap;

import java.util.concurrent.TimeUnit;

public class ExpiringMapDemo {

	private ExpiringMap<String, Double> expiringMap =
			ExpiringMap.builder().expiration(10, TimeUnit.SECONDS)
			.build();


	public static void main(String[] args) {
		new ExpiringMapDemo().execute();
	}

	private void execute(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException ie){
				ie.printStackTrace();
			}
			// add element
			addElement();

			// print element
			printElement();

			ExpirationListener<String, Double> listener = (key, val) -> {
				System.out.println("entry expired");
			};

			expiringMap.addExpirationListener(listener);
		}
	}

	private void addElement(){
		double randomValue = Math.random();
		expiringMap.put("expiringMap "+randomValue, randomValue );
	}

	private void printElement(){
		System.out.println("Map size="+expiringMap.size());
	}
}
