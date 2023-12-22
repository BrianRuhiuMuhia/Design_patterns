
public class threadSafetySingleton {
	// initialize the instance as null.
	private static threadSafetySingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private threadSafetySingleton() {  }

	// check if the instance is null, within a synchronized block. If so, create the object
	public static threadSafetySingleton getInstance() {
		synchronized (threadSafetySingleton.class) {
			if (instance == null) {
				instance = new threadSafetySingleton();
			}
		}
		return instance;
	}
}
