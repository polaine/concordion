package spec.concordion.results.runTotals;

import org.concordion.api.FailFast;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class) @FailFast
public class FailFastRunningFailFastTest {

	public String getSuccessString() throws Exception {
		return "Success";
	}

}
