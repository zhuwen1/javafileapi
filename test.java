package testDemo;

import java.io.File;
import java.io.IOException;

public class test {
	public static void main(String [] args) throws IOException{
		FileUtils.listDirectory(new File("D:\\appserv"));
	}
}
