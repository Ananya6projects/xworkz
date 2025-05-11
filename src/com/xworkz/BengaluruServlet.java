package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/bengaluru", loadOnStartup = 1)
public class BengaluruServlet  extends GenericServlet {
        public BengaluruServlet() {
            System.out.println("BengaluruServlet created by Tomcat");
        }
        @Override
        public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
            System.out.println("Running service in BengaluruServlet");
            String name = request.getParameter("name");
            String population = request.getParameter("population");
            String language = request.getParameter("language");
            String state = request.getParameter("state");
            String climate = request.getParameter("climate");
            String area = request.getParameter("area");
            String techHub = request.getParameter("techHub");
            String nickname = request.getParameter("nickname");
            String parks = request.getParameter("parks");
            String metro = request.getParameter("metro");
            String airport = request.getParameter("airport");
            String pubs = request.getParameter("pubs");
            String universities = request.getParameter("universities");
            String itCompanies = request.getParameter("ITcompanies");
            String famousFor = request.getParameter("famousFor");
            String zones = request.getParameter("zones");

            System.out.println(name + ", " + population + ", " + language + ", " + state + ", " + climate + ", " + area + ", " + techHub + ", " + nickname + ", " + parks + ", " + metro + ", " + airport + ", " + pubs + ", " + universities + ", " + itCompanies + ", " + famousFor + ", " + zones);
        }
}
