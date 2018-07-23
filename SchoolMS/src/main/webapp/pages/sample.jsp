<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>School_Name</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="shortcut icon" href="favicon_16.ico"/>
    <link rel="bookmark" href="favicon_16.ico"/>
    <!-- site css -->
    <link rel="stylesheet" href="dist/css/site.min.css">
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,800,700,400italic,600italic,700italic,800italic,300italic" rel="stylesheet" type="text/css">
    <!-- <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css'> -->
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="dist/js/site.min.js"></script>
  </head>
  
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
                <h3 class="panel-title"><a href="javascript:void(0);" class="toggle-sidebar"><span class="fa fa-angle-double-left" data-toggle="offcanvas" title="Maximize Panel"></span></a> Panel Title</h3>
              </div>
              <div class="panel-body">
                  <div class="content-row">
					
					 <!--Contents-->
					 <div class="panel panel-default">
                    <div class="panel-heading">
                      <div class="panel-title"><b>Create Form</b>
                      </div>

                      <div class="panel-options">
                        <a class="bg" data-target="#sample-modal-dialog-1" data-toggle="modal" href="#sample-modal"><i class="entypo-cog"></i></a>
                        <a data-rel="collapse" href="#"><i class="entypo-down-open"></i></a>
                        <a data-rel="close" href="#!/tasks" ui-sref="Tasks"><i class="entypo-cancel"></i></a>
                      </div>
                    </div>

                    <div class="panel-body">
                      <form novalidate="" role="form" class="form-horizontal">
                        <div class="form-group">
                          <label class="col-md-2 control-label">Title</label>
                          <div class="col-md-10">
                            <input type="text" required="" placeholder="Title" id="title" class="form-control" name="title">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-md-2 control-label">Subject</label>
                          <div class="col-md-10">
                            <input type="text" required="" placeholder="Subject" id="subject" class="form-control" name="title">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-md-2 control-label" for="description">Description</label>
                          <div class="col-md-10">
                            <textarea required="" class="form-control" placeholder="Description" rows="10" cols="30" id="description" name="description"></textarea>
                          </div>
                        </div>
                        <div class="form-group">
                          <div class="col-md-offset-2 col-md-10">
                            <button class="btn btn-info" type="submit">Submit</button>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
					 
					 
					  <!--Contents-->

                  </div>
              </div><!-- panel body -->
            </div>
        </div><!-- content -->
      </div>
    </div>
    <!--footer-->
    
</body>
  
</html>