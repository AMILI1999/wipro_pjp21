import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitDemo1Test {
	
	JUnitDemo1 demo1 = new JUnitDemo1();
	public void testStringConcat() {
		assertEquals("tomcat", demo1.stringConcat("tom", "cat"));
	}

}