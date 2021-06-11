package hrms.hrms.core.utilities.results;

import java.util.Map;

public class Result {

	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success=success;
	}
	public Result(boolean success,String message) {
		this.success=success;
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
		
	public String getMessage() {
		return message;
	}
	public Map<String, String> getUrl() {
		// TODO Auto-generated method stub
		return null;
	}
}
