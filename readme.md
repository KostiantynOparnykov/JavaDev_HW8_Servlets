### Module 8 homework "Servlets basics"

This is homework for Module 8 of Java Developer (14) GoIt course

This homework is about simple servlet application 
* `TimeServlet` when it is running on app server (such as TomCat) on `http://localhost:8080/time` suppose to response with local time and timezone in `UTC`. Also `TimeServlet` can take one `query` parameter `timezone`, and return time according to given timezone. 

* `TimezoneValidateFilter` is `WebFilter` that monitor `/time` request and validates `timezone` parameter in it. 
