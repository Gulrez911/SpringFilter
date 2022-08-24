package com.gul.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
//		working
		
//		System.out.println("-- In MyFilter --");
//		HttpServletRequest req = (HttpServletRequest) request;
//		System.out.println("URI: " + req.getRequestURI());
//		chain.doFilter(request, response);
		
//		end
		
		try {
			String page = ((HttpServletRequest)request).getRequestURI();
			System.out.println("-- In MyFilter --");
			System.out.println("URI: " + page);
			chain.doFilter(request, response);
		}catch (Exception e) {
			
			System.out.println("--exception --"+e);
			((HttpServletResponse)response).sendRedirect("error");
			// TODO: handle exception
		}
	}

	@Override
	public void destroy() {
	}
}