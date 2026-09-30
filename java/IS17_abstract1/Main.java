abstract  class  NoObjects  {
	int  noDirectObjectPossible  =  5;

	public  void  aFunction()  {
		System.out.println(  "Hi IS17"  );
	}

	public  abstract  void  subClassMustImplement(  int  foo  );
}

class Concrete  extends  NoObjects  {
	public  void  subClassMustImplement(  int  foo  )  {
		System.out.println(  "It works!"  );
	}
}

class  AbstractClasses  {
	public static void main( String args[] ) {
		NoObjects  useful  =  new  Concrete();
		Concrete  thisWorks  =  new  Concrete();

		useful.subClassMustImplement( 10 );

		System.out.println(  thisWorks.noDirectObjectPossible  );
	}
}