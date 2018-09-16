package com.neusoft.SSMTest.bean;

/**
 * Created by xhbg on 2018/9/5.
 */

public class Game {

    //public static final String TABLE_ALIAS = "Game";
    //public static final String ALIAS_ID = "游戏Id 自增生成，必须是唯一的";
    //public static final String ALIAS_NAME = "游戏名";
    //public static final String ALIAS_HOT = "热度";
    //public static final String ALIAS_ICON = "图标地址";
    //public static final String ALIAS_LETTER = "首字母";
    //public static final String ALIAS_HOMEPAGE = "是否首页";
    //public static final String ALIAS_TYPE = "type";

    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    //
    //游戏Id 自增生成，必须是唯一的
    private Integer id;
    //@Length(max=100)
    //游戏名
    private String name;
    //
    //热度
    private Integer hot;
    //@Length(max=100)
    //图标地址
    private String icon;
    //@Length(max=10)
    //首字母
    private String letter;
    //@Length(max=10)
    //是否首页
    private String homepage;
    //@Length(max=10)
    //type
    private String type;
    //columns END


    public void setId(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return this.id;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return this.name;
    }

    public void setHot(Integer value) {
        this.hot = value;
    }

    public Integer getHot() {
        return this.hot;
    }

    public void setIcon(String value) {
        this.icon = value;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setLetter(String value) {
        this.letter = value;
    }

    public String getLetter() {
        return this.letter;
    }

    public void setHomepage(String value) {
        this.homepage = value;
    }

    public String getHomepage() {
        return this.homepage;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getType() {
        return this.type;
    }


}





