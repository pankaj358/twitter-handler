package com.techmojo.twitter.handler;

import com.techmojo.twitter.handler.service.TwitterHandlerService;

import java.io.IOException;
import java.util.Scanner;

public class TwitterHandlerApplication {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        TwitterHandlerService tweetService = new TwitterHandlerService();
        while (scanner.hasNextLine())
            tweetService.processTweet(scanner.nextLine());

    }

}
