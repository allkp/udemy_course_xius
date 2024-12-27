<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>
	<c:out value="${10+30}" />
	<c:set var="name" value="${'Lokesh'}" scope="session" />
	<br />
	<c:out value="${name}" />
	<c:set var="score" value="${110}" scope="session" />
	<br />
	<c:if test="${score > 100}">
		<p>
			you made an Beautiful century :
			<c:out value="${score}" />
		</p>
	</c:if>
	<c:choose>
		<c:when test="${score >= 80}">A-Grade</c:when>
		<c:when test="${score >= 70}">B-Grade</c:when>
		<c:when test="${score >=60}">C-Grade</c:when>
		<c:otherwise>D-Grade</c:otherwise>
	</c:choose>
	<br />
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}" />
	</c:forEach>
	<br />

	<%
	List<String> stdNames = new ArrayList<>();
	stdNames.add("Lokesh");
	stdNames.add("Jagadish");
	stdNames.add("Prasad");
	stdNames.add("Teja");
	request.setAttribute("stdNames", stdNames);
	%>
	<c:forEach var="stdName" items="${stdNames}">
		<c:out value="${stdName}" />
		<br />
	</c:forEach>
	<br />
	<c:remove var="name" />
	<br /> After Removing :
	<c:out value="${name}" />

	<c:set var="balance" value="2000" />
	<fmt:parseNumber var="i" type="number" value="${balance}" />
	<p>
		Amount is :
		<c:out value="${i}"></c:out>
	</p>
	<br />

	<c:set var="amount" value="22999.9867" />
	<p>
		Formatted Number-1 :
		<fmt:formatNumber value="${amount}" type="currency" />
	</p>
	<p>
		Formatted Number-2 :
		<fmt:formatNumber value="${amount}" type="number"
			maxFractionDigits="2" />
	</p>
	<p>
		Formatted Number-3 :
		<fmt:formatNumber value="${amount}" type="number" maxIntegerDigits="2" />
	</p>
	<p>
		Formatted Number-4 :
		<fmt:formatNumber value="${amount}" type="percent" />
	</p>
	<p>
		Formatted Number-5 :
		<fmt:formatNumber value="${amount}" type="number" pattern="####.###$" />
	</p>

	<br />

	<c:set var="myDate" value="13-12-2024" />
	<fmt:parseDate var="parsedDate" value="${myDate}" pattern="dd-mm-yyyy" />
	<p>
		Parsed Date:
		<c:out value="${parsedDate}" />
	</p>


</body>
</html>