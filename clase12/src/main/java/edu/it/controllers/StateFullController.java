package edu.it.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public class StateFullController extends HttpServlet {
	Logger logger = Logger.getLogger(getClass());

	Integer c = 1000;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            
            try {
            	var mapa = new HashMap<String, String>();
            	
            	mapa.put("contador", c+"");
            	c++;
            	
            	var strOut = new Gson().toJson(mapa);
            	
            	out.println(strOut);
                response.setStatus(200);
            }
            catch (Exception ex) {
            	throw new IOException(ex.getMessage());
            }
    }
}
