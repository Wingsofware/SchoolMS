<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
   <!--head-->
   <%@ include file="../menu/head.jsp"%>
   <!--head-->
  <body style="">
    <!--header-->
    <%@ include file="../menu/header.jsp"%>
    <!--header-->
    <div class="container-fluid">
    <!--documents-->
        <div class="row row-offcanvas row-offcanvas-left">
        <!--Side Menu -->
           <%@ include file="../menu/sidemenu.jsp"%>
        <!--Side Menu -->
          <div class="col-xs-12 col-sm-9 content">
            <div class="panel panel-default">
              <div class="panel-heading">
                <h3 class="panel-title">Panel Title</h3>
              </div>
              <div class="panel-body">
                  <div class="content-row">
                    <h2 class="content-row-title">Welcome
                    </h2>
                    <div class="row">
                      <div class="col-md-2">
                        <div class="color-swatches">
                          <div class="swatches">
                            <div class="clearfix">
                              <div style="background-color:#5D9CEC" class="pull-left light"></div>
                              <div style="background-color:#5D9CEC" class="pull-right dark"></div>
                            </div>
                            <div class="infos">
                              <h4>STUDENTS</h4>
                              <p>600</p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-2">
                        <div class="color-swatches">
                          <div class="swatches">
                            <div class="clearfix">
                              <div style="background-color:#4FC1E9" class="pull-left light"></div>
                              <div style="background-color:#4FC1E9" class="pull-right dark"></div>
                            </div>
                            <div class="infos">
                              <h4>TEACHERS</h4>
                              <p>20</p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-2">
                        <div class="color-swatches">
                          <div class="swatches">
                            <div class="clearfix">
                              <div style="background-color:#48CFAD" class="pull-left light"></div>
                              <div style="background-color:#48CFAD" class="pull-right dark"></div>
                            </div>
                            <div class="infos">
                              <h4>NON TEACHERS</h4>
                              <p>10</p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-2">
                        <div class="color-swatches">
                          <div class="swatches">
                            <div class="clearfix">
                              <div style="background-color:#A0D468" class="pull-left light"></div>
                              <div style="background-color:#A0D468" class="pull-right dark"></div>
                            </div>
                            <div class="infos">
                              <h4>CLASSES</h4>
                              <p>20</p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-2">
                        <div class="color-swatches">
                          <div class="swatches">
                            <div class="clearfix">
                              <div style="background-color:#FFCE54" class="pull-left light"></div>
                              <div style="background-color:#FFCE54" class="pull-right dark"></div>
                            </div>
                            <div class="infos">
                              <h4>BUSES</h4>
                              <p>6</p>
                            </div>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-2">
                        <div class="color-swatches">
                          <div class="swatches">
                            <div class="clearfix">
                              <div style="background-color:#FC6E51" class="pull-left light"></div>
                              <div style="background-color:#FC6E51" class="pull-right dark"></div>
                            </div>
                            <div class="infos">
                              <h4>BITTERSWEET</h4>
                              <p>#FC6E51, #E9573F</p>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    
                  </div>
              </div><!-- panel body -->
            </div>
        </div><!-- content -->
      </div>
    </div>
    <!--footer-->
    
</body>
  
</html>