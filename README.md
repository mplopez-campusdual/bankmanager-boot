
# Ontimize Boot
- Enter the parent directory and run an install:
	
		mvn install

## Start the database

- Enter the `model` folder and execute the command

		mvn exec:java -Prun_database
	
## Start only the server: 
 - Go to the `boot` folder and run the command

		mvn spring-boot:run
		   
## Run the client alone, outside the spring-boot server

- Go to the `frontend/src/main/ngx` folder, if you have node and npm installed on your system run the following commands:

		npm install
		npm start 

## Client and server together
If you want to deploy the client and server together, run the following command 

	mvn clean install -Pdeploy
	
Use the following URL to access the https://localhost:8080/bankmanajer-jee/services/rest/app/index.html application 
