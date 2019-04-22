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

/**
 * 提供的默认的标注返回api
 *
 * @author xuexiang
 * @since 2018/5/22 下午4:22
 */
public class ApiResult<T> {

    @JsonProperty(value = "code")
    private int Code = 0;
    @JsonProperty(value = "msg")
    private String Msg = "";
    @JsonProperty(value = "data")
    private T Data;

    @JsonIgnore
    public int getCode() {
        return Code;
    }

    @JsonIgnore
    public ApiResult<T> setCode(int code) {
        Code = code;
        return this;
    }

    @JsonIgnore
    public String getMsg() {
        return Msg;
    }

    @JsonIgnore
    public ApiResult<T> setMsg(String msg) {
        Msg = msg;
        return this;
    }

    @JsonIgnore
    public T getData() {
        return Data;
    }

    @JsonIgnore
    public ApiResult<T> setData(T data) {
        Data = data;
        return this;
    }

    @JsonIgnore
    public ApiResult setError(int code, String msg) {
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
    public static ApiResult error(ApiException ex) {
        ApiResult apiResult = new ApiResult();
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
    public static ApiResult error(int code, String msg) {
        ApiResult apiResult = new ApiResult();
        apiResult.setError(code, msg);
        return apiResult;
    }
}
