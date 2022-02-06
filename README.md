# Food Ordering System - BYTE - Case Study (Spring Boot)
**Aravind Krishna R**

-----

## **Overview:**

Swagger UI - http://localhost:8083/swagger-ui.html

This project has 3 types of users:

- Admin
- Customer
- Restaurant

The **Admin** has the following functionalities: 

|**Functionality**|**HTTP Method**|**Endpoint**|
| - | - | - |
|Admin Login|POST|http://localhost:8083/login/admin|
|Create Customers|POST|http://localhost:8083/customers|
|Update Customers|PUT|http://localhost:8083/customers|
|View Customers|GET|http://localhost:8083/customers|
|View Customer by ID|GET|http://localhost:8083/customers/{username}|
|Delete Customers|DELETE|http://localhost:8083/customers/{username}|
|Create Restaurants|POST|http://localhost:8083/login/restaurant|
|Update Restaurants|PUT|http://localhost:8083/restaurants|
|View Restaurants|GET|http://localhost:8083/restaurants|
|View Restaurant by ID|GET|http://localhost:8083/restaurants/{restaurantId}|
|Delete Restaurants|DELETE|http://localhost:8083/restaurants/{restaurantId}|

The **Customer** has the following functionalities:

|**Functionality**|**HTTP Method**|**Endpoint**|
| - | - | - |
|Customer Login|POST|http://localhost:8083/login/customer|
|View food menu by Restaurant|GET|http://localhost:8083/restaurants/menu/{restaurantId}|
|View Categories|GET|http://localhost:8083/food/categories|
|View food menu by Category|GET|http://localhost:8083/food/categories/{category}|
|Place Order|POST|http://localhost:8083/restaurants/orders|
|View Orders|GET|http://localhost:8083/customers/orders/{customerUsername}|

The **Restaurant** has the following functionalities:

|**Functionality**|**HTTP Method**|**Endpoint**|
| - | - | - |
|Restaurant Login|POST|http://localhost:8083/login/restaurant|
|Add Food|POST|http://localhost:8083/restaurants/food|
|View food menu|GET|http://localhost:8083/restaurants/menu/{restaurantId}|
|Delete Food|DELETE|http://localhost:8083/restaurants/food/{foodId}|
|View Orders|GET|http://localhost:8083/restaurants/orders/{restaurantId}|
