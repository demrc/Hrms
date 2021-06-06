package hrms.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(boolean success, T data, String message) {
		super(false, data, message);
		
	}
	public ErrorDataResult(T data, String message) {
		super(false, data, message);
		
	}
	public ErrorDataResult(String message) {
		super(false,null,message);
		
	}
	public ErrorDataResult() {
		super(false,null);
		
	}
	
}
