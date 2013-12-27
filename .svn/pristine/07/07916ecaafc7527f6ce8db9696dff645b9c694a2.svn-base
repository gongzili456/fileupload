package cn.gongzili.upload.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharSetFilter implements Filter {

	private static final String DEFAULTCHARACT = "UTF-8";

	public CharSetFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (response instanceof HttpServletResponse
				&& request instanceof HttpServletRequest) {
			HttpServletRequest httpRequest = (HttpServletRequest) request;
			HttpServletResponse httprResponse = (HttpServletResponse) response;
			httpRequest.setCharacterEncoding(DEFAULTCHARACT);
			httprResponse.setCharacterEncoding(DEFAULTCHARACT);
			response.setContentType("text/html");
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
