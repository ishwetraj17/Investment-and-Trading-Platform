# Investment and Trading Platform

## Overview
The **Investment and Trading Platform** is a microservices-based system designed to manage stock orders, transactions, and user accounts. The platform includes services for **Order Management**, **Stock Management**, **Transaction Processing**, and **User Management**. It uses **RabbitMQ** for message communication, **PostgreSQL** for data storage, and **Spring Boot** for service implementation.

## Features
- **Order Service**: Manages stock orders and validates stock availability.
- **Stock Service**: Handles stock details and availability.
- **Transaction Processing Service**: Processes financial transactions for orders.
- **User Service**: Manages user authentication and account details.

## Requirements
- Java 11 or higher
- PostgreSQL (local database)
- RabbitMQ (local message broker)

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ishwetraj17/investment-trading-platform.git
   cd investment-trading-platform
