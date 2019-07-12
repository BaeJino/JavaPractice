package org.dimigo.webcrawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawler {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            System.out.println(doc.html());
            Elements result = doc.select("[id=realTimeRankFavorite] li a");
            List<String> list = result.eachText();

            for(String s : list){
                System.out.println(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
