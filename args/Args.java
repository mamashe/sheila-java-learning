public class Args{
	public static void main(String[] args){
		int i = 1;
            System.out.printf("Got %d command-line arguments.\n", args.length);
			for (String arg : args) {
				System.out.printf("%3d. %s\n", i, arg);
					++i;
			}
	}
}