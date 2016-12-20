package guide;
/**
 * an abstract class need not implement any or all of an interface’s methods.
 * @author pps
 *
 */
public abstract class Frob implements Frobnicate {
	
	//non necessaire
	public void twiddle(String s) {	}
	
	/**
	 * incorrect because abstract methods have no body.
	 */
	//public abstract void twiddle(String s) { }
}
