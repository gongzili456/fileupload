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

public class CrossDomainFilter implements Filter {

	public CrossDomainFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		if (response instanceof HttpServletResponse
				&& request instanceof HttpServletRequest) {
			HttpServletResponse alertedResponse = (HttpServletResponse) response;
			HttpServletRequest alertedRequest = (HttpServletRequest) request;
			addHeadersFor200Rresponse(alertedResponse, alertedRequest);
		}

		chain.doFilter(request, response);

	}

	private void addHeadersFor200Rresponse(HttpServletResponse response,
			HttpServletRequest request) {
		// String origin = request.getHeader("Origin");
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods",
				"POST, GET, OPTIONS, PUT, DELETE, HEAD");
		response.addHeader("Access-Control-Allow-Headers",
				"X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept");
		response.addHeader("Access-Control-Max-Age", "1728000");
		response.addHeader("Access-Control-Allow-Credentials", "false");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
