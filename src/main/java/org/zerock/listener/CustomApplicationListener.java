package org.zerock.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CustomApplicationListener implements ServletContextListener {

    public CustomApplicationListener() {
    }
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        // application 영역에 attribute를 추가
        ServletContext application = sce.getServletContext();
        application.setAttribute("imgUrl", "https://yeongjin20220802.s3.ap-northeast-2.amazonaws.com/prj1/board");


    }

    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or Application Server shuts down. */
    }

}
