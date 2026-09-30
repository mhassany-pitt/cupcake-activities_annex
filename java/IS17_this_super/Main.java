class  Parent  {
	String  name  =  "Parent";    }

class  Child  extends  Parent  {
	String  name  =  "Child";

	public  void  print()  {
		System.out.println(  name  );
		System.out.println(  this.name  );
		System.out.println(  super.name  );
		System.out.println(  Parent.name  );
		System.out.println(  ((Parent)this).name  );
	}
}

class  SuperThis  {
	public static void main( String args[] ) {
		Child  whoAmI  =  new Child();
		whoAmI.print();
	}
}