package com.pluralsight.collection;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class FixedList<T>{
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item){
        if(items.size() <maxSize){
            items.add(item);
        }else{
            System.out.println("The list if full stupid");
            return;
        }
    }



}
