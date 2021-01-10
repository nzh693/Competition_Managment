package com.hr.system.utils;

import lombok.Data;

@Data
public class Request<T> {

    /**
     * 请求参数id
     */
    private Long id;

    private T data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
