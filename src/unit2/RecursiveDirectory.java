package unit2;

import java.io.File;

public class RecursiveDirectory {
	
	public void directoryListing(File dir){
		String fileList[] = dir.list();
		String dirPath = dir.getAbsolutePath();
		
		
		for(int i=0; i<fileList.length; i++){
			File file = new File(dirPath + "/" + fileList[i]);
				if(file.isFile()){
					System.out.println(file.getName());
				}
				else{
					directoryListing(file);
				}
			}
		}
	

	public static void main(String[] args) {
		RecursiveDirectory rDirectory = new RecursiveDirectory();
		File file = new File("/home/carlos/Música");
		rDirectory.directoryListing(file);
	}

}
