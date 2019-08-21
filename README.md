# Songr

## Overview
This is a Spring Boot application with a set of end points that are detailed below.

The application was intialized on [the Spring website](https://start.spring.io/);

## How to Run the Application
Clone the repo [here](https://github.com/hotandfresh/songr) and save it in a directory of your choice.  Open the application with an editor of your choice and hit the green arrow to run it.  Navigate to ```http://localhost:8080```

Additionally, after cloning the repo, the application can be run, from the root of the directory with the following terminal command: ```./gradlew run```

## End points
Add any of these endpoints to the end of the local host address.

```/``` : this is the home page

```/hello``` : this displays "Hello World"

```/capitalize/typeWhateverWordYouWantHere``` : this will capitalize a word.  Type any word into ```typeWhateverWordYouWantHere```

```/reverse```: this will return the default sentence, but in reversed order.

```/reverse?sentence=typeWhateverWordYouWantHere```: this will reverse any sentenced typed into ```typeWhateverWordYouWantHere```

```/albums```: This route will display all albums that have been added to the database.  Additionally, there's an option to add more albums.

As of August 21st, 2019:
 - Postgresql needs to be installed.  Login to psql Afterwards, create a db called ```songr```.  
 
 - Uncomment line 4 of application.properties. Replace ```spring.datasource.username``` and ```spring.datasource.password``` with your respective postgresql user name and password. 
 
 - Rebuild the application 
 
 - data needs to be added manually at the ```\albums``` endpoint.  Feel free to use this:

```
Title: California Girls
Artist: Katy Perry
Song Count: 10
Length: 500
Image Url: https://khuneva.files.wordpress.com/2012/02/california-girls.png
```

## Resources
Splitting a word on was found [here](https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space)