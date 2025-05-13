import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Not fully implemented!!!
public class HTMLPageDownloader {
	
	private static String imgRegex = "src=\\\"[^\"]+\\\"";
	// ToDo
	private static String hrefRegex = "";
	
	
	public static String processURLfromLine(String line) {
		
		// check with regex presense of URL
		Pattern p = Pattern.compile(imgRegex);
		Matcher m = p.matcher(line);
		while (m.find()) {
			System.out.println(m.group());
		}
		return line;
	}
	
	public static void downloadHTMLPageByURL(String url, 
											String host, 
											String outputFilename) 
											throws IOException {
		
		URL u = new URL(url);
		BufferedReader bf = new BufferedReader(
								new InputStreamReader(u.openStream()));
		PrintWriter pw = new PrintWriter(new FileOutputStream(outputFilename));
		String line = bf.readLine();
		while (line != null) {
			line = processURLfromLine(line);
			pw.println(line);
			line = bf.readLine();
		}
		pw.close();
		
	}
	
	public static void main(String [] args) throws IOException  {
		
		String url = "https://kpfu.ru";
		String host = "";
		String outputFilename = "downloaded.html";
		downloadHTMLPageByURL(url, host, outputFilename);
		
	}
	
}