public class HelloWordGinder extends HelloWord {
	public boolean  jin;
	public HelloWordGinder ( String s, boolean b){
		super(s);
		this.jin = b ;
	}

 	public void print() { 
		if (jin==true){
			System.out.println ("hello miss "+name);
		}
		else {
			System.out.println ("hello mr "+name);
		}
	}
}
