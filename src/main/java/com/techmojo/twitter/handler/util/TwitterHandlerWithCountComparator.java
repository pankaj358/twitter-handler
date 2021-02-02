package com.techmojo.twitter.handler.util;

import com.techmojo.twitter.handler.model.TwitterHandlerWithCount;

import java.util.Comparator;

public class TwitterHandlerWithCountComparator implements Comparator<TwitterHandlerWithCount> {
    @Override
    public int compare(TwitterHandlerWithCount tweetWithCount1, TwitterHandlerWithCount tweetWithCount2) {

        return  tweetWithCount1.count.equals(tweetWithCount2.count) ?
                 tweetWithCount1.handlerName.compareTo(tweetWithCount2.handlerName)
                : tweetWithCount2.count.compareTo(tweetWithCount1.count);

    }
}
