# Run MySQL container
docker run --name mysql -e MYSQL_ROOT_PASSWORD=12345678 -e MYSQL_DATABASE=shop -p 3306:3306 -d mysql:latest

# Run Redis container
docker run --name redis -p 6379:6379 -d redis:latest
