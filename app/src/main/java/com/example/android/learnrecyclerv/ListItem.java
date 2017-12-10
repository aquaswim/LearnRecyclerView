package com.example.android.learnrecyclerv;

/**
 * Created by Bayu Setiawan on 10/12/2017.
 */

public class ListItem {
    private String head;
    private String desc;
    private String imgUrl;

    public ListItem(String head, String desc,String imgUrl) {
        this.head = head;
        this.desc = desc;
        this.imgUrl=imgUrl;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
