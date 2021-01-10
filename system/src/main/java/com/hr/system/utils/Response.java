package com.hr.system.utils;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Response<T> {
    private String code;
    private String msg;
    private Integer count;
    private T data;
    private String token;//请求验证

    private static Response re=null;



    public static synchronized Response bulid(){
        if (re==null){
            re= new Response<Void>();
        }
        return re;
    }




    public Response Respose(String code, String msg, int count, T t) {
        setCount(count);
        setCode(code);
        setMsg(msg);
        setData(t);
        return re;
    }

    public Response ResposeSuccessWithObject(T t) {
        setCode("OK");
        setMsg("成功");
        setData(t);
        return re;
    }

    public Response ResposeSuccess(int count, T t) {
        setCode("OK");
        setMsg("成功");
        setCount(count);
        setData(t);
        return re;
    }

    public Response ResposeSuccessWithObject(int count, String msg, T t) {
        setCode("OK");
        setMsg(msg);
        setCount(count);
        setData(t);
        return re;
    }

    public Response ResposeSuccess(String msg) {
        setCode("OK");
        setMsg(msg);
        setCount(0);
        setData(null);
        return re;
    }

    public Response ResposeFailed(String msg) {
        setCode("NO");
        setMsg(msg);
        setCount(0);
        setData(null);
        return re;
    }






}
