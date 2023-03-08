How to run with docker

clone project from repo or download and unzip

from root of the project run: 

sudo docker build -t myimagename .

after build run it:

sudo docker run  -p 8080:8080 myimagename


test it with:

http://localhost:8080/listings?min_price=0.0081&max_price=0.15&min_min_cpm=1&max_min_cpm=2

all parameters are mandatory

also exposed http://localhost:8080/listingsAll 

thanks!