package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class w3school크롤링테스트 {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공");
			System.out.println("2. 소스 받아오기 성공");
			Elements list = doc.select("a.w3-bar-item");
			 //Elements list = doc.select("#topnav > div > div >a:nth-child(5)");
			System.out.println(list.size());
			
//			for (Element tag : list) {
//				System.out.println(tag.text());
//			}
			for (int i = 8; i < 18; i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
