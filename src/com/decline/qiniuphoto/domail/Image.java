package com.decline.qiniuphoto.domail;

import java.io.Serializable;
import java.util.Date;

/**
 * ͼƬ��
 * @author www.shiyanlou.com
 *
 */
@SuppressWarnings("serial")
public class Image implements Serializable {
    private int id;    //ͼƬID
    private String name;    //ͼƬ��
    private String url;    //ͼƬURL
    private Date date;    //�ϴ�ʱ��
    private User user;    //�����û�

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}