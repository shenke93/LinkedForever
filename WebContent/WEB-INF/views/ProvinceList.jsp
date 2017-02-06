<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Province List</title>
</head>
<body>
	<div align="center">
		<table width="80% border="1" style="border-collapse: collapse;">
			<tr>
				<th>No</th>
				<th>Province</th>
				<th>Country</th>
			</tr>
			<s:iterator value="listProvince" status="id">
				<tr>
					<td><s:property value="#id.count"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="country"/></td>	
				</tr>
			</s:iterator>
		</table>		
	</div>
</body>
</html>