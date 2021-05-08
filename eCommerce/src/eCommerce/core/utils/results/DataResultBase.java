package eCommerce.core.utils.results;

public class DataResultBase<T> extends ResultBase {
	
	private T data;
	private boolean success;
	private String message;
	



	public  DataResultBase(T data){
		this.data = data;
	}
	
	
	

	public DataResultBase(T data, boolean success) {
		
		this.data = data;
		this.success = success;
	}



	public DataResultBase(T data, boolean success, String message) {
		
		this.data = data;
		this.success = success;
		this.message = message;
	}




	public boolean isSuccess() {
		return success;
	}




	public void setSuccess(boolean success) {
		this.success = success;
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
   
}
