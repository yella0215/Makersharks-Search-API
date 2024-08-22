# Makersharks Search API

## Project Overview

This is a Proof of Concept (POC) for the Makersharks Search API. The API allows buyers to search for manufacturers based on location, nature of business, and specific manufacturing capabilities.

## Prerequisites

- **Java 17+**
- **Maven 3.6+**
- **Spring Boot 3.x**

## Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_GITHUB_USERNAME/Makersharks-Search-API.git


2. **Navigate to the project directory:**
   ```bash
   cd Makersharks-Search-API
   ```

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### POST `/api/supplier/query`

This endpoint retrieves a list of manufacturers based on the following criteria:

- **Location:** The city where the manufacturer is located.
- **Nature of Business:** The type of business (small_scale, medium_scale, large_scale).
- **Manufacturing Process:** The process the manufacturer can perform (moulding, 3d_printing, casting, coating).

#### Request Body

```json
{
  "location": "India",
  "natureOfBusiness": "small_scale",
  "manufacturingProcess": "3d_printing"
}
```

#### Response

```json
[
  {
    "supplierId": "12345",
    "companyName": "Tech Manufacturers Ltd.",
    "website": "http://www.techmanu.com",
    "location": "India",
    "natureOfBusiness": "small_scale",
    "manufacturingProcesses": ["3d_printing", "moulding"]
  }
]
```

## Curl Commands

### Example: Querying Manufacturers

To query manufacturers located in India, with a small scale business nature and 3D printing capability, you can use the following curl command:

```bash
curl -X POST http://localhost:8080/api/supplier/query \
-H "Content-Type: application/json" \
-d '{
      "location": "India",
      "natureOfBusiness": "small_scale",
      "manufacturingProcess": "3d_printing"
    }'
```

## Testing

### Running Unit Tests

To run unit tests, execute the following command:

```bash
mvn test
```

## Documentation

API documentation is generated using **Swagger** and can be accessed at:

```
http://localhost:8080/swagger-ui.html
```

## Security Notes

- **Input Validation:** All inputs are validated to prevent SQL injection and other security vulnerabilities.
- **Exception Handling:** Proper exception handling is implemented to ensure secure API usage.
- 
### Conclusion

The Makersharks Search API is a robust solution for querying manufacturers based on specific criteria such as location, nature of business, and manufacturing capabilities. By following the steps outlined in this README, you can easily set up and run the API, as well as perform various queries using the provided curl commands. The implementation follows best practices in terms of input validation, exception handling, and security considerations.

This proof of concept demonstrates the potential for scalability and further enhancement, making it a strong foundation for future development. The project is well-documented and easily accessible through GitHub, ensuring that it can be extended or integrated into larger systems as needed.

Thank you for reviewing this submission, and I look forward to any feedback or further steps in the project development.
