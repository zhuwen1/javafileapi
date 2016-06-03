package testDemo;

import java.io.File;
import java.io.IOException;
//遍历一个目录显示目录下的所有子文件
public class FileUtils {
	public static void listDirectory(File dir)throws IOException{
		if(!dir.exists()){
			throw new IllegalAccessError("目录"+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalAccessError(dir+"不是目录");
		
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
