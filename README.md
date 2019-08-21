# Songr

## Overview
This is a Spring Boot application with a set of end points that are detailed below.

The application was intialized on [the Spring website](https://start.spring.io/);

## How to Run the Application
Clone the repo [here](https://github.com/hotandfresh/songr) and save it in a directory of your choice.  Open the application with an editor of your choice and hit the green arrow to run it.  Navigate to ```http://localhost:8080```

## End points
Add any of these endpoints to the end of the local host address.

```/``` : this is the home page

```/hello``` : this displays "Hello World"

```/capitalize/typeWhateverWordYouWantHere``` : this will capitalize a word.  Type any word into ```typeWhateverWordYouWantHere```

```/reverse```: this will return the default sentence, but in reversed order.

```/reverse?sentence=typeWhateverWordYouWantHere```: this will reverse any sentenced typed into ```typeWhateverWordYouWantHere```

```/albums```: This route will display all albums that have been added to the database.  Additionally, there's an option to add more albums.

## Resources
Splitting a word on was found [here](https://stackoverflow.com/questions/7899525/how-to-split-a-string-by-space)