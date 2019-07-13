class Test{
	int a;
	int b;

	Test(){
		a=10;
		b=20;
	}
	void get(){
	  display(this);
	}
	void display(Test obj){
		System.out.println("a = " + a + "b = " + b);	
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.get();
	}
}