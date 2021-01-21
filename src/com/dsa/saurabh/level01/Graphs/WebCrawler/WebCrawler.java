package com.dsa.saurabh.level01.Graphs.WebCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {


    private Queue<String> queue;
    private List<String> discoveredWebsites;

    WebCrawler() {
        this.discoveredWebsites = new LinkedList<>();
        this.queue = new LinkedList<>();
    }

    public void crawl(String baseURL) {
        this.queue.offer(baseURL);
        this.discoveredWebsites.add(baseURL);

        while (!queue.isEmpty()) {

            String url = this.queue.poll();
            String webpageHtml = getWebpageHtml(url);

            String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";

            Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(urlRegex);

            while (matcher.find()) {
                String foundWebsite = matcher.group();

                if (!discoveredWebsites.contains(foundWebsite)) {
                    discoveredWebsites.add(foundWebsite);
                    System.out.println("Crawler found the website :: " + foundWebsite);
                    queue.offer(foundWebsite);
                }
            }
        }
    }

    private String getWebpageHtml(String url) {
        String webpageHtml = "";

        try {
            URL website = new URL(url);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(website.openStream()));

            String readWebsite = "";

            while ((readWebsite = bufferedReader.readLine()) != null) {
                webpageHtml += readWebsite;
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return webpageHtml;
    }
}
