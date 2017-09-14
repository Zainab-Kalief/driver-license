<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>New Person</h2>
	<form:form method="POST" action="/person" modelAttribute="newPerson">
		<form:hidden path="id"/>
     <form:label path="firstName">First Name	
     	<form:errors path="firstName"/>
     	<form:input path="firstName"/>
     </form:label><br>
     
     <form:label path="lastName">Last Name
     	<form:errors path="lastName"/>
     	<form:input path="lastName"/>
     </form:label><br>
      <input type="submit" value="Create Person">
    </form:form> 
</body>
</html>