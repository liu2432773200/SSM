package com.liu.filter;

import org.springframework.stereotype.Component;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebFilter(urlPatterns = {"/*"}, filterName = "EncodeFilter", description = "全站乱码过滤器", initParams = {@WebInitParam(name = "encode", value = "utf-8")})
public class EncodeFilter implements Filter {
	private String encode;

	@Override
	public void init(FilterConfig config) throws ServletException {
		/*
		 * 判断在web.xml文件中是否配置了编码格式的信息
		 * 如果为空，则设置编码格式为配置文件中的编码格式
		 * 否则编码格式设置为UTF-8
		 */
		encode = config.getInitParameter("encode")!=null&&!(config.getInitParameter("encode")).equals("")?config.getInitParameter("encode"):"UTF-8";
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
	                     FilterChain chain) throws IOException, ServletException {
		//转换
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		//把编码格式设置为encode的值
		request.setCharacterEncoding(encode);
		response.setCharacterEncoding(encode);
		/*
		 * 使用doFilter方法调用链中的下一个过滤器或目标资源（servlet或JSP页面）。
		 * chain.doFilter处理过滤器的其余部分（如果有的话），最终处理请求的servlet或JSP页面。
		 */
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
