<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>学生页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Le styles -->
    <script type="text/javascript" src="assets/js/jquery.js"></script>

    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/loader-style.css">
    <link rel="stylesheet" href="assets/css/bootstrap.css">

    <link href="assets/js/stackable/stacktable.css" rel="stylesheet">
    <link href="assets/js/stackable/responsive-table.css" rel="stylesheet">
    
     <link rel="shortcut icon" href="assets/ico/minus.png">
     
     <script type="text/javascript">
	var str=location.href;
	var cc = str.substr(str.indexOf("?")+1);
	$(function() {
		$("#show").empty();
		var html = '<h1>欢迎，' + cc + '</h1>'
		$("#show").append(html);
	})
	$(function() {
		$.ajax({
			url : '${pageContext.request.contextPath}/planOfStudyAction_findAllPlan',
			type : 'POST',
			dataType : 'json',
			data : {ssn:cc},
			success : function(data) {
				$("#planCourse").empty();
				for (var i = 0; i < data.length; i++) {
					var c = data[i];
					var html = '<tr><td>'
						+ c.courseNo
						+ '</td><td>'
						+ c.courseName
						+ '</td><td>'
						+ c.credits
						+ '</td></tr>';
						$("#planCourse").append(html);
				}	
			}
		});
	})
	//查询所有已选课程
	$(function() {
		$.ajax({
			url : '${pageContext.request.contextPath}/sectionAction_getBySsn',
			type : 'POST',
			dataType : 'json',
			data : {ssn:cc},
			success : function(data) {
				$("#hasSection").empty();
				for (var i = 0; i < data.length; i++) {
					var s = data[i];
					var se ="'" + s.sectionNo + "'";
					var html = '<tr><td>'
						+ s.sectionNo
						+ '</td><td>'
						+ s.dayOfWeek
						+ '</td><td>'
						+ s.timeOfDay
						+ '</td><td>'
						+ s.room
						+ '</td><td>'
						+ s.professor
						+ '</td><td>'
						+ s.course
						+ '</td><td>'
						+ s.grade
						+ '</td><td><a href="javascript:void(0);"  onclick="addTranscript('+ se +')">退选</a></td></tr>';
						$("#hasSection").append(html);
				}	
			}
		});
	})
	//查询所有可选课程
	$(function() {
		$.ajax({
			url : '${pageContext.request.contextPath}/sectionAction_findAllSection',
			type : 'POST',
			dataType : 'json',
			data : {},
			success : function(data) {
				$("#allSection").empty();
				for (var i = 0; i < data.length; i++) {
					var s = data[i];
					var se ="'" + s.sectionNo + "'";
					var html = '<tr><td>'
						+ s.sectionNo
						+ '</td><td>'
						+ s.dayOfWeek
						+ '</td><td>'
						+ s.timeOfDay
						+ '</td><td>'
						+ s.room
						+ '</td><td>'
						+ s.seatingCapacity
						+ '</td><td>'
						+ s.professor
						+ '</td><td>'
						+ s.course
						+ '</td><td><a href="javascript:void(0);"  onclick="addTranscript('+ se +')">选课</a></td></tr>';
						$("#allSection").append(html);
				}	
			}
		});
	})
	function addTranscript(val){
		$.ajax({
			url:'${pageContext.request.contextPath}/sectionAction_addTranscript',
			type:'POST',
			dataType : 'json',
			data:{ssn:cc,sectionNo:val},
			success:function(data){
				if(data.status=="ok"){
					alert("添加成功！");
					window.location.reload();
				}
			}
		});
	}

</script>
    </head>
    <body>

