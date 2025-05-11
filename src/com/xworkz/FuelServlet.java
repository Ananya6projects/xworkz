package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/fuel", loadOnStartup = 1)
public class FuelServlet extends GenericServlet {

    public FuelServlet() {
        System.out.println("FuelServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in FuelServlet");
        String name = request.getParameter("name");
        String location = request.getParameter("location");
        String type = request.getParameter("type");
        String diesel = request.getParameter("diesel");
        String cng = request.getParameter("cng");
        String open = request.getParameter("open");
        String close = request.getParameter("close");
        String rating = request.getParameter("rating");
        String contact = request.getParameter("contact");

        System.out.println(name + ", " + location + ", " + type + ", " + diesel + ", " + cng + ", " + open + ", " + close + ", " + rating + ", " + contact);
    }
}
