package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class fruitSelect extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("fruit selection advice<br>");
        String c=request.getParameter("color");
        out.println("<br>Got fruit color "+c);

//        out.println("<br> There are many choices:");
//        for(String choi:choices)
//        {
//            out.println(""+choi);
//        }

//        fruitChoices fc=new fruitChoices();
//        List<String> choices=fc.getFruitChoices(c);
//        Iterator it=choices.iterator();
//        out.println("<br>there are many choices:");
//        while(it.hasNext())
//        {
//        	out.println("<br>"+it.next());
//        }
        fruitChoices fruitchoices=new fruitChoices();
        List<String> result=fruitchoices.getFruitChoices(c);
        request.setAttribute("styles", result);
        RequestDispatcher view=request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
