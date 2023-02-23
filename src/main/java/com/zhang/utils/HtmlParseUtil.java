package com.zhang.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URL;

public class HtmlParseUtil {

    /**
     *
     * @param url
     * @return
     * @throws Exception
     */
    public Document getHtmlDocument(String url) throws Exception {
        Document parse = Jsoup.parse(new URL(url), 30000);//响应时间不能超过三秒
        return parse;
    }

    public static void main(String[] args) throws Exception {
        /*String url = "https://www.bilibili.com/video/av724084278?from=search&seid=7327641345965566102&spm_id_from=333.337.0.0";
        Document parse = Jsoup.parse(new URL(url), 30000);
        Elements elementsByClass = parse.getElementsByClass("cur-list");
        System.out.println(parse);*/
        Document mozilla = Jsoup.connect("https://www.bilibili.com/video/av724084278").timeout(3000).userAgent("Mozilla").get();
        System.out.println(mozilla);
        /*for (Element byClass : elementsByClass) {
            Elements li = byClass.getElementsByTag("li");
            System.out.println(byClass);
            for (Element element : li) {
                String attr = element.getElementsByTag("a").eq(0).attr("title");
                System.out.println(attr + "--");

            }
        }*/
    }

}
