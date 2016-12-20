import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author Petercao Version 1.0.0
 */
public class ChangeEncode {
	// 转换文本文档的编码格式。

	public static void main(String[] args) {
		ChangeEncode changeEncode = new ChangeEncode();
		changeEncode.encode("C://dev//workspace//java300//tmp", "C://dev//workspace//java300//src");
	}

	public void encode(String sourceDir, String targetDir) {
		// 要读的原文件。
		File source = new File(sourceDir);
			
		// 要写入的新文件。
		File tag = new File(targetDir);
		if (!tag.exists()) {  
			tag.mkdir();// 目录不存在的情况下，会抛出异常  
        } 

		for (File file: source.listFiles()) {
			try {
				if (file.isDirectory()){
					String subDir=file.getName();
					String dir1=sourceDir+File.separator+subDir;
					String dir2=targetDir+File.separator+subDir;
					this.encode( dir1, dir2 );
				}else{
					FileInputStream fileInputStream = null;
					InputStreamReader inputStreamReader = null;
					BufferedReader bufferedReader = null;
					FileOutputStream fileOutputStream = null;
					OutputStreamWriter outputStreamWriter = null;
					BufferedWriter bufferedWriter = null;
					// 要读的原文件。
					fileInputStream = new FileInputStream(file);
					try {
						// 原来的文本的编码格式是gb2312
						inputStreamReader = new InputStreamReader(fileInputStream, "gb2312");
					} catch (UnsupportedEncodingException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
					bufferedReader = new BufferedReader(inputStreamReader);
					// 要写入的新文件。
					fileOutputStream = new FileOutputStream( targetDir+File.separator+file.getName());
					try {

						// 转换后的文本的编码格式是utf-8。
						outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf8");
					} catch (UnsupportedEncodingException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					bufferedWriter = new BufferedWriter(outputStreamWriter);
					String line = bufferedReader.readLine();
					try {
						while (line != null) {
							bufferedWriter.write(line);
							bufferedWriter.write("\r\n");
							line = bufferedReader.readLine();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						bufferedWriter.close();
						outputStreamWriter.close();
						fileOutputStream.close();

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						bufferedReader.close();
						inputStreamReader.close();
						fileInputStream.close();

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}