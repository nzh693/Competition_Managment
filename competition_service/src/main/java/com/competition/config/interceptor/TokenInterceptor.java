package com.competition.config.interceptor;

import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    private Logger logger= LoggerFactory.getLogger(TokenInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Boolean verifyRe=false;
        String token=request.getHeader("token");
//         第一次option请求，不带请求头参数;如果是OPTIONS请求，放行
        if (HttpMethod.OPTIONS.toString().equals(request.getMethod())) {
            return true;
        } else if (token == null) {
            logger.info("********拦截路径: "+request.getRequestURI()+" ---------验证结果: "+verifyRe);
            return false;
        }
        else {
            //验证

            if (!verifyRe){
                response.setHeader("check","false");
            }
        }
        logger.info("********拦截路径: "+request.getRequestURI()+" ---------验证结果: "+verifyRe);
        return verifyRe;
    }
}