<div id="awwwards" class="right black"><a href="http://www.awwwards.com/best-websites/apricot-navigation-admin-dashboard-template" target="_blank">best websites of the world</a></div>
    <!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    <!-- TOP NAVBAR -->
    <nav role="navigation" class="navbar navbar-static-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button data-target="#bs-example-navbar-collapse-1" data-toggle="collapse" class="navbar-toggle" type="button">
                    <span class="entypo-menu"></span>
                </button>
                <button class="navbar-toggle toggle-menu-mobile toggle-left" type="button">
                    <span class="entypo-list-add"></span>
                </button>




                <div id="logo-mobile" class="visible-xs">
                   <h1>选课系统<span>v1.3</span></h1>
                </div>

            </div>


            <!-- Collect the nav links, forms, and other content for toggling -->
            <div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
					 <li class="dropdown">
					 <a data-toggle="dropdown" class="dropdown-toggle" href="#"><i style="font-size:20px;" class="icon-conversation"></i><div class="noft-red"></div></a>
					 </li>
                    <li>
					<a data-toggle="dropdown" class="dropdown-toggle" href="#"><i style="font-size:19px;" class="icon-warning tooltitle"></i><div class="noft-green"></div></a>
                     </li>
                    <li><a href="#"><i data-toggle="tooltip" data-placement="bottom" title="Help" style="font-size:20px;" class="icon-help tooltitle"></i></a>
                    </li>
				 </ul>
                <div id="nt-title-container" class="navbar-left running-text visible-lg">
                    <ul class="date-top">
                        <li class="entypo-calendar" style="margin-right:5px"></li>
                        <li id="Date"></li>
					 </ul>

                    <ul id="digital-clock" class="digital">
                        <li class="entypo-clock" style="margin-right:5px"></li>
                        <li class="hour"></li>
                        <li>:</li>
                        <li class="min"></li>
                        <li>:</li>
                        <li class="sec"></li>
                        <li class="meridiem"></li>
                    </ul> </div>

                <ul style="margin-right:0;" class="nav navbar-nav navbar-right">
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                           欢迎 <b class="caret"></b>
                        </a>  
                    </li>
                    <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="icon-gear"></span>&#160;&#160;Setting</a>
                        <ul role="menu" class="dropdown-setting dropdown-menu">

                            <li class="theme-bg">
                                <div id="button-bg"></div>
                                <div id="button-bg2"></div>
                                <div id="button-bg3"></div>
                                <div id="button-bg5"></div>
                                <div id="button-bg6"></div>
                                <div id="button-bg7"></div>
                                <div id="button-bg8"></div>
                                <div id="button-bg9"></div>
                                <div id="button-bg10"></div>
                                <div id="button-bg11"></div>
                                <div id="button-bg12"></div>
                                <div id="button-bg13"></div>
                            </li>
                        </ul>
                    </li>
                    <li class="hidden-xs">
                        <a class="toggle-left" href="#">
                            <span style="font-size:20px;" class="entypo-list-add"></span>
                        </a>
                    </li>
                </ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <!-- /END OF TOP NAVBAR -->

    <!-- SIDE MENU -->
    <div id="skin-select">
        <div id="logo">
         <h1>选课系统<span>v1.3</span></h1>
        </div>

        <a id="toggle">
            <span class="entypo-menu"></span>
        </a>
        <div class="dark">
            <form action="#">
                <span>
                    <input type="text" name="search" value="" class="search rounded id_search" placeholder="Search Menu..." autofocus="">
                </span>
            </form>
        </div>
		 <div class="search-hover">
            <form id="demo-2">
                <input type="search" placeholder="Search Menu..." class="id_search">
            </form>
        </div>

        <div class="skin-part">
            <div id="tree-wrap">
                <div class="side-bar">
                    <ul class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="widget-menu"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>   
                    </ul>

                    <ul class="topnav menu-left-nest">
                       
						 <li>
                            <a class="tooltip-tip " href="login.html" title="login">
                                <i class="icon-download"></i>
                                <span>Login</span>
                            </a>
                        </li>

                    </ul>

                    <ul id="menu-showhide" class="topnav menu-left-nest">
                        <li>
                            <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                                <span class="component"></span>
                                <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>

                            </a>
                        </li>
						<li>
                            <a class="tooltip-tip" href="#" title="Tables">
                                <i class="icon-view-thumb"></i>
                                <span>Tables</span>
                            </a>
                            <ul>
                                <li>
                                    <a class="tooltip-tip2 ajax-load" href="table-static.html" title="Table Static"><i class="entypo-layout"></i><span>Table Static</span></a>
                                </li>
                               
                            </ul>
                        </li>
					 </ul>


                 
                </div>
            </div>
        </div>
    </div>
    <!-- END OF SIDE MENU -->



    <!--  PAPER WRAP -->
    <div class="wrap-fluid">
        <div class="container-fluid paper-wrap bevel tlbr">





            <!-- CONTENT -->
            <!--TITLE -->
            <div class="row">
                <div id="paper-top">
                    <div class="col-sm-3">
                        <h2 class="tittle-content-header">
                            <span class="entypo-layout"></span>
                            <span>Table
                            </span>
                        </h2>

                    </div>

                    <div class="col-sm-7">
                        <div class="devider-vertical visible-lg"></div>
                        <div class="tittle-middle-header">

                            <div class="alert">
                                <button type="button" class="close" data-dismiss="alert">×</button>
                                <span class="tittle-alert entypo-info-circled"></span>
                                Welcome back,&nbsp;
                                <strong>Hello</strong>&nbsp;&nbsp;
                            </div>


                        </div>

                    </div>
                    <div class="col-sm-2">
                        <div class="devider-vertical visible-lg"></div>
                        <div class="btn-group btn-wigdet pull-right visible-lg">
                            <div class="btn">
                                Widget</div>
                            <button data-toggle="dropdown" class="btn dropdown-toggle" type="button">
                                <span class="caret"></span>
                                <span class="sr-only">Toggle Dropdown</span>
                            </button>
                            
                        </div>


                    </div>
                </div>
            </div>
            <!--/ TITLE -->

            <!-- BREADCRUMB -->
            <ul id="breadcrumb">
                <li>
                    <span class="entypo-home"></span>
                </li>
                <li><i class="fa fa-lg fa-angle-right"></i>
                </li>
                <li><a href="#" title="Sample page 1">主页</a>
                </li>
                <li><i class="fa fa-lg fa-angle-right"></i>
                </li>
                <li><a href="#" title="Sample page 1">管理员</a>
                </li>
               
            </ul>

            <!-- END OF BREADCRUMB -->
			
			 
