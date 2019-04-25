package com.xuexiang.xupdateservice.api.response;

import java.util.List;

/**
 * 分页请求的响应数据
 *
 * @author xuexiang
 * @since 2019/4/25 下午11:52
 */
public class PageData<T> {

    private List<T> array;

    private long total;

    private int pageNum;

    private int pageSize;

    public PageData() {
    }

    public PageData(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public List<T> getArray() {
        return array;
    }

    public PageData<T> setArray(List<T> array) {
        this.array = array;
        return this;
    }

    public long getTotal() {
        return total;
    }

    public PageData<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    public int getPageNum() {
        return pageNum;
    }

    public PageData<T> setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public PageData<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
