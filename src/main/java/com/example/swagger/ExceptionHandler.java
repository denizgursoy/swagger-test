package com.example.swagger;

import com.example.swagger.exceptions.InventoryException;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class ExceptionHandler extends AbstractHandlerExceptionResolver {
    @Override
    protected ModelAndView doResolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        if (e instanceof InventoryException) {
            InventoryException inventoryException = (InventoryException) e;

            httpServletResponse.setContentType("application/json");
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setStatus(inventoryException.getStatus().value());


            PrintWriter out = null;
            try {
                out = httpServletResponse.getWriter();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            out.print(new Gson().toJson(inventoryException));
            out.flush();
        }else{
            httpServletResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        }
        return new ModelAndView();
    }
}
