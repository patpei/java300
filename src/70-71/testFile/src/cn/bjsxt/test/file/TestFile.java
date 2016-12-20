package cn.bjsxt.test.file;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("c:/dev/tmp/aa/TestObject.java");
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("文件夹不存在,不能创建文件");
			e.printStackTrace();
		}
		File f2 = new File("c:/dev/tmp");
		if(f2.isDirectory()){
		System.out.println("是一个目录");
	}
		
//		File f3 = new File(f2,"TestThis.java");
//		File f4 = new File(f2,"TestFile666.java");
		File f5 = new File("c:/dev/tmp/bb/cc");
		f5.mkdirs();
//			
//
//		if(f.isFile()){
//			System.out.println("是一个文件");
//		}

		
	}
}
