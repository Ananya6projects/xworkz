package com.xworkz;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/movie", loadOnStartup = 1)
public class MovieServlet extends GenericServlet {

    public MovieServlet() {
        System.out.println("MovieServlet created by Tomcat");
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Running service in MovieServlet");

        String name = request.getParameter("name");
        String genre = request.getParameter("genre");
        String rating = request.getParameter("rating");
        String director = request.getParameter("director");
        String year = request.getParameter("year");

        System.out.println("Movie Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Director: " + director);
        System.out.println("Year: " + year);
    }
}