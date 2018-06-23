package com.test.base;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        System.out.println("before");
        System.out.println(httpServletRequest.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("after");
    }

    @Override
    public void destroy() {

    }
}
