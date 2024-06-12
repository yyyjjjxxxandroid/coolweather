package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //@SerializedName注解就是Gson提供的特性之一，用于指定JSON字段与其对应的Java对象属性之间的映射关系。
    //告诉Gson库在进行JSON解析时，应该将JSON对象中名为city的字段值赋给Java对象的cityName属性

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
    //如果JSON数据中有这样的结构"update": {"loc": "2023-04-01T12:00:00Z"}，Gson在解析时就会把"2023-04-01T12:00:00Z"赋值给外部类实例的update.updateTime。
    //
    //整个代码段展示了如何在Java类中定义嵌套类
    //并通过Gson的@SerializedName注解来指示如何将JSON数据中的嵌套结构映射到Java对象的相应层级和属性上。这种设计使得处理复杂JSON数据变得直观且高效。
}
