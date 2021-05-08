package eCommerce.core.utils.results;

public class DataResult<T> extends DataResultBase<T> {

	private final boolean success;
	private String message;
	private T data;
					

	public DataResult(T data, boolean success) {
		super(data, success);
		this.data=data;
		this.success=success;
		// TODO Auto-generated constructor stub
	}


	public DataResult(T data,Boolean success, String message) {
		
		super(data,success,message);
		this.success=success;
		this.data=data;
		this.message=message;
		
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public boolean isSuccess() {
		return success;
	}

	




	
	

}
