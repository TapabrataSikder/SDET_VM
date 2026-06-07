# 1. Use an official Maven image with Java 17
FROM maven:3.8.5-openjdk-17-slim

# Install dependencies for Microsoft Edge
RUN apt-get update && apt-get install -y \
    wget \
    gnupg \
    && wget -qO - https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > /usr/share/keyrings/microsoft.gpg \
    && echo "deb [arch=amd64 signed-by=/usr/share/keyrings/microsoft.gpg] https://packages.microsoft.com/repos/edge stable main" > /etc/apt/sources.list.d/microsoft-edge.list \
    && apt-get update && apt-get install -y microsoft-edge-stable \
    && apt-get clean

# 3. Set the working directory inside the container
WORKDIR /app

# 4. Copy your project files into the container
COPY . .

# 5. Run tests (Ensure your project uses WebDriverManager or you have a static path)
CMD ["mvn", "test"]