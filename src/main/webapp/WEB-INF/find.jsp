<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
	
<body>
	<h1><c:out value="${ person.person.firstName }"></c:out></h1>
	<p><c:out value="${ person.number }"></c:out></p>
	<p><c:out value="${ person.state }"></c:out></p>
	<p><c:out value="${ person.expirationDate }"></c:out></p>
</body>	
</html>