Q What is docker ?
> Docker is a powerful platform for developing, shipping, and running applications in lightweight, portable containers
* 1. Containerization
     * Docker allows applications to be packaged with all their dependencies and configuration, making them portable and isolated.
* 2. Portability Across Environments
     * Docker containers can run consistently across different environments: development, testing, and production
* 3. Version Control and Rollbacks
     * Docker images are versioned, allowing developers to track changes and roll back to previous versions if needed.
* 4. Rapid Deployment and Scalability
     * Containers make it easy to scale applications up or down quickly based on demand

the top 10 essential Docker commands for managing containers, images, volumes, and networks:

1. docker run
   Starts a new container from a Docker image, with options to customize environment variables, ports, and volumes.
  ```
   docker run -d -p 80:80 --name mynginx nginx 
   ```
   This command runs an nginx container in detached mode, mapping port 80 on the host to port 80 on the container.
2. docker ps
   Lists running containers, showing details like container ID, name, image, and status.
   ```
   docker ps 
   ```
   To include stopped containers, use docker ps -a.
3. docker pull
   Downloads a Docker image from Docker Hub or another registry.
    ```
   docker pull ubuntu:latest
    ```
   This pulls the latest version of the ubuntu image from Docker Hub.
4. docker build
   Builds an image from a Dockerfile, allowing customization of images based on specific instructions.
    ```
   docker build -t myapp:1.0 .
    ```
   This command builds an image named myapp with tag 1.0 from the Dockerfile in the current directory.
5. docker exec
   Runs a command inside a running container, useful for accessing a container’s shell or running a one-time command.
    ```
   docker exec -it mynginx bash
    ```
   This command opens an interactive bash shell in the mynginx container.
6. docker stop and docker start
   Stops or starts a container by its name or ID.
    ```
   docker stop mynginx
   docker start mynginx
    ```
   These commands stop and start the mynginx container.
7. docker rm and docker rmi
   Removes containers (docker rm) or images (docker rmi).
    ```
   docker rm mynginx
   docker rmi nginx:latest
    ```
   The first command removes the container mynginx, and the second removes the nginx image.
8. docker logs
   Retrieves the logs of a container, useful for debugging or monitoring.
    ```
   docker logs mynginx
    ```
   This displays the logs for the mynginx container.
9. docker images
   Lists all Docker images on the host, showing details like repository, tag, image ID, and size.
    ```
   docker images
    ```
   This command provides an overview of available images on the system.
10. docker-compose up and docker-compose down
    Used with docker-compose.yml files to manage multi-container applications.
    ```
    docker-compose up -d
    docker-compose down
     ```
    The first command starts all services defined in a docker-compose.yml file in detached mode, while the second stops and removes them.