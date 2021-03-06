/*
 * IBM Confidential
 *
 * OCO Source Materials
 *
 * Copyright IBM Corp. 2011
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.ibm.logs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TraceURL")
public class TraceServlet extends HttpServlet {
    /*
     * @Override
     * public void init(ServletConfig config) throws ServletException
     * {
     * ServletContext sc = getServletContext();
     * }
     */

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //Set up the logger for this class
        String loggerName = "com.ibm.logs.TraceServlet";
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(loggerName);
        //Log the trace message
        logger.logp(java.util.logging.Level.FINE, loggerName, "Method.Info", "TEST JUL TRACE");

        PrintWriter out;
        res.setContentType("text/html");
        out = res.getWriter();
        out.println("<HTML><HEAD><TITLE>Trace Servlet</TITLE></HEAD><BODY BGCOLOR=\"#FFFFEE\">Trace Servlet</BODY></HTML>");

    }
}
