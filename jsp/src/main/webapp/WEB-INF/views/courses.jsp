<html>
<body>
    <h2>Available Courses</h2>
    <c:forEach var="course" items="${courses}">
        ${course.name} - ${course.instructor} - ${course.credits} credits
        <form method="post" action="register/${course.id}">
            <input type="submit" value="Register"/>
        </form>
        <br/>
    </c:forEach>
</body>
</html>