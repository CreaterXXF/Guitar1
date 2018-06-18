<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>查询结果</title>
</head>
<body>
	<c:forEach items="${guitarList}" var="guitar">
    <p>吉他编号：${guitar.serialNumber}</p>
    <p>吉他厂商：${guitar.guitarSpec.builder}</p>
    <p>吉他模型：${guitar.guitarSpec.model}</p>
    <p>吉他类型：${guitar.guitarSpec.type}</p>
    <p>吉他背部材质：${guitar.guitarSpec.backWood}</p>
    <p>吉他顶部材质：${guitar.guitarSpec.topWood}</p>
    <p>吉他库存：${guitar.guitarSpec.numStrings}</p>
    <p>---------------------------------------  </p>
</c:forEach>

	
</body>
</html>