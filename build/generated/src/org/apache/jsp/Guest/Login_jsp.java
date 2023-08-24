package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(request.getParameter("btnlogin")!=null)
            {
                String selu="select * from tbl_user where user_email='"+request.getParameter("txtuname")+"' and user_password='"+request.getParameter("txtpwd")+"' ";
                ResultSet rs=con.selectCommand(selu);
                
                String selw="select * from tbl_worker where worker_email='"+request.getParameter("txtuname")+"' and worker_password='"+request.getParameter("txtpwd")+"' and worker_vstatus='1'";
                ResultSet rs1=con.selectCommand(selw);
                
                String sell="select * from tbl_landlord where landlord_email='"+request.getParameter("txtuname")+"' and landlord_password='"+request.getParameter("txtpwd")+"' and landlord_vstatus='1'";
                ResultSet res=con.selectCommand(sell);
                
                String selAdmin="select * from tbl_admin where admin_username='"+request.getParameter("txtuname")+"' and admin_password='"+request.getParameter("txtpwd")+"' ";
                ResultSet rsAdmin=con.selectCommand(selAdmin);
                
                String sels="select * from tbl_shop where shop_email='"+request.getParameter("txtuname")+"' and shop_password='"+request.getParameter("txtpwd")+"' and shop_vstatus='1'";
                ResultSet ress=con.selectCommand(sels);
                
                if(rs.next())
                {
                    session.setAttribute("userid",rs.getString("user_id"));
                    session.setAttribute("username", rs.getString("user_name"));
                    response.sendRedirect("../User/Homepage.jsp");
                }
                else if(rs1.next())
                {
                    session.setAttribute("workerid",rs1.getString("worker_id"));
                    session.setAttribute("workername", rs1.getString("worker_name"));
                    response.sendRedirect("../Worker/Homepage.jsp");
                }
                else if(res.next())
                {
                    session.setAttribute("landlordid",res.getString("landlord_id"));
                    session.setAttribute("landlordname", res.getString("landlord_name"));
                    response.sendRedirect("../Landlord/Homepage.jsp");
                }
                else if(ress.next())
                {
                    session.setAttribute("shopid",ress.getString("shop_id"));
                    session.setAttribute("shopname", ress.getString("shop_name"));
                    response.sendRedirect("../Shop/Homepage.jsp");
                }
                 else if(rsAdmin.next())
                {
                    session.setAttribute("adminid",rsAdmin.getString("admin_id"));
                    session.setAttribute("adminusername", rsAdmin.getString("admin_username"));
                    response.sendRedirect("../Admin/Homepage.jsp");
                }
                else
                {
                    
      out.write("\n");
      out.write("                    <script>alert('Invalid Login')</script>\n");
      out.write("                    ");

                }
            }
        
      out.write("\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <form name=\"frmlogin\" method=\"post\" >\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("                <tr>\n");
      out.write("                   <td>User Email</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtuname\" value=\"\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"txtpwd\" value=\"\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"btnlogin\" value=\"LOGIN\">\n");
      out.write("                        <input type=\"reset\" name=\"btnreset\" value=\"CANCEL\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <a href=\"User.jsp\">NewUser</a> | \n");
      out.write("                        <a href=\"Worker.jsp\">NewWorker</a> |\n");
      out.write("                        <a href=\"Landlord.jsp\">NewLandlord</a> \n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("            </table> \n");
      out.write("        </form>  \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
