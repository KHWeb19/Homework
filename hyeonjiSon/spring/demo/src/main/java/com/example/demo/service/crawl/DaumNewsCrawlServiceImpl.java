package com.example.demo.service.crawl;

import com.example.demo.entity.crawl.DaumNews;
import com.example.demo.repository.crawl.DaumNewsCrawlRepository;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Lazy
public class DaumNewsCrawlServiceImpl implements DaumNewsCrawlService {
//@Lazy는 작업되어야 하는 내용이 많기 때문에 모든 작업이 끝난 후 진행될 수 있도록 기다려주는 역할을 한다.
        //Thread를 생각할 것!

    @Autowired
    DaumNewsCrawlRepository repository;

    private Document document;

    @Override
    public Document connectUrl(String url) {
        log.info("connectURL(): " + url);

        try {
            Connection.Response page = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (X11; Linux x86_64) " +
                            "AppleWebKit/537.36 (KHTML, like Gecko) " +
                            "Chrome/99.0.4844.84 " +
                            "Safari/537.36")
                    .execute();

            document = page.parse();
        } catch (Exception e) {
            log.info("connectURL() Error!!!");
        }

        return document;
    }

    @Override
    public List<DaumNews> daumNewsFindAll() {
        log.info("daumNewsFindAll()");

        return repository.findAll();
    }

    @Override
    public void daumNewsMainCrawler(String category) {
        log.info("daumNewsMainCrawler()");

        document = connectUrl("https://news.daum.net/" + category);

        repository.deleteAll();
        //deleteAll 사용하는 이유: 이번에 확인한 정보를 모두 저장해서 다음에도 봐야하는 것이 아니기 때문에
                               //켤 때마다 업데이트가 되도록 하기 위해서다.

        daumNewsCrawling(document.select(
                "div.main-sub>div>ul>li>div>div>strong>a"
        ), category);
    }

    @Override
    public void daumNewsCrawling(Elements elements, String category) {
        log.info("daumNewsCrawling()");

        DaumNews news = null;

        for (int i = 0; i < elements.size(); i++) {
            news = new DaumNews();

            news.setNewsNo(String.valueOf(repository.findAll().size() + 1));
            news.setAddress(elements.get(i).attr("href"));
            news.setCategory(category);
            news.setTitle(elements.get(i).text());

            repository.save(news);
        }
    }
}