How to run with docker

clone it from repo
from root of the project run: 
sudo docker build -t myprojectname .
after build run it:
sudo docker run  -p 8080:8080 myimagename



http://localhost:8080/listings?min_price=0.0081&max_price=0.15&min_min_cpm=1&max_min_cpm=2

all parameters are mandatory
also exposed http://localhost:8080/listingsAll 