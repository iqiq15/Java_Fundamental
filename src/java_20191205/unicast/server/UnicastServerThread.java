package java_20191205.unicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable{
	private Socket socket;
	
	public UnicastServerThread(Socket socket){
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//InputStream in = socket.getInputStream();
			//InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			
			//OutputStream out = socket.getOutputStream();
			//OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = 
					new BufferedWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			
			while(true){
				String readLine = br.readLine();
				System.out.println(readLine);
				
				bw.write(readLine);
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
