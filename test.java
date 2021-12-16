public class	test
{
	public static void	main(String args[])
	{
		System.out.println("Hello world !");
		my_class my_obj = new my_class();
		System.out.println(my_obj.data);
		edit(my_obj);
		System.out.println(my_obj.data);
	}

	public static void	edit(my_class obj)
	{
		obj.data = 42;
	}

	public static class	my_class
	{
		public int data;
		my_class()
		{
			this.data = 0;
		}
	}
}
