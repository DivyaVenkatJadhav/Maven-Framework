package Resources;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {
  Properties pro;
    public PropertyFileReader () {
    try{
    FileInputStream File =new FileInputStream("C:\\Users\\dhira\\eclipse-workspace\\MavenParaBankDataframework\\Resources\\config.properties");
   pro = new Properties();
         pro.load(File);
                  
    }catch(Exception e) {
      e.printStackTrace();
    }
}	
   public String getUserName() {
     String TUS = pro.getProperty("username");
     return TUS;
	
   }

   public String getPassword() {
     String TPWD = pro.getProperty("password");
     return TPWD;
   }

     public String geturl() {
       String TUrl = pro.getProperty("url");
       return TUrl;
     }
	
	
	public String getChromePath() {
	String  Tpath = pro.getProperty("path");
	return Tpath;
	
	}
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	

