package java_20191202;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out;//Destination을 출력장치로 연결하겠다는 의미
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\pdf-copy.zip");
			bos = new BufferedOutputStream(fos);
			
			PrintStream ps1 = new PrintStream(bos,true);
			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8];
			//long start = System.currentTimeMillis();
			while ((readByteCount = bis.read()) != -1) {
				ps1.write(readBytes);
			}
			/*long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d%n", end - start);*/

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
				if (bis != null) bis.close();
				if (fos != null) fos.close();
				if (bos != null) bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
