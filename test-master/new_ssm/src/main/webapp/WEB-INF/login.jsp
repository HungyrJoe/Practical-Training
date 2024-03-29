<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="UTF-8">
	    <title>CSI语音 技术吧</title>
		<meta name="renderer" content="webkit|ie-stand"/>
		<meta content="IE=edge" http-equiv="X-UA-Compatible"/>
		<meta name="description" content="">
		<meta name="keywords" content="">
		<meta name="generator" content="" />
		<meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
	
		<link rel="stylesheet" href="static/css/default/bootstrap/bootstrap.css" />
		<!-- Font Awesome Icons -->
		<link rel="stylesheet" href="chinasofti/login/css/font-awesome.css" />
		<link rel="stylesheet" href="static/css/default/simple-line-icons/css/simple-line-icons.css"/>
		<link rel="stylesheet" href="chinasofti/login/css/animate.min.css"/>
		<!-- Ionicons -->
		<link href="chinasofti/login/css/ionicons.css" rel="stylesheet" type="text/css" />
		<!-- Skins. Choose a skin from the css/skins
	     folder instead of downloading all of them to reduce the load. -->
		<link href="chinasofti/login/css/_all-skins.css" rel="stylesheet" type="text/css" />
		<!-- Castle 1.0 -->
		<link href="chinasofti/login/css/castle.css" rel="stylesheet" type="text/css" />
		<!-- Theme style -->
		<link href="chinasofti/login/css/castle-main.css" rel="stylesheet" type="text/css" />
		<link href="static/comp/layui/css/layui.css" rel="stylesheet" type="text/css" />
		<link href="static/comp/scrollbar/perfect-scrollbar.css" rel="stylesheet" type="text/css" />
		<link href="chinasofti/login/css/fontsize.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="chinasofti/login/css/theme.css" />
		<link rel="stylesheet" href="chinasofti/login/css/cover.css" />
		<link rel="stylesheet" href="chinasofti/login/css/step.css" />
		<link href="chinasofti/login/css/login.css" rel="stylesheet" type="text/css">
	    <link rel="stylesheet" href="static/css/default/mask.css" />
		  
		<script language="JavaScript">
		var context="",__contextPath="",__extendOptions="main/options",__jsPath="",__scriptPath="";</script>
	
	
		<script src="static/comp/base/jquery-2.1.4.js"></script>
		<script src="static/comp/base/utils-base.js"></script>
	
		<script src="static/comp/layui/layui.js"></script>
		<script src="static/comp/layui/layui-config.js"></script>
		<script src="static/js/common/util.js"></script>
		<script src="static/js/common/autoheight.js"></script>
		<script src="static/js/common/mask.js"></script>
	
		
		<script type="text/javascript" src="static/js/login/lufylegend-1.10.1.simple.min.js"></script>
		<script type="text/javascript" src="static/js/login/lufylegend.LoadingSample4-0.1.0.min.js"></script>
		<script type="text/javascript" src="static/js/login/TweenLite.min.js"></script>
		<script type="text/javascript" src="static/js/login/login.js"></script>
		<script type="text/javascript" src="static/comp/jQuery-Storage-API/jquery.storageapi.js" ></script>
		<script type="text/javascript" src="chinasofti/login/js/login.js"></script>
		<script type="text/javascript" src="static/js/alert.js"></script>
	</head>
	

	<body style="width: 100%;height: 100%;margin: 0;padding: 0; ">
	
		<div class="bg-canvas">
			<canvas id="demo-canvas" width="100%" height="100%" style="width: 100%;height: 99%;overflow: hidden;"></canvas>
		</div>
		<div class="login-box" id="loginbox">
		    <!-- /.login-logo -->
			<div class="login"  id="main_login" >     
			   
				<div class="input_text" >   
					<div id="message"style="position:absolute;color:red;margin-top:-20px;margin-left:100px;" > </div>
				
				  	<!--<form  action="login.d" method="post" onsubmit="return validateLogin()"> -->
					
						<div class="content" >
							<div class="navbar-header">
					           	<div>
									<span style="font-family:'Britannic Bold', 'Britannic';color:#3BC5BB;">CSI语音</span>
									<span style="font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#1D4474;"></span>
									<span style="font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#FF9A4C;">技术吧</span>
								</div>
					        </div>
					        <div class="formitem">
					        	<span class="icon fa fa-user"></span>
					        	<span class="input">
					        		<input id="username" name="username" value="" class="form-control l35" fv_type="NOTCN" type="text" maxlength="20" placeholder="请输入您的用户名" value=""  data-toggle="tooltip" data-placement="right">
					        	</span>
					        </div>
					        <div class="formitem">
					        	<span class="icon fa fa-key"></span>
					        	<span class="input">
					        		<input id="password" name="password" value="" class="form-control highlight_green l35" fv_type="NOTCN" type="password"  maxlength="6" placeholder="请输入您的密码"  data-toggle="tooltip" data-placement="right">
					        	</span>
					        </div>
					        <div class="formoperate">
					        	<span class="rememberPwd" >
					        		<input type="checkbox" id="rememberPwd"/><label for="rememberPwd">记住密码</label>
					        	</span>
					        </div>
					        <div >
					        	<button type="button" onclick="subLogin()" class="layui-btn  btn-login"  style="width:150px">&nbsp;&nbsp;登　录&nbsp;&nbsp;</button>
					       		<button type="button" onclick="gotoregister()" class="layui-btn  btn-login"  style="width:150px">&nbsp;&nbsp;注     册&nbsp;&nbsp;</button>
						    </div> 
						 
						    <div class="formoperate" id="tishi" style="text-align: center;color: red;padding-top: 15px">
					     
					        		
					   
					        </div> 
						</div>
				</div>
			</div>
		</div>
		
		
		
		<div class="login-box" id="registerbox" style="height:480px;display:none;width:500px;margin-top:60px">
		    <!-- /.login-logo -->
			<div class="login"  id="main_login" >     
			   
				<div class="input_text" >   
					<div id="message"style="position:absolute;color:red;margin-top:-20px;margin-left:100px;" > </div>
				
				  	<!--<form  action="login.d" method="post" onsubmit="return validateLogin()"> -->
						<div class="content" >
							<div class="navbar-header">
					           	<div>
									<span style="font-family:'Britannic Bold', 'Britannic';color:#3BC5BB;">用户</span>
									<span style="font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#1D4474;"></span>
									<span style="font-family:'Segoe UI Emoji Bold', 'Segoe UI Emoji Normal', 'Segoe UI Emoji';color:#FF9A4C;">注册</span>
								</div>
					        </div>
					      
					        <div class="formitem">
					        	<span class="icon" style="width:100px">用户名</span>
					        	<span class="input" >
					        		<input id="regusername" name="regusername" value="" class="form-control l35" fv_type="NOTCN" type="text" maxlength="20" placeholder="请输入您的用户名" value=""  data-toggle="tooltip" data-placement="right">
					        	</span>
					        </div>
					            
					        <div class="formitem">
					        	<span class="icon" style="width:100px">密码</span>
					        	<span class="input">
					        		<input id="regpassword" name="regpassword" value="" class="form-control highlight_green l35" fv_type="NOTCN" type="password" maxlength="6" placeholder="请输入您的密码"  data-toggle="tooltip" data-placement="right">
					        	</span>
					        </div>
					        
					         <div class="formitem">
					        	<span class="icon" style="width:100px">确认密码</span>
					        	<span class="input">
					        		<input id="regpasswordCon" name="regpasswordCon" value="" class="form-control highlight_green l35" fv_type="NOTCN" type="password" maxlength="6" placeholder="请再次输入您的密码"  data-toggle="tooltip" data-placement="right">
					        	</span>
					        </div>
					        <div class="formitem">
					        	<span class="icon" style="width:100px">性别</span>
					        	<span class="input">
				
					        		<select id="regsex" name="regxex" class="form-control highlight_green l35" >
									  <option value ="0"  selected="selected">男</option>
									  <option value ="1">女</option>
									</select>
					        	</span>
					        </div>
					        <div class="formitem">
					        	<span class="icon" style="width:100px">年龄</span>
					        	<span class="input">
					        		<select id="regAge" name="regAge" class="form-control highlight_green l35" >
									 
									</select>
					        	</span>
					        </div>
					         <div class="formitem">
					        	<span class="icon" style="width:100px">邮箱</span>
					        	<span class="input">
					        		<input id="regEmial" name="regEmial" value="" class="form-control highlight_green l35" fv_type="NOTCN" type="text" placeholder="请输入您的邮箱地址"  data-toggle="tooltip" data-placement="right">
					        	</span>
					        </div>
					        <div >
					        	<button type="button" onclick="subReg()" class="layui-btn  btn-login"  style="width:150px">&nbsp;&nbsp;注      册&nbsp;&nbsp;</button>
					       		<button type="button" onclick="gotoLogin()" class="layui-btn  btn-login"  style="width:150px">&nbsp;&nbsp;返      回&nbsp;&nbsp;</button>
						    </div>  
						    <div class="formitem" id="zucetishi" style="text-align: center;color: red;padding-top: 15px">
					        
					        </div>
						</div>
				</div>
			</div>
		</div>
	</body>
</html>       
        
        
        
        
