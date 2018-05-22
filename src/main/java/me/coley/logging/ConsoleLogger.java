package me.coley.logging;

import java.io.IOException;
import java.io.PrintStream;

/**
 * Logger that writes output to a PrintStream.
 */
public class ConsoleLogger extends Logger<PrintStream> {
	/**
	 * Construct a ConsoleLogger to system-out.
	 * 
	 * @param level
	 *            Level of detail to log.
	 */
	public ConsoleLogger(Level level) {
		super(System.out, level);
	}
	
	@Override
	protected void write(String fmtMessage) {
		out.print(fmtMessage);
	}
}