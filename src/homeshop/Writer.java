package homeshop;

public interface Writer {
	
	/**
	 * Start writting process
	 */
	public void start();
	
	/**
	 * Write on line
	 * @param line
	 */
	public void writeLine(String line);
	
	/**
	 * Stop writting process
	 */
	public void stop();
}
