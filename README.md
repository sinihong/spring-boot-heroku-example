# spring-boot-heroku-example

A barebones Java app, which can easily be deployed to Heroku.  

This application support the [Getting Started with Java on Heroku](https://devcenter.heroku.com/articles/getting-started-with-java) article - check it out.

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/sinihong/spring-boot-heroku-example.git 
$ cd spring-boot-heroku-example
$ mvn install
$ foreman start web
```
Your app should now be running on [localhost:5000](http://localhost:5000/).

As a JPA sample, you can get the customer list on [localhost:5000/customers](http://localhost:5000/customers)
And add a customer by send POST request to [localhost:5000/customers](http://localhost:5000/customers) with 
````sh
$ curl -X POST -H "Content-Type: application/json" -d '{"firstName":"John","lastName":"Doe"}' http://localhost:8080/customers/
````

## Running from Eclipse
* Install maven eclipse plugin - m2e. (if you are a strong spring user, Spring Tool Suite is recommended which includes the m2e.)
* Import 'Existing Maven Project' and select the directory you clone.
* Run 'SampleApplication' as a Java Application or Spring Boot App if you installed Spring Tool Suite. 
Your app should now be running on [localhost:8080](http://localhost:8080/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)


