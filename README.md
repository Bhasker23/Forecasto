# Weather API Integration with Spring Boot

This Spring Boot project integrates the Weather API from Rapid API and exposes RESTful APIs to retrieve weather forecast data for any city.

## Project Overview

This project provides a simple backend server built with Spring Boot that integrates with the Weather API from Rapid API. It includes the following features:

- Header-based authentication with a random client ID and client secret.
- Exposes RESTful APIs to get the weather forecast summary and hourly forecast details of any city.
- Uses `RestTemplate` for making HTTP requests to the Weather API endpoints.

## Prerequisites

Before running this project, make sure you have the following:

- Java Development Kit (JDK) 11 or higher installed.
- Maven installed (if you are not using an IDE that manages dependencies).

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```

2. Navigate to the project directory:

   ```bash
   cd your-repo-name
   ```

3. Configure Rapid API credentials:

   Open the `application.properties` file located in `src/main/resources` and replace the placeholders `your-rapidapi-host` and `your-rapidapi-key` with your actual Rapid API host and key.

4. Build the project:

   If you are using Maven, run the following command:

   ```bash
   mvn clean install
   ```

5. Run the project:

   ```bash
   mvn spring-boot:run
   ```

6. Access the APIs:

   Once the project is running, you can access the following endpoints:

   - GET `/weather/forecastSummary?location={city}`: Get the weather forecast summary for the specified city.
   - GET `/weather/hourlyForecast?location={city}`: Get the hourly weather forecast details for the specified city.

## Configuration

- `application.properties`: Contains configuration properties such as Rapid API host, key, and API URLs.

## Project Structure

- `src/main/java`: Contains Java source code.
  - `com.example.weatherapi`: Main package for the project.
    - `WeatherApiApplication.java`: Main Spring Boot application class.
    - `config`: Contains configuration classes (`WeatherApiConfig.java`).
    - `controller`: Contains RESTful controller classes (`WeatherController.java`).
    - `service`: Contains service classes (`WeatherApiService.java`).
- `src/main/resources`: Contains application properties and static resources.
  - `application.properties`: Configuration properties file.

## Dependencies

- Spring Boot Starter Web: For building web applications with Spring Boot.
- Spring Boot Starter Test: For testing Spring Boot applications (optional).
- Rapid API Java SDK: For integrating with the Weather API from Rapid API.

## Contributing

Contributions to this project are welcome. You can contribute by:

- Reporting issues or suggesting improvements through GitHub Issues.
- Forking the repository and creating pull requests for new features or bug fixes.

