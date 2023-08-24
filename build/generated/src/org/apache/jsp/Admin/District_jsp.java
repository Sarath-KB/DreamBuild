package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class District_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/Header.jsp");
    _jspx_dependants.add("/Admin/Footer.jsp");
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
      out.write("\n");
      out.write("    ");
//@include file="SessionValidator.jsp" 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dream Build::District</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"form.css\">\n");
      out.write("        <script>\n");
      out.write("            function nameval(elem)\n");
      out.write("{\n");
      out.write("\tvar emailexp=/^([A-Za-z ]*)$/;\n");
      out.write("\tif(elem.value.match(emailexp))\n");
      out.write("\t{\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML = \"\";\n");
      out.write("\t\treturn true;\n");
      out.write("\t}\n");
      out.write("\telse\n");
      out.write("\t{\n");
      out.write("\t\t\n");
      out.write("\t\tdocument.getElementById(\"name\").innerHTML = \"<span style='color: red;'>Alphabets Are Allowed</span>\";\n");
      out.write("\t\telem.focus();\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("        </script>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <title>Dream Build</title>\n");
      out.write("\n");
      out.write("        <!-- <link rel=\"icon\" href=\"img/favicon.png\" type=\"image/png\"> -->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/bootstrap.min.css\" />\n");
      out.write("        <!-- themefy CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/themefy_icon/themify-icons.css\" />\n");
      out.write("        <!-- swiper slider CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/swiper_slider/css/swiper.min.css\" />\n");
      out.write("        <!-- select2 CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/select2/css/select2.min.css\" />\n");
      out.write("        <!-- select2 CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/niceselect/css/nice-select.css\" />\n");
      out.write("        <!-- owl carousel CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/owl_carousel/css/owl.carousel.css\" />\n");
      out.write("        <!-- gijgo css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/gijgo/gijgo.min.css\" />\n");
      out.write("        <!-- font awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/font_awesome/css/all.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/tagsinput/tagsinput.css\" />\n");
      out.write("        <!-- datatable CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/datatable/css/jquery.dataTables.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/datatable/css/responsive.dataTables.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/datatable/css/buttons.dataTables.min.css\" />\n");
      out.write("        <!-- text editor css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/text_editor/summernote-bs4.css\" />\n");
      out.write("        <!-- morris css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/morris/morris.css\">\n");
      out.write("        <!-- metarial icon css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/vendors/material_icon/material-icons.css\" />\n");
      out.write("\n");
      out.write("        <!-- menu css  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/metisMenu.css\">\n");
      out.write("        <!-- style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Template/Admin/css/colors/default.css\" id=\"colorSkinCSS\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"crm_body_bg\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- main content part here -->\n");
      out.write("\n");
      out.write("        <!-- sidebar  -->\n");
      out.write("        <!-- sidebar part here -->\n");
      out.write("        <nav class=\"sidebar\">\n");
      out.write("            <div class=\"logo d-flex justify-content-between\">\n");
      out.write("                <a href=\"index.html\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                <div class=\"sidebar_close_icon d-lg-none\">\n");
      out.write("                    <i class=\"ti-close\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <ul id=\"sidebar_menu\">\n");
      out.write("                <li class=\"side_menu_title\">\n");
      out.write("                    <span>Dashboard</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"mm-active\">\n");
      out.write("                    <a  href=\"#\"  aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/1.svg\" alt=\"\">\n");
      out.write("                        <span>Dashboard</span>\n");
      out.write("                    </a>\n");
      out.write("                   \n");
      out.write("                </li>\n");
      out.write("                <li class=\"side_menu_title\">\n");
      out.write("                    <span>Applications</span>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Basic Data</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul>\n");
      out.write("                       <li><a href=\"District.jsp\">District</a></li>\n");
      out.write("                        <li><a href=\"Place.jsp\">Place</a></li>\n");
      out.write("                        <li><a href=\"Location.jsp\">Location</a></li>\n");
      out.write("                        <li><a href=\"ProductType.jsp\">Product Type</a></li>\n");
      out.write("                        <li><a href=\"ServiceType.jsp\">Service Type</a></li>\n");
      out.write("                        <li><a href=\"WorkerType.jsp\">Worker Type</a></li>\n");
      out.write("                        <li><a href=\"Product.jsp\">Product</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>Verification</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Landlordlist.jsp\">Landlord</a></li>\n");
      out.write("                        <li><a href=\"Shoplist.jsp\">Shop</a></li>\n");
      out.write("                        <li><a href=\"Workerlist.jsp\">Worker</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"\">\n");
      out.write("                    <a   class=\"has-arrow\" href=\"#\" aria-expanded=\"false\">\n");
      out.write("                        <img src=\"../Template/Admin/img/menu-icon/2.svg\" alt=\"\">\n");
      out.write("                        <span>LogOut</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"../Login/Login.jsp\">LogOut</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <!-- sidebar part end -->\n");
      out.write("        <!--/ sidebar  -->");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            String eid = "", ename = "";
            if (request.getParameter("btnsave") != null) {
                String d = "";
                d = request.getParameter("txtdistrict");
                if (request.getParameter("eid") != null) {
                    String up = "update tbl_district set district_name='" + d + "' where district_id='" + request.getParameter("txtid") + "'";
                    con.executeCommand(up);
                    response.sendRedirect("District.jsp");
                } else {
                    String selc = "select * from tbl_district where district_name='" + d + "'";
                    ResultSet rsc = con.selectCommand(selc);
                    if (rsc.next()) {
        
      out.write("\n");
      out.write("        <script>alert('Already Exist')</script>\n");
      out.write("        ");

                    } else {

                        String ins = "insert into tbl_district(district_name) values ('" + d + "')";
                        con.executeCommand(ins);
                    }
                }
            }
            if (request.getParameter("did") != null) {
                String del = "delete from tbl_district where district_id='" + request.getParameter("did") + "'";
                con.executeCommand(del);
                response.sendRedirect("District.jsp");
            }
            if (request.getParameter("eid") != null) {
                String sel1 = "select * from tbl_district where district_id='" + request.getParameter("eid") + "'";
                ResultSet rs1 = con.selectCommand(sel1);
                if (rs1.next()) {
                    eid = rs1.getString("district_id");
                    ename = rs1.getString("district_name");
                }
            }
        
      out.write("\n");
      out.write("        <h1>District</h1>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div id=\"tab\">\n");
      out.write("        <form name=\"frmdistrict\" method=\"post\">\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\" style=\"border-collapse: collapse\">\n");
      out.write("                <input type=\"hidden\" name=\"txtid\" value=\"");
      out.print(eid);
      out.write("\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>District Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtdistrict\" value=\"");
      out.print(ename);
      out.write("\" required onchange=\"nameval(this)\">\n");
      out.write("                        <div id=\"name\"></div></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"btnsave\" value=\"SAVE\">\n");
      out.write("                        <input type=\"reset\" name=\"btncancel\" value=\"CANCEL\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>  \n");
      out.write("            </table>\n");
      out.write("            <hr>\n");
      out.write("            <br>\n");
      out.write("            <table border=\"1\" align=\"center\" cellpadding=\"10\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Sl.No</td>\n");
      out.write("                    <td>District Name</td>\n");
      out.write("                    <td>Action</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    String s = "select * from tbl_district";
                    ResultSet r = con.selectCommand(s);
                    int i = 0;
                    while (r.next()) {
                        i++;

                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(r.getString("district_name"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"District.jsp?did=");
      out.print(r.getString("district_id"));
      out.write("\">Delete</a>/ <a href=\"District.jsp?eid=");
      out.print(r.getString("district_id"));
      out.write("\">Edit</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write(" \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <br><br><br><br><br><br>\n");
      out.write("    ");
      out.write("<!-- footer  -->\n");
      out.write("        <!-- jquery slim -->\n");
      out.write("        <script src=\"../Template/Admin/js/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <!-- popper js -->\n");
      out.write("        <script src=\"../Template/Admin/js/popper.min.js\"></script>\n");
      out.write("        <!-- bootstarp js -->\n");
      out.write("        <script src=\"../Template/Admin/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- sidebar menu  -->\n");
      out.write("        <script src=\"../Template/Admin/js/metisMenu.js\"></script>\n");
      out.write("        <!-- waypoints js -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/count_up/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- waypoints js -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/chartlist/Chart.min.js\"></script>\n");
      out.write("        <!-- counterup js -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/count_up/jquery.counterup.min.js\"></script>\n");
      out.write("        <!-- swiper slider js -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/swiper_slider/js/swiper.min.js\"></script>\n");
      out.write("        <!-- nice select -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/niceselect/js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/owl_carousel/js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- gijgo css -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/gijgo/gijgo.min.js\"></script>\n");
      out.write("        <!-- responsive table -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/dataTables.responsive.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/dataTables.buttons.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/buttons.flash.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/jszip.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/pdfmake.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/vfs_fonts.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/buttons.html5.min.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/datatable/js/buttons.print.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Template/Admin/js/chart.min.js\"></script>\n");
      out.write("        <!-- progressbar js -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/progressbar/jquery.barfiller.js\"></script>\n");
      out.write("        <!-- tag input -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/tagsinput/tagsinput.js\"></script>\n");
      out.write("        <!-- text editor js -->\n");
      out.write("        <script src=\"../Template/Admin/vendors/text_editor/summernote-bs4.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Template/Admin/vendors/apex_chart/apexcharts.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- custom js -->\n");
      out.write("        <script src=\"../Template/Admin/js/custom.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"../Template/Admin/vendors/apex_chart/bar_active_1.js\"></script>\n");
      out.write("        <script src=\"../Template/Admin/vendors/apex_chart/apex_chart_list.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
