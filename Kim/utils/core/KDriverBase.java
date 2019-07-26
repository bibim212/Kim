package core;

public class KDriverBase {
private static ThreadLocal<KDriver> drvBase = new ThreadLocal<KDriver>();
	
	public static synchronized void createDriver(String _browser) {
		drvBase.set(new KDriver(_browser));
	}
	
	public static synchronized KDriver getDriver() {
		return drvBase.get();
	}
}
