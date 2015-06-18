public class Args{
	public static void main(String[] args){
		int i = 1;
			for (String arg : args) {
				System.out.printf("%3d. %s\n", i, arg);
					++i;
			}
	}
}