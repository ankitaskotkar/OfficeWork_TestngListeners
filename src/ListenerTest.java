import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test case:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test case skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Test case Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test case:"+result.getName());
		
	}

}
