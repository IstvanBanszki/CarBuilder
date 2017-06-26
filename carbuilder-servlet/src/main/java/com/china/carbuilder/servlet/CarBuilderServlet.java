package com.china.carbuilder.servlet;

import com.china.carbuilder.model.Car;
import com.china.carbuilder.service.CarService;
import java.io.IOException;
import java.util.List;
import java.util.StringJoiner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CarBuilderServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request,
                       HttpServletResponse response)
        throws ServletException, IOException {

      List<Car> cars = new CarService().getCars();
      StringJoiner sj = new StringJoiner("</tr><tr>", 
              "<table><tr>"
                      + "<th>Brand</th>"
                      + "<th>Type</th>"
                      + "<th>BuildNumber</th>"
                      + "<th>Parts</th>"
                      + "</tr>"
                      + "<tr>", 
              "</tr></table>");
      
      for (Car car : cars) {
          sj.add(makeTableRow(car));
      }
      response.getWriter().write("<html><body>GET response"+sj.toString()+"</body></html>");
  }
    
  private String makeTableRow(Car car) {
      return new StringJoiner("</td><td>", "<td>", "</td>")
              .add(car.getCarData().getBrand())
              .add(car.getCarData().getType())
              .add(String.valueOf(car.getCarData().getBuildNumber()))
              .add(car.getParts().toString())
              .toString();
  }
  
}
