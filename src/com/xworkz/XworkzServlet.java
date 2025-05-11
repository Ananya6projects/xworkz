package com.xworkz;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.GenericServlet;

@WebServlet(urlPatterns = "/bike", loadOnStartup = 1)
public class XworkzServlet extends GenericServlet {
    public XworkzServlet() {
        System.out.println("XworkzServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in XworkzServlet");
        String name = request.getParameter("name");
        String location = request.getParameter("location");
        String courses = request.getParameter("courses");
        String students = request.getParameter("students");
        String mentors = request.getParameter("mentors");
        String founder = request.getParameter("founder");
        String year = request.getParameter("year");
        String placement = request.getParameter("placement");
        String reviews = request.getParameter("reviews");
        String labs = request.getParameter("labs");
        String certification = request.getParameter("certification");
        String domain = request.getParameter("domain");
        String website = request.getParameter("website");
        String mode = request.getParameter("mode");
        System.out.println(name + ", " + location + ", " + courses + ", " + students + ", " + mentors + ", " + founder + ", " + year + ", " + placement + ", " + reviews + ", " + labs + ", " + certification + ", " + domain + ", " + website + ", " + mode);
    }
}
