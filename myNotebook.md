start to learn fron Ali youtube channel
https://www.youtube.com/@BoualiAli


Security        
Database
Payment


Spring:
    open source framework for java
        DI denpendecy inject
        IOC version control
        AOP aspect-orientend programming
    Spring Book extention of Spring
        embedded web server
        auto configuration

    Spring framwork architecture
    Date access
        JDBC
        ORM: like Jpa hibernate
        OXM: mapping framwork
        JMS: java messages service
        Transactions:
    WEB
        Servlet
        Web: Spring MVC
        Portlet
        WebSocket
    AOP Aspects Instrumentation Messaging
    Core Container
    Beans Core Context SpEL
    TEST

use spring initializr online create project

rest API
    representational state transfer application programming interface
    controller service repository

@Controller:
    get, post, put, delete
    start api/

Bean: -> ApplicationContext(inject Bean to diffrent Bean)
    @Bean @Component @Service @Repository @Controller

Always use contructor injection instead field injection

controller -> interface service(normal method) -> service(implements) -> repository(change to list, use list methods)
constructor autowired injection 

application file to config database: name, url, password, driver
use mysql
    hibernate
for the class to connect the database use @Entity and better give @Table

manipulate database in spring
    create the table with @Entity
    an interface tableService with the sql method all
    a tableRepository extends the Jpa repository @Repositry
    a classService implement the tableService @Service
        inject the tableRespository use the constructor 
        if methods not in Jpa repository, create the method in table repository with return type and name in table


Spring Security:
    http request send jwt token
    get the info from database
    validate or not 
    sent to security authentication
    go through servlet to controller
    http request -> filter(JwtAuthFilter)->JwtService || userDetailsService(validation jwtToken) ->Security(update) ->
    Servlet->controller

    the created table implements UserDetails
        The UserDetails object represents the authenticated user in the Spring Security framework and contains
        details such as the user’s username, password, authorities (roles), and additional attributes.
    In Spring Security, the UserDetailsService interface is a core component used for loading user-specific data. It is responsible for retrieving user information from a backend
        data source, such as a database or an external service, and returning an instance of the UserDetails interface.
    In the AuthenticationProvider you can check the username and password and return Authentication with your custom object in it. In the UserDetailsService you get 
    only the username and when you return the custom UserDeatails, the framework performs a check on the password.
    class JwtAuthenticationFilter extends OncePerRequestFilter
    every time the request send using this authentication jwt filter
    @NonNUll A common Spring annotation to declare that annotated elements cannot be null.

    40