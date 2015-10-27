package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {
	public static void main(String[] args) {
		String url = "https://lh4.ggpht.com/z93o7Y9N_3-F270zV4gQrXI3avhgKC-xkDzumYQmANBfJmANtC-lNdQm0_HWCuv-opg=w300";
		
		try {
			URL url2 = new URL(url);
			
			InputStream is = url2.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			// WRITE
			int data;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			is.close();
			os.close();
		} catch(Exception e) {
			
		}
	}
}
