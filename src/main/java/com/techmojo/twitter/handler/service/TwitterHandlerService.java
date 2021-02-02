package com.techmojo.twitter.handler.service;

import com.techmojo.twitter.handler.model.TwitterHandlerWithCount;
import com.techmojo.twitter.handler.util.TwitterHandlerWithCountComparator;

import java.util.*;

public class TwitterHandlerService {

    Map<String, Integer> mapKeyAndCount;
    List<TwitterHandlerWithCount> handlerAndCountList;
    public TwitterHandlerService() {
        mapKeyAndCount = new HashMap<>();
        handlerAndCountList = new ArrayList<>();
    }

    public void processTweet(String tweet) {
        String[] tweets = tweet.split(" ");

        for (int currIndex = 0; currIndex < tweets.length; currIndex++) {
            if (tweets[currIndex].trim().startsWith("#")) {
                String tweetHandler = tweets[currIndex].trim();
                int count = mapKeyAndCount.getOrDefault(tweetHandler, 0);
                mapKeyAndCount.put(tweetHandler, Integer.valueOf(count + 1));
            }
        }


        handlerAndCountList.clear();

        for (String handler : mapKeyAndCount.keySet()) {
            TwitterHandlerWithCount handlerWithCount = new TwitterHandlerWithCount(mapKeyAndCount.get(handler), handler);
            handlerAndCountList.add(handlerWithCount);
        }


        Collections.sort(handlerAndCountList, new TwitterHandlerWithCountComparator());
        handlerAndCountList.stream().limit(10).forEach(System.out::println);

    }

}
