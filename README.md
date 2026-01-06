# Venue Microservice – VivahSetu

This microservice manages wedding venues in the VivahSetu platform.

## Features
- Create and manage wedding venues
- Search available venues by city
- JWT secured APIs
- Service discovery using Eureka
- Master Data validation using Feign Client

## Tech Stack
- Java 21
- Spring Boot 3
- Spring Data JPA
- MySQL
- Spring Security (OAuth2 Resource Server)
- Eureka Client
- OpenFeign

## API Endpoints
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | /venues | Create venue (ADMIN) |
| GET | /venues/available/{cityId} | Get available venues |

## How to Run
1. Start Eureka Server
2. Start Auth Service
3. Configure MySQL
4. Run `VenueServiceApplication`
