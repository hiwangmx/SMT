package com.star.smt.util;

import java.io.IOException;
import java.io.InputStream;

public class FileUtils {

	public static void closeInputStream(InputStream stream){
		if(null != stream){
			try {
				stream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
