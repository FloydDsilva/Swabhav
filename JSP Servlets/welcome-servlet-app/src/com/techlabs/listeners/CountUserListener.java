package com.techlabs.listeners;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountUserListener
 *
 */
@WebListener
public class CountUserListener implements HttpSessionListener {

	ServletContext ctx = null;
    static int     totalUserCount = 0, currentUserCount = 0;
    public CountUserListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("sessionCreated method has been called in "
                + this.getClass().getName());

        
        totalUserCount++;
        currentUserCount++;

        ctx = se.getSession().getServletContext();
        
        ctx.setAttribute("totalusers", totalUserCount);
        ctx.setAttribute("currentusers", currentUserCount);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("sessionDestroyed method has been called in "
                + this.getClass().getName());       
        currentUserCount--;
        ctx.setAttribute("currentusers", currentUserCount);
    }
	
}
