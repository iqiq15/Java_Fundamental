package java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo2 {
	public static void main(String[] args) {
		//String url = "https://sports.news.naver.com/index.nhn";
		String url = "https://m.sports.naver.com/";
		Document doc = null;
		Document doc2 = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".newslst_common_wrap");
		Elements liElements = elements.select(".newslst_item.lst_content.txt_area.title");
		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			/*String href = liElement.select("a").attr("abs:href");
			try {
				doc2 = Jsoup.connect(href).get();
			} catch (IOException e) {
				// TODO: handle exception
			}
			Elements ele = doc2.select("#newsEndContents");
			String content = ele.text();*/
			String text = elements.text();
			System.out.println(text);
		}
		
		
		
	}
}
