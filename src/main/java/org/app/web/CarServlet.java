package org.app.web;

import org.app.model.Car;
import org.app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

//@WebServlet(name = "CarServlet")
public class CarServlet extends HttpServlet {
//
//    @Autowired
//    private CarRepository repository;
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        String id = request.getParameter("id");
//
//        Car car = new Car();//new Car(id.isEmpty() ? null : Long.valueOf(id), request.getParameter("car"));
//
//        repository.add(car);
//        response.sendRedirect("cars");
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//
//        if (action == null) {
//            //request.setAttribute("cars",
//            //        MealsUtil.getWithExceeded(repository.getAll(), MealsUtil.DEFAULT_CALORIES_PER_DAY));
//            request.getRequestDispatcher("/cars.jsp").forward(request, response);
//
//        } else if ("delete".equals(action)) {
//            long id = getId(request);
//            repository.remove(id);
//            response.sendRedirect("cars");
//
//        } else if ("create".equals(action) || "update".equals(action)) {
//            final Car car = new Car();/*action.equals("create") ?
//                    new Car() :
//                    repository.get(getId(request));*/
//            request.setAttribute("car", car);
//            request.getRequestDispatcher("car.jsp").forward(request, response);
//        }
//    }
//
//    private long getId(HttpServletRequest request) {
//        String paramId = Objects.requireNonNull(request.getParameter("id"));
//        return Long.valueOf(paramId);
//    }
}
