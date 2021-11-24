package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.Meal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.slf4j.LoggerFactory.getLogger;

public class EditMealServlet extends HttpServlet {
    private static final Logger log = getLogger(EditMealServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("redirect to editMeal");

        request.getRequestDispatcher("/editMeal.jsp").forward(request, response);
//        response.sendRedirect("editMeal.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dateTimeString = request.getParameter("dateTime");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

        String description = request.getParameter("description");
        String calories = request.getParameter("calories");
        int caloriesInt = Integer.parseInt(calories);

        Meal meal = new Meal(dateTime, description, caloriesInt);

        request.getRequestDispatcher("/meals.jsp").forward(request, response);
    }
}
