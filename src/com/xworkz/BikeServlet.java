package com.xworkz;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/bike", loadOnStartup = 1)
public class BikeServlet extends GenericServlet {

    public BikeServlet() {
        System.out.println("BikeServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in BikeServlet");
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        String cc = request.getParameter("cc");
        String type = request.getParameter("type");
        String price = request.getParameter("price");
        String color = request.getParameter("color");
        String topSpeed = request.getParameter("topSpeed");
        String abs = request.getParameter("ABS");
        String fuelType = request.getParameter("fuelType");
        String weight = request.getParameter("weight");
        String milage = request.getParameter("milage");
        String brakes = request.getParameter("brakes");
        String year = request.getParameter("year");
        String gear = request.getParameter("gear");

        System.out.println(brand + ", " + model + ", " + cc + ", " + type + ", " + price + ", " + color + ", " + topSpeed + ", " + abs + ", " + fuelType + ", " + weight + ", " + milage + ", " + brakes + ", " + year + ", " + gear);
    }
}
