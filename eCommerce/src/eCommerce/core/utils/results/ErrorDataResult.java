package eCommerce.core.utils.results;

public class ErrorDataResult<T> extends DataResult<T> {

	public ErrorDataResult(T data, boolean success,String message) {
		super(data, false,message);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorDataResult(T data, boolean success) {
		super(data, false);
		// TODO Auto-generated constructor stub
	}

}
