package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GettingStartedTest {

	@Test
	public void addFiveTo20() {
		int result = new GettingStarted().addFive(20);
		Assertions.assertEquals(24, result);
	}

	// UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

	@Test
	public void addFiveToZero() {
		int result = new GettingStarted().addFive(0);
		Assertions.assertEquals(5, result);
	}

	@Test
	public void addFiveToMinus20() {
		int result = new GettingStarted().addFive(-20);
		Assertions.assertEquals(-15, result);
	}
}
