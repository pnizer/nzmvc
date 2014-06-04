package org.nzmvc.servlet

import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}

/**
 * Created by Nizer on 02/06/2014.
 */
object NzServlet extends HttpServlet {
  override def doGet (request : HttpServletRequest, response: HttpServletResponse) = {
    response.getWriter.print("Hello! Your path is: " + request.getPathInfo)
  }
}