<div class="container">
		<div id="show"></div></div>
            <div class="content-wrap">
           
                <div class="row">


                    <div class="col-sm-12">

                        <div class="nest" id="tableStaticClose">
                            <div class="title-alt">
                    <h6>Plan of Study</h6>
                                <div class="titleClose">
                                    <a class="gone" href="#tableStaticClose">
                                        <span class="entypo-cancel"></span>
                                    </a>
                                </div>
                                <div class="titleToggle">
                                    <a class="nav-toggle-alt" href="#tableStatic">
                                        <span class="entypo-up-open"></span>
                                    </a>
                                </div>

                            </div>

                            <div class="body-nest" id="tableStatic">

                                <section id="flip-scroll">

                                    <table class="table table-bordered table-striped cf">
                                        <thead class="cf">
                                            <tr>
                                                <th>courseNo</th>
                                                <th>courseName</th>
                                                <th class="numeric">credits</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody id="planCourse">

										</tbody>
                                    </table>
                                </section>

                            </div>

                        </div>


                    </div>

                </div>
            </div>
            
            <div class="content-wrap">
                <div class="row">


                    <div class="col-sm-12">

                        <div class="nest" id="tableStaticClose">
                            <div class="title-alt">
                    <h6>已选课程</h6>
                                <div class="titleClose">
                                    <a class="gone" href="#tableStaticClose">
                                        <span class="entypo-cancel"></span>
                                    </a>
                                </div>
                                <div class="titleToggle">
                                    <a class="nav-toggle-alt" href="#tableStatic">
                                        <span class="entypo-up-open"></span>
                                    </a>
                                </div>

                            </div>

                            <div class="body-nest" id="tableStatic">

                                <section id="flip-scroll">

                                    <table class="table table-bordered table-striped cf">
                                        <thead class="cf">
                                            <tr>
                                                <th>SectionNo</th>
                                                <th>DayOfWeek</th>
                                                <th>TimeOfDay</th>
                                                <th>Room</th>
                                                <th>SeatingCapacity</th>
                                                <th>Professor</th>
                                                <th>Grade</th>
                                                <th></th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody id="hasSection">

										</tbody>
                                    </table>
                                </section>

                            </div>

                        </div>


                    </div>

                </div>
            </div>

			<div class="content-wrap">
                <div class="row">


                    <div class="col-sm-12">

                        <div class="nest" id="tableStaticClose">
                            <div class="title-alt">
                    <h6>All Section</h6>
                                <div class="titleClose">
                                    <a class="gone" href="#tableStaticClose">
                                        <span class="entypo-cancel"></span>
                                    </a>
                                </div>
                                <div class="titleToggle">
                                    <a class="nav-toggle-alt" href="#tableStatic">
                                        <span class="entypo-up-open"></span>
                                    </a>
                                </div>

                            </div>

                            <div class="body-nest" id="tableStatic">

                                <section id="flip-scroll">

                                    <table class="table table-bordered table-striped cf">
                                        <thead class="cf">
                                            <tr>
                                                <th>SectionNo</th>
                                                <th>DayOfWeek</th>
                                                <th>TimeOfDay</th>
                                                <th>Room</th>
                                                <th>SeatingCapacity</th>
                                                <th>Professor</th>
                                                <th>Course</th>
                                                <th></th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody id="allSection">

										</tbody>
                                    </table>
                                </section>

                            </div>

                        </div>


                    </div>

                </div>
            </div>
         	

            <!-- /END OF CONTENT -->



            <!-- FOOTER -->
            <div class="footer-space"></div>
            <div id="footer">
                <div class="devider-footer-left"></div>
                <div class="time">
                    <p id="spanDate">
                    <p id="clock">
                </div>
                <div class="devider-footer"></div>

            </div>
            <!-- / END OF FOOTER -->

        </div>
    </div>
    <!--  END OF PAPER WRAP -->

   


    <!-- MAIN EFFECT -->
    <script type="text/javascript" src="assets/js/preloader.js"></script>
    <script type="text/javascript" src="assets/js/bootstrap.js"></script>
    <script type="text/javascript" src="assets/js/app.js"></script>
    <script type="text/javascript" src="assets/js/load.js"></script>
    <script type="text/javascript" src="assets/js/main.js"></script>








    <!-- /MAIN EFFECT -->
    <script type="text/javascript" src="assets/js/stackable/stacktable.js"></script>


    <script>
    $(document).on('click', '#run', function(e) {
        e.preventDefault();
        $('#simple-example-table').stacktable({
            hideOriginal: true
        });
        $(this).replaceWith('<span>ran</span>');
    });
    $('#responsive-example-table').stacktable({
        myClass: 'stacktable small-only'
    });
    </script>

</body>
    
    </html>  