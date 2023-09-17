# Build

mvn clean install

# Dockerize 

sudo docker build -t <username>/proj2w5d3 .

# Run

sudo docker run -i -p 0.0.0.0:8080:9999 --link zkserver:zkserver --link mongoserver:mongoserver -t <username>/proj2w5d3 


