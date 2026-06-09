# Unified Code Coverage Dashboard

Backend service for Unified Code Coverage Dashboard.

## Features

- Jenkins Integration
- Unified Coverage Report Upload
- Coverage Summary APIs
- Module Coverage APIs
- Sonar Metrics APIs
- Build History APIs
- Coverage Trend APIs
- Raw Report Storage
- PostgreSQL Persistence

## Tech Stack

- Java 21
- Spring Boot 3
- Maven
- PostgreSQL
- Hibernate/JPA
- Lombok

## Project Architecture

GitHub Push
→ Jenkins Pipeline
→ Unified JSON Report
→ Spring Boot Upload API
→ PostgreSQL
→ Dashboard APIs
→ React Frontend

## Run Locally

See docs/setup-guide.md

## API Documentation

See docs/api-reference.md