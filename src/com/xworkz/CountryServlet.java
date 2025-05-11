package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/country", loadOnStartup = 1)
public class CountryServlet extends GenericServlet {

    public CountryServlet() {
        System.out.println("CountryServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in CountryServlet");
        String name = request.getParameter("name");
        String capital = request.getParameter("capital");
        String population = request.getParameter("population");
        String currency = request.getParameter("currency");
        String language = request.getParameter("language");
        String area = request.getParameter("area");
        String flag = request.getParameter("flag");
        String anthem = request.getParameter("anthem");
        String pm = request.getParameter("pm");
        String states = request.getParameter("states");
        String neighbors = request.getParameter("neighbors");
        String continent = request.getParameter("continent");
        String zone = request.getParameter("zone");

        System.out.println(name + ", " + capital + ", " + population + ", " + currency + ", " + language + ", " + area + ", " + flag + ", " + anthem + ", " + pm + ", " + states + ", " + neighbors + ", " + continent + ", " + zone);
    }
}
