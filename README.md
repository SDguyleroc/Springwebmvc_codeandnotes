@@ -1 +1,115 @@
# Springwebmvc_codeandnotes
# Springwebmvc notes:

## Introduction to spring Framework
* Helps build enterprise application with ease and quickly
* Supports Groovy and Kotlin
* works with multiple scenarios
* ### Spring privides modular components
    * Core
    * Data and Transactions
    * Web
    * Messaging
* #### Open source
* #### Keeps evolving with time
* #### Solid Online support
## Spring 6 features
* Based on Java 17 and above
* Works with Jakarta EE 9+: Servlet 5.0+, JPA 3.0+
    * Works with jakarta packages instead of javax packages
* Supports lastes web servers: omcat, Jetty, Untertow
* Compatible with virtual threadds (java 19)
    * Web app - single thread per request
    * Configure Spring apps ti use virtual threads

## Overview Of Spring MVC

* Web-based framework built on Servlet API
* Folows MVC design Pattern
    * #### M: Model

      Holds the data of your application      

    * ##### V: View
      
        Displays data in the user interface of your application on the browser
      the view does not have knownlege of how the data was prepared

    * ####  C: Controller

      Controller sits between the view and model the job of the of the controller is to intercept any incoming request from the view, and perform the neccessary application logic.
* Separation of concerns



## Spring MVC flow

### M: Model

Data Object class

### V: view 

which is in the form of HTML file/ or java server page (jsp)

### C: Controller

Spring controller class

## Why Spring MVC?

* Works on Spring framwork foundations
* Best for building modular web applications
* Flexible - not a lot of mandates
* Lets developers focus on business logic

## Project Development Overview 

* Build a Big Star Collectibles website
* All the stic files provided css, js static pages
* add code for various flows in the app
* Add HTML paes as needed

  ## Project Development Flow
  Will folow MVC Patttern

  UI -----> Controller ----> Data access ----> DB

                        |
                        |
                 Service/Business


## Spring Boot to create MVC Application
* Traditional Development vs. Spring Boot
* provides auto-configuration for spring MVC
* Based on Spring Framework
* Embedded servlet container
* Generate Spring Boot project:
spring Initializer website

## Overview of Thymelaf
* Server-side template enine
* Helps retain HTML template in your project development
* Can process HTML, XML, CSSS, JS and etc
* Modules Specifically for Spring framework

## Thymeleaf Capabilities
* Simple expressions
* Text operations
* Literals
* Arithmetic, boolean, comparison, equality, conditional

## Thymeleaf Standard Syntax
* variable expressions: ${...}
* Slection expressions: *{...}
* Link(URL) expressions: @{...}
* Fragment expressions: ~{...}

