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
              <div class="panel-body">
                  <div class="content-row">
					
					 <!--Contents-->
					 <div class="panel panel-default">
                    <div class="panel-heading">
                      <div class="panel-title"><b>STUDENT REGISTRATION</b>
                      </div>

                      <div class="panel-options">
                        <a class="bg" data-target="#sample-modal-dialog-1" data-toggle="modal" href="#sample-modal"><i class="entypo-cog"></i></a>
                        <a data-rel="collapse" href="#"><i class="entypo-down-open"></i></a>
                        <a data-rel="close" href="#!/tasks" ui-sref="Tasks"><i class="entypo-cancel"></i></a>
                      </div>
                    </div>

                    <div class="panel-body">
                      <form novalidate="" role="form" class="form-horizontal" action="addStudent" >
                      <div class="col-md-2">
                          <label class="col-md-2 control-label">AD.NO</label>
                        </div> 
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="admissionno" class="form-control" name="admissionno">
                          </div>
                       <div class="col-md-2">
                          <label class="col-md-2 control-label">NAME</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="name" class="form-control" name="name">
                          </div>
                         <div class="col-md-2">
                          <label class="col-md-2 control-label" for="description">ADDRESS</label>
                          </div>
                          <div class="col-md-4">
                            <textarea required class="form-control" placeholder="" rows="2" cols="30" id="address" name="address"></textarea>
                          </div>
                        
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">GENDER</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="gender" class="form-control" name="gender">
                          </div>
                         <div class="col-md-2">
                          <label class="col-md-2 control-label">DOB</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="dob" class="form-control" name="dob">
                          </div>
						  <div class="col-md-2">
						    <label class="col-md-2 control-label">FATHER</label>
						    </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="father" class="form-control" name="father">
                          </div>
                         <div class="col-md-2">
                          <label class="col-md-2 control-label">MOTHER</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="mother" class="form-control" name="mother">
                          </div>
                         <div class="col-md-2">
                          <label class="col-md-2 control-label">CONTACT</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="contactno" class="form-control" name="contactno">
                          </div>
                        
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">MOBILE</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="mobileno" class="form-control" name="mobileno">
                          </div>
                        
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">RELEGION</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="religion" class="form-control" name="religion">
                          </div>
                        
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">CASTE</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="caste" class="form-control" name="caste">
                          </div>
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">CATEGORY</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="category" class="form-control" name="category">
                          </div>
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">DISTANCE</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="distance" class="form-control" name="distance">
                          </div>
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">BUS</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="bus" class="form-control" name="bus">
                          </div>
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">CASTE</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="caste" class="form-control" name="caste">
                          </div>
                         <div class="col-md-2">
                          <label class="col-md-2 control-label">DATE</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="admissiondate" class="form-control" name="admissiondate">
                          </div>
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">CLASS</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="classes_cname" class="form-control" name="classes_cname">
                          </div>
                        <div class="col-md-2">
                          <label class="col-md-2 control-label">DIVISION</label>
                          </div>
                          <div class="col-md-4">
                            <input type="text" required placeholder="" id="classes_division" class="form-control" name="classes_division">
                          </div>
                          
                          <div class="col-md-12">
                          </div>
                           <div class="col-md-12">
                          </div>
                        <div class="col-md-5">
                        </div>
                        <div class="col-md-1">
                        	<button class="btn btn-info" type="submit">Submit</button>
                        </div>
                        <div class="col-md-1">
                        	<button class="btn btn-info" type="reset">Submit</button>
                        </div>
                        <div class="col-md-5">
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