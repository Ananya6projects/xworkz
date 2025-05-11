package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/temple", loadOnStartup = 1)
public class TempleServlet extends GenericServlet {

    public TempleServlet() {
        System.out.println("TempleServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in TempleServlet");
        String name = request.getParameter("name");
        String location = request.getParameter("location");
        String god = request.getParameter("god");
        String age = request.getParameter("age");
        String type = request.getParameter("type");
        String open = request.getParameter("open");
        String close = request.getParameter("close");
        String festivals = request.getParameter("festivals");
        String entryFee = request.getParameter("entryFee");
        String rating = request.getParameter("rating");
        String city = request.getParameter("city");

        System.out.println(name + ", " + location + ", " + god + ", " + age + ", " + type + ", " + open + ", " + close + ", " + festivals + ", " + entryFee + ", " + rating + ", " + city);
    }
}


