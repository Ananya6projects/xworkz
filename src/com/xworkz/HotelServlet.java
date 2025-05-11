package com.xworkz;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/hotel", loadOnStartup = 1)
public class HotelServlet extends GenericServlet {

    public HotelServlet() {
        System.out.println("HotelServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in HotelServlet");
        String name = request.getParameter("name");
        String stars = request.getParameter("stars");
        String city = request.getParameter("city");
        String rooms = request.getParameter("rooms");
        String type = request.getParameter("type");
        String rating = request.getParameter("rating");
        String contact = request.getParameter("contact");

        System.out.println(name + ", " + stars + ", " + city + ", " + rooms + ", " + type + ", " + rating + ", " + contact);
    }
}