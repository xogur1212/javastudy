package test0803;

import java.io.File;

public class Test09 {

	public static void main(String[] args) {
		File f1= new File("d:\\target\\rand");
		File[] subFiles=f1.listFiles();
		int total=0;
		for(int i=0;i<subFiles.length;i++) {
			File f=subFiles[i];
			String fileName=f.getName();
			int idx=fileName.lastIndexOf(".");
			String istxt=fileName.substring(idx);
			if(istxt.equals(".txt")) {
				System.out.println(f.getPath()+ "삭제");
				f.delete();
				total++;
			}
			
		}
		System.out.println("총"+total+"개의 txt파일을 삭제했습니다.");
	}
}
