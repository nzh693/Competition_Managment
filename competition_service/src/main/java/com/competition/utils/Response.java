package com.competition.utils;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static Response getRe() {
        return re;
    }

    public static void setRe(Response re) {
        Response.re = re;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }





    public Response Respose(String code, String msg, int count, T t) {
        setCount(count);
        setCode(code);
        setMsg(msg);
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

    public Response ResposeSuccess(int count, String msg, T t) {
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



    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
