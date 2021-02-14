/*
 * Copyright (C) 2018 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xuexiang.xupdateservice.api.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xuexiang.xupdateservice.exception.ApiException;

import java.lang.reflect.Field;

/**
 * 提供的默认的标注返回api
 *
 * @author pppscn
 * @since 2021-02-14
 */
public class XUpdateAPI<T> {

    /*
{
  "Code": 0, //0代表请求成功，非0代表失败
  "Msg": "", //请求出错的信息
  "UpdateStatus": 1, //0代表不更新，1代表有版本更新，不需要强制升级，2代表有版本更新，需要强制升级
  "VersionCode": 3,
  "VersionName": "1.0.2",
  "ModifyContent": "1、优化api接口。\r\n2、添加使用demo演示。\r\n3、新增自定义更新服务API接口。\r\n4、优化更新提示界面。",
  "DownloadUrl": "https://raw.githubusercontent.com/xuexiangjys/XUpdate/master/apk/xupdate_demo_1.0.2.apk",
  "ApkSize": 2048
  "ApkMd5": "..."  //md5值没有的话，就无法保证apk是否完整，每次都会重新下载。
}
    */
    @JsonProperty(value = "Code")
    private int Code = 0;
    @JsonProperty(value = "Msg")
    private String Msg = "";
    @JsonProperty(value = "UpdateStatus")
    private Integer UpdateStatus = 0;
    @JsonProperty(value = "VersionCode")
    private Integer VersionCode = 0;
    @JsonProperty(value = "VersionName")
    private String VersionName = "";
    @JsonProperty(value = "ModifyContent")
    private String ModifyContent = "";
    @JsonProperty(value = "DownloadUrl")
    private String DownloadUrl = "";
    @JsonProperty(value = "ApkSize")
    private Integer ApkSize = 0;
    @JsonProperty(value = "ApkMd5")
    private String ApkMd5 = "";
    //@JsonProperty(value = "data")
    private T Data;

    @JsonIgnore
    public int getCode() {
        return Code;
    }

    @JsonIgnore
    public XUpdateAPI<T> setCode(int code) {
        Code = code;
        return this;
    }

    @JsonIgnore
    public String getMsg() {
        return Msg;
    }

    @JsonIgnore
    public XUpdateAPI<T> setMsg(String msg) {
        Msg = msg;
        return this;
    }

    @JsonIgnore
    public T getData() {
        return Data;
    }

    @JsonIgnore
    public XUpdateAPI<T> setData(String url, T data) {
        Data = data;
        UpdateStatus = (Integer) this.getValueByKey(data, "updateStatus");
        VersionCode = (Integer) this.getValueByKey(data, "versionCode");
        VersionName = this.getValueByKey(data, "versionName").toString();
        ModifyContent = this.getValueByKey(data, "modifyContent").toString();
        DownloadUrl = url + "/update/apk/" + this.getValueByKey(data, "downloadUrl").toString();
        ApkSize = (Integer) this.getValueByKey(data, "apkSize");
        ApkMd5 = this.getValueByKey(data, "apkMd5").toString();
        return this;
    }

    @JsonIgnore
    public XUpdateAPI setError(int code, String msg) {
        Code = code;
        Msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "Code='" + Code + '\'' +
                ", Msg='" + Msg + '\'' +
                ", Data=" + Data +
                '}';
    }


    /**
     * 获取出错返回
     *
     * @param ex
     * @return
     */
    public static XUpdateAPI error(ApiException ex) {
        XUpdateAPI apiResult = new XUpdateAPI();
        apiResult.setError(ex.getCode(), ex.getMessage());
        return apiResult;
    }

    /**
     * 获取出错返回
     *
     * @param code
     * @param msg
     * @return
     */
    public static XUpdateAPI error(int code, String msg) {
        XUpdateAPI apiResult = new XUpdateAPI();
        apiResult.setError(code, msg);
        return apiResult;
    }

    /**
     * 单个对象的某个键的值
     *
     * @param obj 对象
     * @param key 键
     * @return Object 键在对象中所对应得值 没有查到时返回空字符串
     */
    @JsonIgnore
    public Object getValueByKey(Object obj, String key) {
        // 得到类对象
        Class userCla = (Class) obj.getClass();
        /* 得到类中的所有属性集合 */
        Field[] fs = userCla.getDeclaredFields();
        for (int i = 0; i < fs.length; i++) {
            Field f = fs[i];
            f.setAccessible(true); // 设置些属性是可以访问的
            try {

                if (f.getName().endsWith(key)) {
                    System.out.println("单个对象的某个键的值==反射==" + f.get(obj));
                    return f.get(obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        // 没有查到时返回空字符串
        return "";
    }
}
