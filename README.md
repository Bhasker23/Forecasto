
# Forecasto - Weather API Integration with Spring Boot

This Spring Boot project integrates the Weather API from Rapid API and exposes RESTful APIs to retrieve weather forecast data for any city.

## Project Overview 🖥️

This project provides a simple backend server built with Spring Boot that integrates with the Weather API from Rapid API. It includes the following features:

- Header-based authentication with a random client ID and client secret.
- Exposes RESTful APIs to get the weather forecast summary and hourly forecast details of any city.
- Uses `RestTemplate` for making HTTP requests to the Weather API endpoints.

- **Project Deployment**:
   - The project is deployed on Railway app.
   - Deployed link: [forecasto-production.up.railway.app](forecasto-production.up.railway.app)


## Prerequisites 🛠️

Before running this project, make sure you have the following:

- Java Development Kit (JDK) 11 or higher installed.
- Maven installed (if you are not using an IDE that manages dependencies).

## Configuration ⚙️

- `application.properties`: Contains configuration properties such as Rapid API host, key, and API URLs.

## Project Structure

- `src/main/java`: Contains Java source code.
  - `com.forecasto`: Main package for the project.
    - `Forecasto.java`: Main Spring Boot application class.
    - `ForecastoConfig`: Contains configuration classes (`WeatherApiConfig.java`).
    - `ForecastoController`: Contains RESTful controller classes (`WeatherController.java`).
    - `ForecastoService`: Contains service classes (`WeatherApiService.java`).
- `src/main/resources`: Contains application properties and static resources.
  - `application.properties`: Configuration properties file.

## Dependencies

- Spring Boot Starter Web: For building web applications with Spring Boot.
- Spring Boot Starter Test: For testing Spring Boot applications (optional).
- Rapid API Java SDK: For integrating with the Weather API from Rapid API.


## Getting Started 📋🖋️

### 1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   ```

### 2. Navigate to the project directory:

   ```bash
   cd your-repo-name
   ```

### 3. Configure Rapid API credentials:

   - Open the `application.properties` file located in `src/main/resources` and replace the placeholders `your-rapidapi-host` and `your-rapidapi-key` with your actual Rapid API host and key.
   - To access the Rapid API, credentials (host and key) must be provided in the properties file.
   <p></p>
   
   ```bash
    spring.application.name=Forecasto
    rapidApi.host={add-your-host-Name}
    rapidApi.key={add-your-key}
    rapidApi.url.forecastSummary=https://forecast9.p.rapidapi.com/rapidapi/forecast/
    rapidApi.url.hourlyForecast=https://api.openweathermap.org/data/2.5/forecast?q=
    openWeatherApi.Key=1204d1db8a4c17b9fc0a1f4902ede7a6
   ```
### 4. Build the project:

   If you are using Maven, run the following command:

   ```bash
   mvn clean install
   ```

### 5. Run the project:

   ```bash
   mvn spring-boot:run
   ```

### 6. Access the APIs:

   Once the project is running, you can access the following endpoints:

  - **Forecast Summary**:
     - Endpoint: /weather/forecastSummary?location=Delhi
     - Example API URL: [forecasto-production.up.railway.app/weather/forecastSummary?location=Delhi](forecasto-production.up.railway.app/weather/forecastSummary?location=Delhi)
     - Description: Retrieves the forecast summary for a specific location (e.g., Delhi).

   - **Hourly Summary**:
     - Endpoint: /weather/hourlySummary?location=Delhi
     - Example API URL: [forecasto-production.up.railway.app/weather/hourlySummary?location=Delhi](forecasto-production.up.railway.app/weather/hourlySummary?location=Delhi)
     - Description: Retrieves the hourly forecast summary for a specific location (e.g., Delhi).

### 7. **Additional Information**:
   - Rapid API Free Tier Limit: Reacting to the free tier limit, you need to provide your Rapid API credentials (host and key) in the properties file for API access.

Please ensure that the Rapid API credentials are correctly configured in the properties file and replace "Delhi" with the desired location when making API requests.

## Contributing ✌

Contributions to this project are welcome. You can contribute by:

- Reporting issues or suggesting improvements through GitHub Issues.
- Forking the repository and creating pull requests for new features or bug fixes.

## License

This project is licensed under the [MIT License](LICENSE).
![Screenshot (1095)](https://github.com/Bhasker23/Forecasto/assets/101566187/e73f8318-1455-4014-a548-912eafbf4469)
![Screenshot (1097)](https://github.com/Bhasker23/Forecasto/assets/101566187/f08e8a1d-59a6-45a1-9f55-f88e51ee4772)


<h2>:man_technologist: Happy Coding :computer: :computer_mouse:</h2>

<h3>Design and Developed by Bhasker ❤️</h3>  
---
