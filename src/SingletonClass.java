
public class SingletonClass {
	
	private int a;
	private int b;
	
	SingletonClass sc;
	private  SingletonClass() {
		System.out.println(" new instnace is createds");
	}
	
	public SingletonClass getInstance() {
		
		if(sc == null) {
			synchronized (SingletonClass.class){
				if(sc ==null) {
					return new SingletonClass();
				}
				else {
					return sc;
				}
				
			}
			
		}
		else {
			return sc;
		}
		
		
	}

}
