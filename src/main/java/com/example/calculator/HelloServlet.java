package com.example.calculator;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        try{
            int num1,num2;
            num1 = Integer.parseInt(request.getParameter("t1"));
            num2 = Integer.parseInt(request.getParameter("t2"));

            if (request.getParameter("b1")!=null){
                out.println(num1+num2);
            }if (request.getParameter("b2")!=null){
                out.println(num1-num2);
            }if (request.getParameter("b3")!=null){
                out.println(num1*num2);
            }if (request.getParameter("b4")!=null){
                out.println(num1/num2);
            }
        }catch (Exception e){
            out.println(e);
        }
    }

    public void destroy() {
    }
}