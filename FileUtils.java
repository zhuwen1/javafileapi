package testDemo;

import java.io.File;
import java.io.IOException;
//����һ��Ŀ¼��ʾĿ¼�µ��������ļ�
public class FileUtils {
	public static void listDirectory(File dir)throws IOException{
		if(!dir.exists()){
			throw new IllegalAccessError("Ŀ¼"+dir+"������");
		}
		if(!dir.isDirectory()){
			throw new IllegalAccessError(dir+"����Ŀ¼");
		
		}
		File[] files = dir.listFiles();
		if(files!=null&& files.length>0){
			for(File file:files){
			if(file.isDirectory()){
				listDirectory(file);
				}
			else{
					System.out.println(file);
				}
			}
		}
		else{
			System.out.println(dir);
		}
	}
	
	
}
