# 1. Use an official Maven image with Java 17
FROM maven:3.8.5-openjdk-17

# 2. Install necessary dependencies for Chrome
RUN apt-get update && apt-get install -y \
    wget \
    gnupg \
    unzip \
    && wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list \
    && apt-get update && apt-get install -y google-chrome-stable \
    && apt-get clean

# 3. Set the working directory inside the container
WORKDIR /app

# 4. Copy your project files into the container
COPY . .

# 5. Run tests (Ensure your project uses WebDriverManager or you have a static path)
CMD ["mvn", "test"]