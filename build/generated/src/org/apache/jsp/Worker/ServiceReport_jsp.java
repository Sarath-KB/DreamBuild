package org.apache.jsp.Worker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class ServiceReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Worker/SessionValidator.jsp");
    _jspx_dependants.add("/Worker/Head.jsp");
    _jspx_dependants.add("/Worker/Foot.jsp");
  }

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
      out.write(" \n");
      out.write("     ");

        response.setHeader("Cache-Control", "no-cache, no-store");
        if(session.getAttribute("workerid") == null)
        {
            response.sendRedirect("../");
        }
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Service Booking Report</title>\n");
      out.write("        <style>\n");
      out.write("            .red{\n");
      out.write("                text-align: center;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("            .green{\n");
      out.write("                text-align: center;\n");
      out.write("                color: yellowgreen;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .orange{\n");
      out.write("                text-align: center;\n");
      out.write("                color: orange;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"form.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>DREAM BUILD</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"keywords\">\n");
      out.write("        <meta content=\"Construction Company Website Template\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"../Template/Main/img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- CSS Libraries -->\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/Template/Main/lib/flaticon/font/flaticon.css\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"../Template/Main/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/slick/slick.css\" rel=\"stylesheet\">\n");
      out.write("          <link href=\"../Template/form.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Template/Main/lib/slick/slick-theme.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Template Stylesheet -->\n");
      out.write("        <link href=\"../Template/Main/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <!-- Top Bar Start -->\n");
      out.write("            <div class=\"top-bar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row align-items-center\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                            <div class=\"logo\">\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <h1>DREAM BUILD</h1>\n");
      out.write("                                    <!-- <img src=\"../Template/Main/img/logo.jpg\" alt=\"Logo\"> -->\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-8 col-md-7 d-none d-lg-block\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"top-bar-item\">\n");
      out.write("                                        <div class=\"top-bar-icon\">\n");
      out.write("                                            <i class=\"flaticon-calendar\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"top-bar-text\">\n");
      out.write("                                            <h3>Opening Hour</h3>\n");
      out.write("                                            <p>Mon - Fri, 8:00 - 9:00</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"top-bar-item\">\n");
      out.write("                                        <div class=\"top-bar-icon\">\n");
      out.write("                                            <i class=\"flaticon-call\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"top-bar-text\">\n");
      out.write("                                            <h3>Call Us</h3>\n");
      out.write("                                            <p>9999999999</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-4\">\n");
      out.write("                                    <div class=\"top-bar-item\">\n");
      out.write("                                        <div class=\"top-bar-icon\">\n");
      out.write("                                            <i class=\"flaticon-send-mail\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"top-bar-text\">\n");
      out.write("                                            <h3>Email Us</h3>\n");
      out.write("                                            <p>thedreambuildgroup@gmail.com</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Top Bar End -->\n");
      out.write("\n");
      out.write("            <!-- Nav Bar Start -->\n");
      out.write("            <div class=\"nav-bar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">\n");
      out.write("                        <a href=\"../Template/Main/#\" class=\"navbar-brand\">MENU</a>\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                           <div class=\"navbar-nav mr-auto\">\n");
      out.write("                                <a href=\"Homepage.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Profile</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"MyProfile.jsp\" class=\"dropdown-item\">My Profile</a>\n");
      out.write("                                        <a href=\"EditProfile.jsp\" class=\"dropdown-item\">Edit Profile</a>\n");
      out.write("                                        <a href=\"ChangePassword.jsp\" class=\"dropdown-item\">Change Password</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"Land.jsp\" class=\"nav-item nav-link\">Land Details</a>\n");
      out.write("<!--                                <a href=\"SearchLabour.jsp\" class=\"nav-item nav-link\">Labour</a>-->\n");
      out.write("<!--                                <a href=\"MyBooking.jsp\" class=\"nav-item nav-link\">Booking</a>\n");
      out.write("                                <a href=\"MyRequest.jsp\" class=\"nav-item nav-link\">Request</a>-->\n");
      out.write("                                    <div class=\"nav-item dropdown\"> \n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Work & Services</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"Work.jsp\" class=\"dropdown-item\">Previous Works</a>\n");
      out.write("                                        <a href=\"LatestWork.jsp\" class=\"dropdown-item\">Latest Works</a>\n");
      out.write("                                        <a href=\"Service.jsp\" class=\"dropdown-item\">Services</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"nav-item dropdown\"> \n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Service Booking Details</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"ViewUserServiceBookings.jsp\" class=\"dropdown-item\">New Bookings</a>\n");
      out.write("                                        <a href=\"ViewAcceptedServiceBookings.jsp\" class=\"dropdown-item\">Accepted Bookings</a>\n");
      out.write("                                        <a href=\"ViewRejectedServiceBookings.jsp\" class=\"dropdown-item\">Rejected Bookings</a>\n");
      out.write("                                        <a href=\"CompletedServiceBookings.jsp\" class=\"dropdown-item\">Completed Bookings</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"nav-item dropdown\"> \n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Work Bookings</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"ViewUserWorkBookings.jsp\" class=\"dropdown-item\">New Bookings</a>\n");
      out.write("                                        <a href=\"ViewAcceptedWorkBookings.jsp\" class=\"dropdown-item\">Accepted Bookings</a>\n");
      out.write("                                        <a href=\"ViewRejectedWorkBookings.jsp\" class=\"dropdown-item\">Rejected Bookings</a>\n");
      out.write("                                        <a href=\"CompletedWorkBookings.jsp\" class=\"dropdown-item\">Completed Bookings</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"nav-item dropdown\"> \n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Report</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"ServiceReport.jsp\" class=\"dropdown-item\">Service Report</a>\n");
      out.write("                                        <a href=\"WorkReport.jsp\" class=\"dropdown-item\">Work Report</a>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"nav-item dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Complaint & Feedback</a>\n");
      out.write("                                    <div class=\"dropdown-menu\">\n");
      out.write("                                        <a href=\"Complaints.jsp\" class=\"dropdown-item\">Complaint</a>\n");
      out.write("                                        <a href=\"FeedBack.jsp\" class=\"dropdown-item\">Feedback</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                 <a href=\"../logout.jsp\" class=\"nav-item nav-link\">Logout</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ml-auto\">\n");
      out.write("                                <a class=\"btn\" href=\"#\">Get A Quote</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Nav Bar End -->\n");
      out.write("            \n");
      out.write("            <br><br><br><br><br>");
      out.write("\n");
      out.write("        <h1>Service Booking Report</h1>\n");
      out.write("        <div id=\"tab\">\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table align=\"center\" cellpadding=\"10\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>From Date:\n");
      out.write("                        <input type=\"date\" name=\"fdate\" value=\"\">\n");
      out.write("                    </td>\n");
      out.write("                    <td>To Date:\n");
      out.write("                        <input type=\"date\" name=\"tdate\" value=\"\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" value=\"Show Results\" name=\"btn\"> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br><br>\n");
      out.write("            <div id=\"print\">\n");
      out.write("            ");

                if(request.getParameter("btn")!=null){
            
      out.write("\n");
      out.write("            <table border=\"1\" cellpadding=\"10\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                   <th>Sl.No</th>\n");
      out.write("                    <th>Service</th>\n");
      out.write("                    <th>Amount</th>\n");
      out.write("                    <th>User Name</th>\n");
      out.write("                    <th>User Contact</th>\n");
      out.write("                    <th>Service Status</th>\n");
      out.write("                     <th>Payment Status</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    if((!request.getParameter("fdate").equals("")) && (request.getParameter("tdate").equals("")))
                    {
                         
                    String sel="select * from tbl_servicebooking sb inner join tbl_service s on sb.service_id=s.service_id inner join tbl_worker w on w.worker_id=s.worker_id inner join tbl_user u on sb.user_id=u.user_id where w.worker_id='"+session.getAttribute("workerid")+"' and sb.booking_date>='"+request.getParameter("fdate")+"'";
                    ResultSet rs=con.selectCommand(sel);
                    //out.println(sel);
                    int i=0;
                    while(rs.next()){
                        i++;
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("service_title"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(rs.getString("service_amount"));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString("user_name"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("user_contact"));
      out.write("</td>\n");
      out.write("                              ");
 
                              if(rs.getString("servicebooking_astatus").equals("1"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"green\">Waiting for User contact</td>\n");
      out.write("                                  ");

                              }
                              else if(rs.getString("servicebooking_astatus").equals("2"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"red\">Offer Rejected</td>\n");
      out.write("                                  ");

                              }
                              else if(rs.getString("servicebooking_astatus").equals("3"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"orange\">Service Completed</td>\n");
      out.write("                                  ");

                              }
                              else{
                                   
      out.write("\n");
      out.write("                                  <td class=\"red\">No process</td>\n");
      out.write("                                  ");

                              }
                              
      out.write("\n");
      out.write("                              \n");
      out.write("                                  ");
 
                              if(rs.getString("servicebooking_pstatus").equals("1"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"green\">Payment Completed</td>\n");
      out.write("                                  ");

                              }
                             
                              else{
                                   
      out.write("\n");
      out.write("                                  <td class=\"red\">Not Paid</td>\n");
      out.write("                                  ");

                              }
                               
      out.write("\n");
      out.write("                              </tr>\n");
      out.write("                        ");

                    }
                
                    }
                    else if((request.getParameter("fdate").equals("")) && !(request.getParameter("tdate").equals("")))
                    {
                         
                    String sel="select * from tbl_servicebooking sb inner join tbl_service s on sb.service_id=s.service_id inner join tbl_worker w on w.worker_id=s.worker_id inner join tbl_user u on sb.user_id=u.user_id where w.worker_id='"+session.getAttribute("workerid")+"' and sb.booking_date<='"+request.getParameter("tdate")+"'";
                    ResultSet rs=con.selectCommand(sel);
                    int i=0;
                    while(rs.next()){
                        i++;
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                            <td><img src=\"../Assets/Land/");
      out.print(rs.getString("service_image"));
      out.write("\" width=\"100\" height=\"100\"></td>\n");
      out.write("                            <td>");
      out.print(rs.getString("service_amount"));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString("user_name"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("user_contact"));
      out.write("</td>\n");
      out.write("                              ");
 
                              if(rs.getString("servicebooking_astatus").equals("1"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"green\">Waiting for User contact</td>\n");
      out.write("                                  ");

                              }
                              else if(rs.getString("servicebooking_astatus").equals("2"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"red\">Offer Rejected</td>\n");
      out.write("                                  ");

                              }
                              else if(rs.getString("servicebooking_astatus").equals("3"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"orange\">Service Completed</td>\n");
      out.write("                                  ");

                              }
                              else{
                                   
      out.write("\n");
      out.write("                                  <td class=\"red\">No process</td>\n");
      out.write("                                  ");

                              }
                              
      out.write("\n");
      out.write("                              \n");
      out.write("                                  ");
 
                              if(rs.getString("servicebooking_pstatus").equals("1"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"green\">Payment Completed</td>\n");
      out.write("                                  ");

                              }
                             
                              else{
                                   
      out.write("\n");
      out.write("                                  <td class=\"red\">Not Paid</td>\n");
      out.write("                                  ");

                              }
                               
      out.write("\n");
      out.write("                              </tr>\n");
      out.write("                              ");

                    }
                
                    }
                     
                    else if((!request.getParameter("fdate").equals("")) && (!request.getParameter("tdate").equals("")))
                    {
                         
                    String sel="select * from tbl_servicebooking sb inner join tbl_service s on sb.service_id=s.service_id inner join tbl_worker w on w.worker_id=s.worker_id inner join tbl_user u on sb.user_id=u.user_id where w.worker_id='"+session.getAttribute("workerid")+"' and sb.booking_date between '"+request.getParameter("fdate")+"' and '"+request.getParameter("tdate")+"'";
                    ResultSet rs=con.selectCommand(sel);
                    int i=0;
                    while(rs.next()){
                        i++;
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                            <td><img src=\"../Assets/Land/");
      out.print(rs.getString("service_image"));
      out.write("\" width=\"100\" height=\"100\"></td>\n");
      out.write("                            <td>");
      out.print(rs.getString("service_amount"));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString("user_name"));
      out.write("</td>\n");
      out.write("                              <td>");
      out.print(rs.getString("user_contact"));
      out.write("</td>\n");
      out.write("                              ");
 
                              if(rs.getString("servicebooking_astatus").equals("1"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"green\">Waiting for User contact</td>\n");
      out.write("                                  ");

                              }
                              else if(rs.getString("servicebooking_astatus").equals("2"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"red\">Offer Rejected</td>\n");
      out.write("                                  ");

                              }
                              else if(rs.getString("servicebooking_astatus").equals("3"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"orange\">Service Completed</td>\n");
      out.write("                                  ");

                              }
                              else{
                                   
      out.write("\n");
      out.write("                                  <td class=\"red\">No process</td>\n");
      out.write("                                  ");

                              }
                              
      out.write("\n");
      out.write("                              \n");
      out.write("                                  ");
 
                              if(rs.getString("servicebooking_pstatus").equals("1"))
                              {
                                  
      out.write("\n");
      out.write("                                  <td class=\"green\">Payment Completed</td>\n");
      out.write("                                  ");

                              }
                             
                              else{
                                   
      out.write("\n");
      out.write("                                  <td class=\"red\">Not Paid</td>\n");
      out.write("                                  ");

                              }
                               
      out.write("\n");
      out.write("                              </tr>\n");
      out.write("                               ");

                    }
                
                    }
                   
                    else{
                        
      out.write("\n");
      out.write("                        <td colspan=\"6\" align=\"center\" class=\"red\">No Results....</td>\n");
      out.write("                        ");

                    }
                }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("    <br>  <br>  <br>  <br>  <br>  <br>  <br>\n");
      out.write("    ");
      out.write("\n");
      out.write("<br><br><br><br><br>\n");
      out.write("            <!-- Footer Start -->\n");
      out.write("            <div class=\"footer wow fadeIn\" data-wow-delay=\"0.3s\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"footer-contact\">\n");
      out.write("                                <h2>Office Contact</h2>\n");
      out.write("                                <p><i class=\"fa fa-map-marker-alt\"></i>123 Street, New York, USA</p>\n");
      out.write("                                <p><i class=\"fa fa-phone-alt\"></i>+012 345 67890</p>\n");
      out.write("                                <p><i class=\"fa fa-envelope\"></i>info@example.com</p>\n");
      out.write("                                <div class=\"footer-social\">\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-youtube\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                                    <a href=\"../Template/Main/\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"footer-link\">\n");
      out.write("                                <h2>Services Areas</h2>\n");
      out.write("                                <a href=\"../Template/Main/\">Building Construction</a>\n");
      out.write("                                <a href=\"../Template/Main/\">House Renovation</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Architecture Design</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Interior Design</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Painting</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"footer-link\">\n");
      out.write("                                <h2>Useful Pages</h2>\n");
      out.write("                                <a href=\"../Template/Main/\">About Us</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Contact Us</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Our Team</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Projects</a>\n");
      out.write("                                <a href=\"../Template/Main/\">Testimonial</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                            <div class=\"newsletter\">\n");
      out.write("                                <h2>Newsletter</h2>\n");
      out.write("                                <p>\n");
      out.write("                                    Lorem ipsum dolor sit amet elit. Phasellus nec pretium mi. Curabitur facilisis ornare velit non vulpu\n");
      out.write("                                </p>\n");
      out.write("                                <div class=\"form\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Email here\">\n");
      out.write("                                    <button class=\"btn\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container footer-menu\">\n");
      out.write("                    <div class=\"f-menu\">\n");
      out.write("                        <a href=\"../Template/Main/\">Terms of use</a>\n");
      out.write("                        <a href=\"../Template/Main/\">Privacy policy</a>\n");
      out.write("                        <a href=\"../Template/Main/\">Cookies</a>\n");
      out.write("                        <a href=\"../Template/Main/\">Help</a>\n");
      out.write("                        <a href=\"../Template/Main/\">FQAs</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container copyright\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <p>&copy; <a href=\"/#\">Your Site Name</a>, All Right Reserved.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <p>Designed By <a href=\"https://htmlcodex.com\">HTML Codex</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer End -->\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/counterup/counterup.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Main/lib/slick/slick.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"../Template/Main/js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
