package decryption;

public class MassageDecrypt {
	public static void decryptAMassage(String str,int key)
	{
		char ch;
		int temp;
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			temp = (int)ch;
			if(temp<90)
			{
				temp = temp-65+key;
			}
			else
			{
				temp = temp-97+key;
			}
			//System.out.print(temp);
			temp = temp%26;
			if((int)ch<=90 && (int)ch>=65)
				System.out.print((char)(65+temp));
			else if((int)ch<=122 && (int)ch>=97)
				System.out.print((char)(97+temp));
			else
				System.out.print(ch);
		}
	}
	public static void main(String[] args)
	{
			String str = "abCDX./yz/";
		MassageDecrypt object = new MassageDecrypt();
		MassageDecrypt.decryptAMassage(string,3);
	}
}
