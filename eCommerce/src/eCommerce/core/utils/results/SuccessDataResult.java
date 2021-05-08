package eCommerce.core.utils.results;

public class SuccessDataResult<T> extends DataResult<T>{

	
	public SuccessDataResult(T data,String string) {
		super(data,true);
		// TODO Auto-generated constructor stub
	}
	
	
	public SuccessDataResult(T data,boolean success, String message) {
		super(data,true, message);
		// TODO Auto-generated constructor stub
	}
	
}
