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


