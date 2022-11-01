import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Crawling {

    public static void main(String[] args) throws IOException {

//        // 네이버 미국환율 클롤링 성공.
        Document doc1 = Jsoup.connect("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=미국환율").get();
        Elements el = doc1.getElementsByAttributeValue("class","nb_txt _sub_price");
        System.out.println(el.get(1).text());

        // 네이버 주식정보 메디톡스 크롤링 성공
        String url = "https://finance.naver.com/item/main.nhn?code=086900";
        Document doc = Jsoup.connect(url).get();
        Elements e1 = doc.getElementsByAttributeValue("class","no_today");
        Element e2 = e1.get(0);
        Elements e3 = e2.select("span");
        System.out.println(e3.get(0).text());

    }


}
