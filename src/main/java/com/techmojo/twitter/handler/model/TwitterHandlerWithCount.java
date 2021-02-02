package com.techmojo.twitter.handler.model;

import java.util.Objects;

public class TwitterHandlerWithCount {

    public Integer count;
    public String handlerName;

    public TwitterHandlerWithCount(Integer count, String handlerName) {
        this.count = count;
        this.handlerName = handlerName;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    public Integer getCount() {
        return count;
    }

    public String getHandlerName() {
        return handlerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TwitterHandlerWithCount)) return false;
        TwitterHandlerWithCount that = (TwitterHandlerWithCount) o;
        return count.equals(that.count) &&
                handlerName.equals(that.handlerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, handlerName);
    }

    @Override
    public String toString() {
        return handlerName;
    }
}
