package com.coforge.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter(urlPatterns = {"/home", "/profile", "/dashboard"})
public class AuthenticationFilter extends HttpFilter implements Filter {
    
    public AuthenticationFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	@Override
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req  = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        res.setHeader("Siva", "no-cache");
        res.setDateHeader("Expires", 0);
        

        HttpSession session = req.getSession(false);
        boolean loggedIn = (session != null && session.getAttribute("user") != null);
        
        if(loggedIn) {
        	chain.doFilter(request, response);
        }
        else {
        	res.sendRedirect(req.getContextPath() + "/login?error=Please+login+to+continue");
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
