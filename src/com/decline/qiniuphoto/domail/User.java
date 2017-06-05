package com.decline.qiniuphoto.domail;

import java.io.Serializable;
import java.util.List;

/**
 * �û���
 * @author www.shiyanlou.com
 *
 */
@SuppressWarnings("serial")
public class User implements Serializable {
    private int id;    //�û�ID
    private String username;    //�û���
    private String password;    //����
    private List<Image> images;    //ͼƬ�б�

    public User() {
    }

    public User(int id, String username, String password, List<Image> images) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.images = images;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}