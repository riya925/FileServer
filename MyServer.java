import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ser=new ServerSocket(4321);
			Socket client=ser.accept();
			
			DataInputStream dis=new DataInputStream(client.getInputStream());
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			
			String fna=dis.readUTF();
			
			File f1=new File("src//"+fna);
			
			if(f1.exists())
			{
				dos.writeUTF("FILE EXISTS");
				BufferedReader br=new BufferedReader(new FileReader(f1));
				String line="",data="";
				
				//FileInputStream-byte by byte
				while(line!=null) //line by line
				{
					line=br.readLine();
					if(line!=null)
					{
						data=data+line+"\n";
					}
				}
				br.close();
				dos.writeUTF(data);
			}
			else
			{
				dos.writeUTF("FILE DOESN'T EXISTS");
			}
			
			dis.close();
			dos.close();
			client.close();
			ser.close();
		}
		catch(Exception e)
		{
			System.out.println("\n SERVER ERROR : "+e.getMessage());
		}
	}
}