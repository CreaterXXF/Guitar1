<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询条件</title>
<style type="text/css">
	.box{display:inline;}
</style>
</head>
<body>
<p>按条件查询吉他</p>
<form action="/show" method="post">
    <p>厂商：</p>
    <input type="text" name="builder" >
    <br>
    <p>模型：</p>
    <input type="text" name="model" >
    <p>类型：</p>
    <input type="text" name="type" >
    <p>背部材质：</p>
    <input type="text" name="backWood" >
    <p>顶部材质：</p>
    <input type="text" name="topWood" >
    <p></p>
    <input type="submit" value="提交">
</form>
</body>
</html>