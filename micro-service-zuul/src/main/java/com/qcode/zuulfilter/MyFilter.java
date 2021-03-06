package com.qcode.zuulfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter{
	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
	@Override
	public String filterType() {

		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format(" %s >>> %s ", request.getMethod(), request.getRequestURL().toString()));
		String token = request.getParameter("token");
		if(StringUtils.isBlank(token)){
			log.warn("token is blank.");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(500);
			try {
				ctx.getResponse().getWriter().write("token is blank");
			} catch (IOException e) {
				log.error("exception:", e);
			}

			return null;
		}
		log.debug("pass, token:{}", token);
		return null;
	}
}
