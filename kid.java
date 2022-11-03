package gift;

public class kid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello kids! how are you? you welcome to java programing ");
		System.out.println("It is realy good because it can be used to make many game,projects and attractive shapes likethis one below ");
		System.out.println("I therefore callupon you,kids to learn java,love it and make your own programs coz it is really good ");
		System.out.println("Oooooooh! wao! i love you bye ");
		int m=30;
		int z=0;
		for(int i=1; i<=m; i++)
		{
		for(int j=m-1; j>=i; j-- )
		{
		System.out.print(" ");
		}
		for(int k=i-1; k>=-(i-1); k--)
		{
		System.out.print((char)
		(z-Math.abs(k)+65));
		}
	z+=2;
	System.out.println();
	}

	}

}
