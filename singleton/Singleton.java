package singleton;

public class Singleton {

	public static void main(String[] args) {
		
		var config = ConfigApi.getInstance();
		var config2 = ConfigApi.getInstance();
		var config3 = ConfigApi.getInstance();

		System.out.println(config);
		System.out.println(config2);
		System.out.println(config3);
		
	}

}
