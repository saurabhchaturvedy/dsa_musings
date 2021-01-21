package com.dsa.saurabh.level01.Graphs.WebCrawler;

public class App {

    public static void main(String[] args) {
        WebCrawler webCrawler = new WebCrawler();
        webCrawler.crawl("https://ytplaylist-len.herokuapp.com/");
    }
}
