package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/myself", loadOnStartup = 1)

public class MyselfServlet extends GenericServlet {
        public MyselfServlet() {
            System.out.println("MyselfServlet created by Tomcat");
        }

        @Override
        public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
            System.out.println("Running service in MyselfServlet");
            String name = request.getParameter("name");
            String age = request.getParameter("age");
            String city = request.getParameter("city");
            String college = request.getParameter("college");
            String branch = request.getParameter("branch");
            String semester = request.getParameter("semester");
            String skills = request.getParameter("skills");
            String hobbies = request.getParameter("hobbies");
            String goal = request.getParameter("goal");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String internship = request.getParameter("internship");
            String github = request.getParameter("github");
            String linkedin = request.getParameter("linkedin");
            String strengths = request.getParameter("strengths");
            String weaknesses = request.getParameter("weaknesses");
            String motivation = request.getParameter("motivation");

            System.out.println(name + ", " + age + ", " + city + ", " + college + ", " + branch + ", " + semester + ", " + skills + ", " + hobbies + ", " + goal + ", " + email + ", " + phone + ", " + internship + ", " + github + ", " + linkedin + ", " + strengths + ", " + weaknesses + ", " + motivation);
        }
}
